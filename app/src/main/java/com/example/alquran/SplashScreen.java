package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashScreen extends AppCompatActivity {
    String dapetNomor;
    ApiInterpace apiInterpace;
    Surah surahnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new AmbilData().execute();
    }

    private class AmbilData extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            final Intent intent=getIntent();
            dapetNomor=intent.getStringExtra("nomor");
            apiInterpace=Apiclient.ambilAyah().create(ApiInterpace.class);
            Call<Surah> call=apiInterpace.getSurah(dapetNomor);
            call.enqueue(new Callback<Surah>() {
                @Override
                public void onResponse(Call<Surah> call, Response<Surah> response) {
                    surahnya=response.body();
                    Intent intent1=new Intent(SplashScreen.this,MainActivity.class);
                    intent1.putExtra("datasurat",surahnya);
                    startActivity(intent1);
                    finish();

                }

                @Override
                public void onFailure(Call<Surah> call, Throwable t) {
                    Toast.makeText(SplashScreen.this,"gak dapet data",Toast.LENGTH_LONG).show();
                }
            });
            return null;
        }
    }
}