package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn_login;
    private TextView tv_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button) findViewById(R.id.btn_login);
        tv_register = (TextView) findViewById(R.id.tv_register);

        tv_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(inte);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(inte);
            }
        });
    }
}
