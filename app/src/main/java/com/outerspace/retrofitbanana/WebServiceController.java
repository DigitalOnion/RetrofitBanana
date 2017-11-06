package com.outerspace.retrofitbanana;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.outerspace.retrofitbanana.model.PersonList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServiceController implements Callback<PersonList> {

    private static final String BASE_URL = "https://randomuser.me";
    private WebServiceEvents eventHandler;

    public WebServiceController(WebServiceEvents eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void start() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RandomUserApi api = retrofit.create(RandomUserApi.class);

        Call<PersonList> call = api.call(10, "us", null, "login,picture", true);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<PersonList> call, Response<PersonList> response) {
        if(response.isSuccessful()) {
            eventHandler.onSuccess(response.body());
        }
        else {
            eventHandler.onFailure("Response not successful with code:" + response.code());
        }
    }

    @Override
    public void onFailure(Call<PersonList> call, Throwable t) {
        String s = "Web request <" + call.request().toString() + "> failed\n" +
            "with message: " + t.getMessage();
        eventHandler.onFailure(s);
    }
}
