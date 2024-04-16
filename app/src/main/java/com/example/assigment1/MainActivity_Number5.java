package com.example.assigment1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Number5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_number5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag :","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag :","onRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag :","onStop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag :","onPause");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag :","onStart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag :","onDestroy");

    }
}