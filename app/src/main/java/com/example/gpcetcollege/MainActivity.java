package com.example.gpcetcollege;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gpcetcollege.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CharSequence charSequence;
    private int index;
    private final long delay = 150; // Delay between each letter animation in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        charSequence = "WELCOME TO GPCET"; // Replace with your desired text
        index = 0;

        animateText();
    }

    private void animateText() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText(charSequence.subSequence(0, index++));
                if (index <= charSequence.length()) {
                    handler.postDelayed(this, delay);
                }
            }
        }, delay);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Widgets.class);
                startActivity(intent);
            }
        });

    }
}

