package com.example.filmapp;

public class Film {
    int immagine;
    String titolo;
    String tipo;
    String regista;
    int anno;
    String genere;

    public Film(int immagine, String titolo, String tipo, String regista, int anno, String genere){
        this.immagine = immagine;
        this.titolo = titolo;
        this.tipo = tipo;
        this.regista = regista;
        this.anno = anno;
        this.genere = genere;
    }

    public int getImmagine(){
        return immagine;
    }

    public String getTitolo(){
        return titolo;
    }

    public String getRegista(){
        return regista;
    }

    public int getAnno(){
        return anno;
    }

    public String getGenere(){
        return genere;
    }
}
