package com.example.user.signinbypreferance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText email,phone,password;
    Preference preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        email=findViewById(R.id.SaveEmail);
        phone=findViewById(R.id.Savephone);
        password=findViewById(R.id.Savepassword);
        preference =new Preference(this);
    }

    public void insertData(View view) {
        String savedEmail =email.getText().toString();
        String savedphone =phone.getText().toString();
        String savedpassword =password.getText().toString();
        preference.saveemail(savedEmail);
        preference.savephone(savedphone);
        preference.savepassword(savedpassword);


        Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
    }
}
