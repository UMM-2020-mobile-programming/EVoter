package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private Button btn_ok;
    private TextView tv_profil, tv_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_ok = (Button) findViewById(R.id.btn_ok);
        tv_profil = (TextView) findViewById(R.id.tv_profil);
        tv_logout = (TextView) findViewById(R.id.tv_logout);

        btn_ok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(HomeActivity.this,VoteActivity.class);
                startActivity(inte);
            }
        });

        tv_logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(inte);
            }
        });

        tv_profil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(HomeActivity.this,ProfilActivity.class);
                startActivity(inte);
            }
        });


    }
}
