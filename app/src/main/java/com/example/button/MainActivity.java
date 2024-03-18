package com.example.button;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(view->{
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http:m.google.com"));
            startActivity(intent1);
        });
        button1.setTextColor(Color.BLACK);
        button1.setBackgroundColor(Color.WHITE);


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(view->{
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
            startActivity(intent2);
        });
        button2.setTextColor(Color.BLACK);
        button2.setBackgroundColor(Color.RED);


        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(view->{
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
            startActivity(intent3);
        });
        button3.setTextColor(Color.BLACK);
        button3.setBackgroundColor(Color.YELLOW);


        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view->finish());
        button4.setBackgroundColor(Color.BLUE);
        button4.setTextColor(Color.BLACK);



    }
}