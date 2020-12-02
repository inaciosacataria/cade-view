package com.decode.cardview.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.decode.cardview.Models.Post;
import com.decode.cardview.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    List<Post>p;
    public Adapter(List<Post> post ) {
     p=  post;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_de_post,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Post post= p.get(position);
        holder.txtNomeUsuario.setText(post.getNome()+"");
        holder.txtPostagem.setText(post.getPost()+"");
        holder.txtHora.setText(post.getHora()+"");
        holder.imgPost.setImageResource(post.getImagePost());
    }

    @Override
    public int getItemCount() {
        return p.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtNomeUsuario, txtPostagem,txtHora;
        ImageView imgPost;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtHora=itemView.findViewById(R.id.txtHora);
            txtPostagem=itemView.findViewById(R.id.txtPostagem);
            txtNomeUsuario=itemView.findViewById(R.id.txtNome);
            imgPost=itemView.findViewById(R.id.imgView);
        }
    }
}
