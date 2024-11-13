package com.example.gpcetcollege;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Branches2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_branches2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button cse21 = findViewById(R.id.cse21);
        cse21.setOnClickListener(v -> {
            Intent intent = new Intent(Branches2.this, CSE_FAC.class);
            startActivity(intent);
        });
        Button ece21 = findViewById(R.id.ece21);
        ece21.setOnClickListener(v -> {
            Intent intent = new Intent(Branches2.this, ece_fac.class);
            startActivity(intent);
        });
        Button eee21 = findViewById(R.id.eee21);
        eee21.setOnClickListener(v -> {
            Intent intent = new Intent(Branches2.this, eee_fac.class);
            startActivity(intent);
        });
        Button civil21 = findViewById(R.id.civil21);
        civil21.setOnClickListener(v -> {
            Intent intent = new Intent(Branches2.this, civil_fac.class);
            startActivity(intent);
        });
        Button mech21 = findViewById(R.id.mech21);
        mech21.setOnClickListener(v -> {
            Intent intent = new Intent(Branches2.this, Mech_fac.class);
            startActivity(intent);
        });
    }
}