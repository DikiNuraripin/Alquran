package com.example.alquran;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiclient {
    private static final String BASE_URL="https://raw.githubusercontent.com/penggguna/QuranJSON/master/";
    private static Retrofit retrofitnya;
    public static Retrofit ambilAyah(){
        if (retrofitnya==null){
            retrofitnya=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofitnya;
    }
}
