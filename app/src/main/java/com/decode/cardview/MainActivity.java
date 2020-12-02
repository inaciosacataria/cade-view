package com.decode.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.decode.cardview.Adapter.Adapter;
import com.decode.cardview.Models.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Post>p= new ArrayList<Post>();
    RecyclerView recyclerView;
    ImageView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        criarFilmes();
    recyclerView= findViewById(R.id.recycleView);
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);

    //criar adapter e definir
        Adapter adapter= new Adapter(p);
        recyclerView.setAdapter(adapter);
    }

    public void  criarFilmes(){


        int [] img= {R.drawable.imagem1,R.drawable.imagem4,R.drawable.imagem2,R.drawable.imagem3};
        Post p1 = new Post("Olivia Carlos","viajando para #Dubai","25 minutes ago",img[0]);

        Post p2 = new Post("Loni Derk","#Paris, cidade do amor","1 hour ago",img[1]);


        Post p3 = new Post("Inacio Sacataria","#Thats my App","17 hours ago",img[2]);


        Post p4 = new Post("Jessica Jose","#Aventura nas montanhas","1 day ago",img[3]);

        Post p5 = new Post("Olivia Carlos","viajando para #Dubai","25 minutes ago",img[0]);

        Post p6 = new Post("Loni Derk","#Paris, cidade do amor","1 hour ago",img[1]);

        Post p7 = new Post("Inacio Sacataria","#Thats my App","17 hours ago",img[2]);



        Post p8 = new Post("Jessica Jose","#Aventura nas montanhas","1 day ago",img[3]);


        p.add(p1);p.add(p2);p.add(p3);p.add(p4);p.add(p5);p.add(p6);p.add(p7);p.add(p8);



    }
}
