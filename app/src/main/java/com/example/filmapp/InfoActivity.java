package com.example.filmapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        int immagine = getIntent().getIntExtra("immagine", -1);
        String titolo = getIntent().getStringExtra("titolo");
        String regista = getIntent().getStringExtra("regista");
        String anno = getIntent().getIntExtra("anno", -1) + "";
        String genere = getIntent().getStringExtra("genere");

        ImageView immagineV = findViewById(R.id.infoImageView);
        TextView titoloT = findViewById(R.id.infoTitoloTextView);
        TextView registaT = findViewById(R.id.inserisciRegistaTextView);
        TextView annoT = findViewById(R.id.inserisciAnnoTextView);
        TextView genereT = findViewById(R.id.inserisciGenereTextView);

        immagineV.setImageResource(immagine);
        titoloT.setText(titolo);
        registaT.setText(regista);
        annoT.setText(anno);
        genereT.setText(genere);
    }

    public void indietroButtonClicked(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}