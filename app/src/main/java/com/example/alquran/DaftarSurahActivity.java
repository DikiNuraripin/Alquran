package com.example.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarSurahActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,
            btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,
            btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,
            btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,
            btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49,btn50,
            btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,btn59,btn60,
            btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn68,btn69,btn70,
            btn71,btn72,btn73,btn74,btn75,btn76,btn77,btn78,btn79,btn80,
            btn81,btn82,btn83,btn84,btn85,btn86,btn87,btn88,btn89,btn90,
            btn91,btn92,btn93,btn94,btn95,btn96,btn97,btn98,btn99,btn100,
            btn101,btn102,btn103,btn104,btn105,btn106,btn107,btn108,btn109,btn110,
            btn111,btn112,btn113,btn114;
    String json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_surah);
        btn1=(Button)findViewById(R.id.btn_AlFatihah);
        btn2=(Button)findViewById(R.id.btn_AlBaqarah);
        btn3=(Button)findViewById(R.id.btn_AliImran);
        btn4=(Button)findViewById(R.id.btn_AnNisa);
        btn5=(Button)findViewById(R.id.btn_AlMaidah);
        btn6=(Button)findViewById(R.id.btn_AlAnam);
        btn7=(Button)findViewById(R.id.btn_AlAraf);
        btn8=(Button)findViewById(R.id.btn_AlAnfal);
        btn9=(Button)findViewById(R.id.btn_AtTaubah);
        btn10=(Button)findViewById(R.id.btn_Yunus);
        btn11=(Button)findViewById(R.id.btn_Hud);
        btn12=(Button)findViewById(R.id.btn_Yusuf);
        btn13=(Button)findViewById(R.id.btn_ArRad);
        btn14=(Button)findViewById(R.id.btn_Ibrahim);
        btn15=(Button)findViewById(R.id.btn_AlHijr);
        btn16=(Button)findViewById(R.id.btn_AnNahl);
        btn17=(Button)findViewById(R.id.btn_AlIsra);
        btn18=(Button)findViewById(R.id.btn_AlKahf);
        btn19=(Button)findViewById(R.id.btn_Maryam);
        btn20=(Button)findViewById(R.id.btn_Taha);
        btn21=(Button)findViewById(R.id.btn_AlAnbiya);
        btn22=(Button)findViewById(R.id.btn_AlHajj);
        btn23=(Button)findViewById(R.id.btn_AlMuminun);
        btn24=(Button)findViewById(R.id.btn_AnNur);
        btn25=(Button)findViewById(R.id.btn_AlFurqan);
        btn26=(Button)findViewById(R.id.btn_AsySyuara);
        btn27=(Button)findViewById(R.id.btn_AnNaml);
        btn28=(Button)findViewById(R.id.btn_AlQasas);
        btn29=(Button)findViewById(R.id.btn_AlAnkabut);
        btn30=(Button)findViewById(R.id.btn_ArRum);
        btn31=(Button)findViewById(R.id.btn_Luqman);
        btn32=(Button)findViewById(R.id.btn_AsSajdah);
        btn33=(Button)findViewById(R.id.btn_AlAhzab);
        btn34=(Button)findViewById(R.id.btn_Saba);
        btn35=(Button)findViewById(R.id.btn_Fatir);
        btn36=(Button)findViewById(R.id.btn_Yasin);
        btn37=(Button)findViewById(R.id.btn_AsSaffat);
        btn38=(Button)findViewById(R.id.btn_Sad);
        btn39=(Button)findViewById(R.id.btn_AzZumar);
        btn40=(Button)findViewById(R.id.btn_Gafir);
        btn41=(Button)findViewById(R.id.btn_Fussilat);
        btn42=(Button)findViewById(R.id.btn_AsySyura);
        btn43=(Button)findViewById(R.id.btn_AzZukhruf);
        btn44=(Button)findViewById(R.id.btn_AdDukhan);
        btn45=(Button)findViewById(R.id.btn_Aljasiyah);
        btn46=(Button)findViewById(R.id.btn_AlAhqaf);
        btn47=(Button)findViewById(R.id.btn_Muhammad);
        btn48=(Button)findViewById(R.id.btn_AlFath);
        btn49=(Button)findViewById(R.id.btn_AlHujurat);
        btn50=(Button)findViewById(R.id.btn_Qaf);
        btn51=(Button)findViewById(R.id.btn_AzZariyat);
        btn52=(Button)findViewById(R.id.btn_AtTur);
        btn53=(Button)findViewById(R.id.btn_AnNajm);
        btn54=(Button)findViewById(R.id.btn_AlQamar);
        btn55=(Button)findViewById(R.id.btn_ArRahman);
        btn56=(Button)findViewById(R.id.btn_AlWaqiah);
        btn57=(Button)findViewById(R.id.btn_AlHadid);
        btn58=(Button)findViewById(R.id.btn_AlMujadalah);
        btn59=(Button)findViewById(R.id.btn_AlHasyr);
        btn60=(Button)findViewById(R.id.btn_AlMumtahanah);
        btn61=(Button)findViewById(R.id.btn_AsShaff);
        btn62=(Button)findViewById(R.id.btn_AlJumuah);
        btn63=(Button)findViewById(R.id.btn_AlMunafiqun);
        btn64=(Button)findViewById(R.id.btn_AtTagabun);
        btn65=(Button)findViewById(R.id.btn_AtTalaq);
        btn66=(Button)findViewById(R.id.btn_AtTahrim);
        btn67=(Button)findViewById(R.id.btn_AlMulk);
        btn68=(Button)findViewById(R.id.btn_AlQalam);
        btn69=(Button)findViewById(R.id.btn_AlHaqqah);
        btn70=(Button)findViewById(R.id.btn_AlMaarij);
        btn71=(Button)findViewById(R.id.btn_Nuh);
        btn72=(Button)findViewById(R.id.btn_AlJin);
        btn73=(Button)findViewById(R.id.btn_AlMuzzammil);
        btn74=(Button)findViewById(R.id.btn_AlMudasir);
        btn75=(Button)findViewById(R.id.btn_AlQiyamah);
        btn76=(Button)findViewById(R.id.btn_AlInsan);
        btn77=(Button)findViewById(R.id.btn_AlMusalat);
        btn78=(Button)findViewById(R.id.btn_AnNaba);
        btn79=(Button)findViewById(R.id.btn_AnNaziat);
        btn80=(Button)findViewById(R.id.btn_Abasa);
        btn81=(Button)findViewById(R.id.btn_AtTakwir);
        btn82=(Button)findViewById(R.id.btn_AlInfitar);
        btn83=(Button)findViewById(R.id.btn_AlMutaffifin);
        btn84=(Button)findViewById(R.id.btn_AlInsiqaq);
        btn85=(Button)findViewById(R.id.btn_AlBuruj);
        btn86=(Button)findViewById(R.id.btn_AtTariq);
        btn87=(Button)findViewById(R.id.btn_AlAla);
        btn88=(Button)findViewById(R.id.btn_AlGasyiyah);
        btn89=(Button)findViewById(R.id.btn_AlFajr);
        btn90=(Button)findViewById(R.id.btn_AlBalad);
        btn91=(Button)findViewById(R.id.btn_AsySyam);
        btn92=(Button)findViewById(R.id.btn_AlLail);
        btn93=(Button)findViewById(R.id.btn_AdDuha);
        btn94=(Button)findViewById(R.id.btn_AsSyarh);
        btn95=(Button)findViewById(R.id.btn_AtTin);
        btn96=(Button)findViewById(R.id.btn_AlAlaq);
        btn97=(Button)findViewById(R.id.btn_AlQadar);
        btn98=(Button)findViewById(R.id.btn_AlBayyinah);
        btn99=(Button)findViewById(R.id.btn_AlZalzalah);
        btn100=(Button)findViewById(R.id.btn_AlAdiyat);
        btn101=(Button)findViewById(R.id.btn_AlQariah);
        btn102=(Button)findViewById(R.id.btn_AtTakasur);
        btn103=(Button)findViewById(R.id.btn_AlAsyr);
        btn104=(Button)findViewById(R.id.btn_AlHumazah);
        btn105=(Button)findViewById(R.id.btn_AlFil);
        btn106=(Button)findViewById(R.id.btn_Quraisyi);
        btn107=(Button)findViewById(R.id.btn_AlMaun);
        btn108=(Button)findViewById(R.id.btn_AlKausar);
        btn109=(Button)findViewById(R.id.btn_AlKafirun);
        btn110=(Button)findViewById(R.id.btn_AnNasr);
        btn111=(Button)findViewById(R.id.btn_AlLahab);
        btn112=(Button)findViewById(R.id.btn_AlIkhlas);
        btn113=(Button)findViewById(R.id.btn_AlFalaq);
        btn114=(Button)findViewById(R.id.btn_AnNas);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="1.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="2.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="3.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="4.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="5.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="6.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="7.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="8.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="9.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="10.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="11.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="12.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="13.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="14.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="15.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="16.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="17.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="18.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="19.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="10.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="21.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="22.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="23.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="24.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="25.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="26.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="27.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="28.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="29.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="30.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="31.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="32.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="33.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="34.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="35.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="36.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="37.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="38.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="39.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="40.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="41.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="42.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="43.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="44.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="45.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="46.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="47.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="48.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="49.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="50.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="51.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="52.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="53.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="54.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="55.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="56.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="57.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="58.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="59.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="60.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="61.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="62.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="63.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="64.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="65.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="66.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="67.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="68.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="69.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="70.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="71.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="72.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="73.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="74.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="75.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="76.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="77.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="78.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="79.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="80.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="81.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="82.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="83.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="84.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="85.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="86.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="87.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="88.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="89.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="90.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="91.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="92.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="93.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="94.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="95.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="96.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="97.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="98.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="99.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="100.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="101.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="102.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="103.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="104.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="105.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="106.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="107.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="108.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="109.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="110.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="111.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="112.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="113.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });
        btn114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                json="114.json";
                Intent pindah=new Intent(DaftarSurahActivity.this,SplashScreen.class);
                pindah.putExtra("nomor",json);
                startActivity(pindah);
            }
        });


    }
}