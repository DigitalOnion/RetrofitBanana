package com.outerspace.retrofitbanana;

import com.outerspace.retrofitbanana.model.PersonList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RandomUserApi {

    // https://randomuser.me/api/?results=4&nat=us&exc=login,picture&noinfo
    @GET("api")
    Call<PersonList> call(@Query("results") int results,
                          @Query("nat") String nat,
                          @Query("inc") String inc,
                          @Query("exc") String exc,
                          @Query("noinfo") Boolean noinfo);
}
