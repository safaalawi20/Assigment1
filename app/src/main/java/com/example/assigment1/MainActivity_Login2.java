package com.example.assigment1;

import static android.app.PendingIntent.getActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Login2 extends AppCompatActivity {
    private CheckBox box;
    private Button login;
    private EditText nameText;
    private EditText pass_edittext;


    public String name, pass;
    SharedPreferences sharedPreferences;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        nameText = findViewById(R.id.editTextText);
        pass_edittext = findViewById(R.id.editTextText2);
        login =findViewById(R.id.button);
        sharedPreferences =getSharedPreferences("UserNamePreference" ,Context.MODE_PRIVATE);
        box = findViewById(R.id.checkBox);
        res= findViewById(R.id.textbox);
       // boolean isChecked = box.isChecked();


//
//        box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//               res.setText("your data will save ");
//            }
//        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = nameText.getText().toString();
                pass = pass_edittext.getText().toString();
                SharedPreferences.Editor editor =sharedPreferences.edit();

                editor.putString("UserName" , name);
                editor.putString("Password" , pass);
                editor.commit();


                    Toast.makeText(MainActivity_Login2.this, "Welcome : " + name,Toast.LENGTH_LONG).show();


                Intent intent;
                intent = new Intent(MainActivity_Login2.this, MainActivity_HomePaje3.class);
                startActivity(intent);


            }
        });





    }


//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("tag :","onResume");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("tag :","onRestart");
//
//    }
//
//    protected void onStop() {
//        super.onStop();
//        Log.d("tag :","onStop");
//
//    }
//
//    protected void onPause() {
//        super.onPause();
//        Log.d("tag :","onPause");
//
//    }
//
//    protected void onStart() {
//        super.onStart();
//        Log.d("tag :","onStart");
//
//    }
//
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("tag :","onDestroy");
//
//    }

}