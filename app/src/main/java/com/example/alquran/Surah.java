package com.example.alquran;

import java.io.Serializable;
import java.util.List;

public class Surah implements Serializable {
    private String name;
    private Translite name_translations;
    private int number_of_ayah;
    private int number_of_surah;
    private List<VersesAyat> verses;
    private List<Ricitations> recitations;
    private String type;

    public Surah(String name, Translite name_translations, int number_of_ayah, int number_of_surah, List<VersesAyat> verses, List<Ricitations> recitations, String type) {
        this.name = name;
        this.name_translations = name_translations;
        this.number_of_ayah = number_of_ayah;
        this.number_of_surah = number_of_surah;
        this.verses = verses;
        this.recitations = recitations;
        this.type = type;
    }

    public List<Ricitations> getRecitations() {
        return recitations;
    }

    public void setRecitations(List<Ricitations> recitations) {
        this.recitations = recitations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Translite getName_translations() {
        return name_translations;
    }

    public void setName_translations(Translite name_translations) {
        this.name_translations = name_translations;
    }

    public int getNumber_of_ayah() {
        return number_of_ayah;
    }

    public void setNumber_of_ayah(int number_of_ayah) {
        this.number_of_ayah = number_of_ayah;
    }

    public int getNumber_of_surah() {
        return number_of_surah;
    }

    public void setNumber_of_surah(int number_of_surah) {
        this.number_of_surah = number_of_surah;
    }

    public List<VersesAyat> getVerses() {
        return verses;
    }

    public void setVerses(List<VersesAyat> verses) {
        this.verses = verses;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}