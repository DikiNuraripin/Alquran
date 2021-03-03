package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView txtSurah,txtAr,txtJumlahAyat,txtNumberOfSurah,txtId,txtType;
Button btnIqro;
Surah surahnya;
String dapetNomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSurah=(TextView)findViewById(R.id.txt_Surah);
        txtAr=(TextView)findViewById(R.id.txt_Ar);
        txtJumlahAyat=(TextView)findViewById(R.id.txt_JumlahAyat);
        txtNumberOfSurah=(TextView)findViewById(R.id.txt_NumberOfSurah);
        txtId=(TextView)findViewById(R.id.txt_Id);
        txtType=(TextView)findViewById(R.id.txt_Type);
        btnIqro=(Button)findViewById(R.id.btn_Iqra);
        Intent terima=getIntent();
        surahnya= (Surah) terima.getSerializableExtra("datasurat");


                txtSurah.setText(surahnya.getName());
                txtAr.setText(surahnya.getName_translations().getAr());
                txtId.setText(surahnya.getName_translations().getId());
                txtType.setText(surahnya.getType());
                int a;
                a=surahnya.getNumber_of_ayah();
                txtJumlahAyat.setText(Integer.toString(a));
                int b;
                b=surahnya.getNumber_of_surah();
                txtNumberOfSurah.setText(Integer.toString(b));

        btnIqro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirim=new Intent(MainActivity.this,PlayActivity.class);
                kirim.putExtra("surat",surahnya);
                startActivity(kirim);
            }
        });


    }
}