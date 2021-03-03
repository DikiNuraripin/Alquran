package com.example.alquran;

import java.io.Serializable;

public class VersesAyat implements Serializable {
    private int number;
    private String text;
    private String translation_id;

    public VersesAyat(int number, String text, String translation_id) {
        this.number = number;
        this.text = text;
        this.translation_id = translation_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTranslation_id() {
        return translation_id;
    }

    public void setTranslation_id(String translation_id) {
        this.translation_id = translation_id;
    }
}
