package com.example.alquran;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

public class PlayActivity extends AppCompatActivity {
    Surah surahdapet;
    List <VersesAyat> daftarAyat;
    RecyclerView rvnya;
    RecyclerView.LayoutManager layoutManager;
    AyahAdapter ayahAdapter;
    private MediaPlayer mediaPlayer;
    private int playbackPosition=0;
    Button btnPlay,btnStop;
    String urlSuara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        rvnya=(RecyclerView)findViewById(R.id.rv_ayat);
        Intent intent=getIntent();
        surahdapet= (Surah) intent.getSerializableExtra("surat");
        daftarAyat=surahdapet.getVerses();
        layoutManager=new LinearLayoutManager(this);
        rvnya.setLayoutManager(layoutManager);
        ayahAdapter = new AyahAdapter(daftarAyat,PlayActivity.this);
        rvnya.setAdapter(ayahAdapter);
        btnPlay=(Button)findViewById(R.id.imageView2);
        btnStop=(Button)findViewById(R.id.btn_stop);
        urlSuara=surahdapet.getRecitations().get(0).getAudio_url();
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    playAudio(urlSuara);
                    btnPlay.setBackgroundResource(R.drawable.pause);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer!=null){
                    mediaPlayer.stop();
                    playbackPosition=0;
                    btnPlay.setBackgroundResource(R.drawable.play);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        killMediaPlayer();
    }

    public void playAudio(String url) throws Exception{
        killMediaPlayer();
        mediaPlayer=new MediaPlayer();
        mediaPlayer.setDataSource(url);
        mediaPlayer.prepare();
        mediaPlayer.start();
    }

    private void killMediaPlayer() {
        if(mediaPlayer!=null){
            try {
                mediaPlayer.release();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}