
package com.example.alquran;

import java.io.Serializable;

public class Translite implements Serializable {
    private String ar;
    private String id;

    public Translite(String ar, String id) {
        this.ar = ar;
        this.id = id;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
