package com.example.user.signinbypreferance;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.SharedLibraryInfo;

/**
 * Created by USER on 8/14/2018.
 */

public class Preference {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;
    String PREFERENCE_NAME="database";
    String EMAIL_KEY="email";
    String PHONE_KEY="phone";
    String PASSWORD_KEY="password";

    public Preference(Context context) {//create constractor short key(alt+fn+del/ins)
        this.context = context;
        sharedPreferences=context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }
    //data saved
    public void saveemail(String email){
        editor.putString(EMAIL_KEY,email);
        editor.commit();//value saved
    }
    public void savephone(String phone){
        editor.putString(PHONE_KEY,phone);
        editor.commit();
    }
    public void savepassword(String password){
        editor.putString(PASSWORD_KEY,password);
        editor.commit();
    }
    //data retrived
    public String retrieveEmail(){
        String email=sharedPreferences.getString(EMAIL_KEY,"data not found");
        return email;
    }
    public String retrievePhone(){
        String phone=sharedPreferences.getString(PHONE_KEY,"data not found");
        return phone;
    }
    public String retrievePassword(){
        String password=sharedPreferences.getString(PASSWORD_KEY,"data not found");
        return password;
    }

}
