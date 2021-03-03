package com.example.alquran;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SurahAdafter extends RecyclerView.Adapter<SurahAdafter.SurahHolder> {
    


    @NonNull
    @Override
    public SurahHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SurahHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class SurahHolder extends RecyclerView.ViewHolder {
        TextView txtSurah,txtAr,txtJumlahAyat,txtNumberOfSurah,txtId,txtType;

        public SurahHolder(@NonNull View itemView) {
            super(itemView);
            txtSurah=(TextView)itemView.findViewById(R.id.txt_Surah);
            txtAr=(TextView)itemView.findViewById(R.id.txt_Ar);
            txtJumlahAyat=(TextView)itemView.findViewById(R.id.txt_JumlahAyat);
            txtNumberOfSurah=(TextView)itemView.findViewById(R.id.txt_NumberOfSurah);
            txtId=(TextView)itemView.findViewById(R.id.txt_Id);
            txtType=(TextView)itemView.findViewById(R.id.txt_Type);
        }
    }

}
