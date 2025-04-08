package com.example.filmapp;

import java.util.ArrayList;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Film film0 = new Film(R.drawable.ritorno_al_futuro, "Ritorno al futuro", "Film", "Robert Zemeckis", 1985, "Fantascienza");
        Film film1 = new Film(R.drawable.breaking_bad, "Breaking bad", "Serie TV", "Vince Gilligan", 2008, "Thriller");
        Film film2 = new Film(R.drawable.interstellar, "Interstellar", "Film", "Christopher Nolan", 2014, "Fantascienza");
        Film film3 = new Film(R.drawable.la_regina_degli_scacchi, "La regina degli scacchi", "Serie TV", "Scott Frank", 2020, "Drammatico");
        Film film4 = new Film(R.drawable.the_residence, "The Residence", "Serie TV", "Jaffar Mahmood", 2025, "Mistery");


        ArrayList<Film> films = new ArrayList<Film>(5);
        films.add(film0);
        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);

        RecyclerView recyclerView = findViewById(R.id.filmRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FilmAdapter(films));
    }
}