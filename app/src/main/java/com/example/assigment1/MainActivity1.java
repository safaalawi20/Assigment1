package com.example.assigment1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity1 extends AppCompatActivity {
    private Button BtnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BtnStart =findViewById(R.id.btnStart);
        BtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity1.this, MainActivity_Login2.class);
                startActivity(intent);
            }
        });


    }

//    public void btnStartOnClick (View view){
//     Intent intent= new Intent(MainActivity.this,MainActivity_Login.class);
//
//    }


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