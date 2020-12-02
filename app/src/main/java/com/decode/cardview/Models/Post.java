package com.decode.cardview.Models;

import android.widget.ImageView;

public class Post {
    String nome;
    String post;
    String hora;
    int imagePost;


    public Post(String nome, String post, String hora, int imagePost) {
        this.nome = nome;
        this.post = post;
        this.hora = hora;
        this.imagePost = imagePost;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getImagePost() {
        return imagePost;
    }

    public void setImagePost(int imagePost) {
        this.imagePost = imagePost;
    }
}
