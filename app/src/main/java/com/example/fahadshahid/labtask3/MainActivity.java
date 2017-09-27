package com.example.fahadshahid.labtask3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.etusername);
        final String struser = username.getText().toString();
        password = (EditText) findViewById(R.id.etpassword);
        final String strpass = password.getText().toString();
        button = (Button) findViewById(R.id.signin);

        button.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view) {
               if (username.getText().toString().equals("") || password.getText().toString().equals("")){
                   Toast.makeText(MainActivity.this, "Enter username and password", Toast.LENGTH_SHORT).show();
               } else if (username.getText().toString().equals(password.getText().toString()) ){
                   Toast.makeText(MainActivity.this, "username and password are same",Toast.LENGTH_SHORT).show();
               } else  {
                   Toast.makeText(MainActivity.this, "username and password are not same",Toast.LENGTH_SHORT).show();
               }
           }
        });
    }
}
