package com.example.consumingrest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;

import pojos.Places;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Spinner sp1;
    ListView lView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.sp1);
        lView1 = findViewById(R.id.view1);
    }

    public void getplaces(View view) {

        Retrofit r = new Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
                final PlacesApi places = r.create(PlacesApi.class); //interface implementation

        Call<Places> call =places.getPlaces();
        call.enqueue(new Callback<Places>() {
            @Override
            public void onResponse(Call<Places> call, Response<Places> response) {

                Places places_ = response.body();
                lView1.setAdapter(new MyAdapter(MainActivity.this,places_));
            }

            @Override
            public void onFailure(Call<Places> call, Throwable t) {


            }
        });

    }
}
