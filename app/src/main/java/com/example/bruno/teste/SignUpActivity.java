package com.example.bruno.teste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText emailSignupView = findViewById(R.id.email);
        EditText passwordSignupView = findViewById(R.id.email);

        User user = new User(emailSignupView.getText().toString(), passwordSignupView.getText().toString());

        RetrofitConnector conn = new RetrofitConnector();

        ApiService api = conn.RetrofitConnector(user).create(ApiService.class);

        Call<User> call = api.login(user);

        Response<User> resp = null;

        try {
            resp = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
