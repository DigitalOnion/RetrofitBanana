package com.outerspace.retrofitbanana;

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

    public void start() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();



    }

    @Override
    public void onResponse(Call<PersonList> call, Response<PersonList> response) {

    }

    @Override
    public void onFailure(Call<PersonList> call, Throwable t) {

    }
}
