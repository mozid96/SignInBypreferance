package com.example.user.signinbypreferance;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,password;
    Preference preference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.EditEmail);
        password=findViewById(R.id.Editpasword);

        preference = new Preference(this);



    }

    public void signin(View view) {
        String Lemail= email.getText().toString();
        String Lpass=password.getText().toString();
        if(preference.retrieveEmail().equals(Lemail) && preference.retrievePassword().equals(Lpass)){
            Toast.makeText(this, "Log in Successful", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
        }

    }

    public void signup(View view) {
   startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }
}
