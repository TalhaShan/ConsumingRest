package com.example.consumingrest;

import pojos.Places;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PlacesApi {

    @GET("maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&types=atm&key=AIzaSyBr8qJJ7UmzQJ6CsiiUJgGyzQwj1TaQ34M")
    Call<Places> getPlaces();
}

