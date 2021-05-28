package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.anime.adapter.ContactoAnimeAdapter;
import com.example.anime.entities.Contacto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lista);
        List<Contacto> contactos = GetContactos();

        RecyclerView rv = findViewById(R.id.rvPalabra);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));//configuramos
        ContactoAnimeAdapter adapter = new ContactoAnimeAdapter(contactos);
        rv.setAdapter(adapter);
    }
    public List<Contacto> GetContactos(){
        List<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Naruto","111111111","anime1"));
        contactos.add(new Contacto("Sasuke","22222222","anime2"));
        contactos.add(new Contacto("Sakura","333333333","anime3"));
        contactos.add(new Contacto("Goku","44444444","anime4"));
        contactos.add(new Contacto("Gohan","5555555555","anime5"));
        contactos.add(new Contacto("Vageta","6666666666","anime6"));
        contactos.add(new Contacto("Bulma","777777777","anime7"));
        contactos.add(new Contacto("Krilin","88888888","anime8"));
        contactos.add(new Contacto("Yancha","9999999","anime9"));
        contactos.add(new Contacto("Picoro","1010101010","anime10"));


        return contactos;
    }
}