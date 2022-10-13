package com.example.gidi7.loginchananya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button ok;
    EditText usernameText, passwordText;

    private View.OnClickListener OnClickOK = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(passwordText.getText().toString().equals("123456")) {
                Intent intent = new Intent(LoginActivity.this, SecondActivity.class);
                intent.putExtra("usernametext", usernameText.getText().toString());
                startActivity(intent);
            }
            else
                Toast.makeText(LoginActivity.this, "wrong!", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ok = (Button) findViewById(R.id.OK);
        ok.setOnClickListener(OnClickOK);
        usernameText = (EditText) findViewById(R.id.UserName);
        passwordText = (EditText) findViewById(R.id.Password);
    }
}
