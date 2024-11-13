package com.example.gpcetcollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Branches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_branches);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(Branches.this, CSE.class);
            startActivity(intent);
        });
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(v -> {
            Intent intent = new Intent(Branches.this, ECE.class);
            startActivity(intent);
        });
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(v -> {
            Intent intent = new Intent(Branches.this, EEE.class);
            startActivity(intent);
        });
        Button button11 = findViewById(R.id.button11);
        button11.setOnClickListener(v -> {
            Intent intent = new Intent(Branches.this, Civil.class);
            startActivity(intent);
        });
        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(v -> {
            Intent intent = new Intent(Branches.this, ME1.class);
            startActivity(intent);
        });

    }
}