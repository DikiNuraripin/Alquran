package com.example.alquran;

import java.io.Serializable;

public class Ricitations implements Serializable {
  private String name;
  private String audio_url;

    public Ricitations(String name, String audio_url) {
        this.name = name;
        this.audio_url = audio_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }
}
