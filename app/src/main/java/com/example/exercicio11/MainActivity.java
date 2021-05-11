package com.example.exercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_usern, txt_passw;
    Button txt_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_usern = findViewById(R.id.txt_username);
        txt_passw = findViewById(R.id.txt_password);
        txt_log = findViewById(R.id.txt_login);

        txt_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = txt_usern.getText().toString();
                String password = txt_passw.getText().toString();

                if ((username.equals("user")) || (username.equals("User")) || (username.equals("USER")) && (password.equals("pass"))){
                    Toast.makeText(MainActivity.this, "Login válido!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Login inválido!", Toast.LENGTH_SHORT).show();
                }

                txt_usern.setText("");
                txt_passw.setText("");
            }
        });
    }
}