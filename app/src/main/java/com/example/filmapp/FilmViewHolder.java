package com.example.filmapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView titoloTextView;
    private TextView tipoTextView;
    private ImageView imageView;
    private Film film;

    public FilmViewHolder(View view){
        super(view);
        view.setOnClickListener(this);
        this.titoloTextView = view.findViewById(R.id.titoloTextView);
        this.tipoTextView = view.findViewById((R.id.tipoTextView));
        this.imageView = view.findViewById(R.id.imageView);
    }

    public void setFilm(Film film){
        this.film = film;
    }

    public TextView getTitoloTextView(){
        return titoloTextView;
    }

    public TextView getTipoTextView(){
        return tipoTextView;
    }

    public ImageView getImageView(){
        return imageView;
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext(), InfoActivity.class);
        i.putExtra("immagine", film.getImmagine());
        i.putExtra("titolo", film.getTitolo());
        i.putExtra("regista", film.getRegista());
        i.putExtra("anno", film.getAnno());
        i.putExtra("genere", film.getGenere());
        view.getContext().startActivity(i);
    }
}
