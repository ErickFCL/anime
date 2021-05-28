package com.example.anime.adapter;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.example.anime.R;
import com.example.anime.SecondActivity;
import com.example.anime.entities.Contacto;
import com.squareup.picasso.Picasso;
import java.util.List;

public class ContactoAnimeAdapter extends RecyclerView.Adapter<ContactoAnimeAdapter.PalabraViewHolder>{
    List<Contacto> contactos;
    public ContactoAnimeAdapter(List<Contacto> contactos) {
        this.contactos = contactos;
    }
    @Override
    public PalabraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacto,parent,false); //contruye una mini activity

        return new PalabraViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ContactoAnimeAdapter.PalabraViewHolder holder, int position) {
        View view = holder.itemView;

        Contacto contacto = contactos.get(position);//ontener el elemeneto actual

        TextView tvNombre = view.findViewById(R.id.tvName);
        TextView tvNumero = view.findViewById(R.id.tvNumero);
        ImageView iv = view.findViewById(R.id.ivAvatar);
        Button favorito = view.findViewById(R.id.btnSMS);
        //for(int i=1; i<=10;i++){

        //}
       // iv.setImageResource(R.drawable.anime1);

       // Picasso.get().load(contacto.foto).into(iv);
        Picasso.get().load(R.drawable.anime1).into(iv);
        tvNombre.setText(contacto.Nombre);
        tvNumero.setText(contacto.Numero);


    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class PalabraViewHolder extends  RecyclerView.ViewHolder{

        public PalabraViewHolder(View itemView) {
            super(itemView);
        }
    }
}
