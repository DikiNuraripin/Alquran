package com.example.alquran;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AyahAdapter extends RecyclerView.Adapter<AyahAdapter.AyahHolder>{
    List <VersesAyat>ayats;
    Activity activity;

    public AyahAdapter(List<VersesAyat> ayats, Activity activity) {
        this.ayats = ayats;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AyahHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.playactivity,parent,false);
        return new AyahHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AyahHolder holder, int position) {
        int i=ayats.get(position).getNumber();
        holder.txtNumber.setText(Integer.toString(i));
        holder.txtText.setText(ayats.get(position).getText());
        holder.txtTranslationId.setText(ayats.get(position).getTranslation_id());

    }

    @Override
    public int getItemCount() {
        return ayats.size();
    }

    static class AyahHolder extends RecyclerView.ViewHolder {
        TextView txtNumber,txtText,txtTranslationId;

        public AyahHolder(@NonNull View itemView) {
            super(itemView);
            txtNumber=(TextView)itemView.findViewById(R.id.txt_Number);
            txtText=(TextView)itemView.findViewById(R.id.txt_Text);
            txtTranslationId=(TextView)itemView.findViewById(R.id.txt_Translation_id);
        }
    }
}
