package com.example.assigment1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_HomePaje3 extends AppCompatActivity {
    private Button Btn_Select;
    private TextView result;
    private TextView welcome;
    private Spinner spnr;
 TextView welcom ;
    String s_item;
    String name,pass;
    SharedPreferences sharedPreferences;
    EditText logText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_home_paje);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            return insets;
        });


        //Btn_Select = findViewById(R.id.BtnSelect);
        spnr = findViewById(R.id.spinnar);
        result = findViewById(R.id.ResultLabel);
        welcom =findViewById(R.id.wlcomeUser) ;


        sharedPreferences =getSharedPreferences("UserNamePreference", Context.MODE_PRIVATE);
        name = sharedPreferences.getString("name:" , "");
        pass = sharedPreferences.getString("password:" , "");

        welcom.setText("~ WELCOME ~");











        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.catagories, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item from the spinner
                s_item = parent.getItemAtPosition(position).toString();
                result.setText("Your selection is:\n"+s_item);
                if (s_item.contains("Letter")) {
                    Intent intent = new Intent(MainActivity_HomePaje3.this, MainActivity_letters4.class);
                    startActivity(intent);
                } else if (s_item.contains("Numbers")) {

                    Intent intent = new Intent(MainActivity_HomePaje3.this, MainActivity_Number5.class);
                    startActivity(intent);
                } else {

                    result.setText("");

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing if nothing is selected
            }
        });


    }









   /* public void OncliclBtnSELECT(View view){

        Intent intent = new Intent(MainActivity_HomePaje3.this, MainActivity_Number5.class);
        startActivity(intent);
        Log.d(" srd" ,s_item);

        if (s_item.trim() == "Letter") {
           // Intent intent = new Intent(MainActivity_HomePaje3.this, MainActivity_letters4.class);
            startActivity(intent);
        } else if (s_item.trim() == "Numbers") {

            //Intent intent = new Intent(MainActivity_HomePaje3.this, MainActivity_Number5.class);
            startActivity(intent);
        } else {

            result.setText("You Must Select One ");

        }*/

  //  }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag :","onResume");
        Toast.makeText(MainActivity_HomePaje3.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag :","onRestart");
        Toast.makeText(MainActivity_HomePaje3.this, "onRestart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag :","onStop");
        Toast.makeText(MainActivity_HomePaje3.this, "onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag :","onPause");
        Toast.makeText(MainActivity_HomePaje3.this, "onPause", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag :","onStart");
        Toast.makeText(MainActivity_HomePaje3.this, "onStart", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag :","onDestroy");
        Toast.makeText(MainActivity_HomePaje3.this, "onDestroy", Toast.LENGTH_SHORT).show();

    }



}