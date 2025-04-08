package com.example.filmapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmViewHolder>{
    private ArrayList<Film> films;

    public FilmAdapter(ArrayList<Film> films){
        this.films = films;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewholder_film, parent, false);
        FilmViewHolder filmViewHolder = new FilmViewHolder(view);
        return filmViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.getTitoloTextView().setText(films.get(position).titolo);
        holder.getTipoTextView().setText(films.get(position).tipo);
        holder.getImageView().setImageResource(films.get(position).immagine);
        holder.setFilm(films.get(position));
    }

    @Override
    public int getItemCount() {
        return this.films.size();
    }
}
