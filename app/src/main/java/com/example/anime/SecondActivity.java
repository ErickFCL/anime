package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent(); //obtiene el inten del otro lado
        String name = intent.getStringExtra("NAME_EXTRA");
        TextView tvTitle = findViewById(R.id.tvTitle);
        if(!name.equals(null) || !name.equals(""))
            tvTitle.setText("favorito "+name);
        else
            tvTitle.setText("Hola Otuzco");
    }
}