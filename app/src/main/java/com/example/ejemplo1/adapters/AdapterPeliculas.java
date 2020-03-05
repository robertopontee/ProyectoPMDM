package com.example.ejemplo1.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejemplo1.R;
import com.example.ejemplo1.entidades.Pelicula;


import org.w3c.dom.Text;

import java.util.List;

public class AdapterPeliculas extends RecyclerView.Adapter<AdapterPeliculas.MiViewHolder> {
    private List<Pelicula> peliculas;
    private Context context;

    public AdapterPeliculas(Context context, List<Pelicula> peliculas) {
        this.peliculas = peliculas;
        this.context = context;


    }


    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        MiViewHolder vh = new MiViewHolder(vista);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        Pelicula p = peliculas.get(position);
        holder.tvTituloPelicula.setText(p.getTituloPelicula());
        holder.tvGeneroPelicula.setText(p.getGenero());
        holder.tvEdadPelicula.setText(Integer.toString(p.getEdad()));
        holder.swVisto.setChecked(p.isVisto());
        holder.ivFoto.setImageResource(p.getImagen());


    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {

        TextView tvTituloPelicula;
        TextView tvGeneroPelicula;
        TextView tvEdadPelicula;
        Switch swVisto;
        ImageView ivFoto;


        public MiViewHolder(@NonNull View itemView){
            super(itemView);
            tvTituloPelicula = itemView.findViewById(R.id.tvTituloPelicula);
            tvGeneroPelicula = itemView.findViewById(R.id.tvGeneroPelicula);
            tvEdadPelicula = itemView.findViewById(R.id.tvEdadRecomendada);
            swVisto = itemView.findViewById(R.id.swPelicula);
            ivFoto = itemView.findViewById(R.id.imageView);

        }
    }
}

