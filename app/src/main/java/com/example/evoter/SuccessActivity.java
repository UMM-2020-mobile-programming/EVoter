package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    private TextView tv_success_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        tv_success_back = (TextView) findViewById(R.id.tv_succes_back);


        tv_success_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(SuccessActivity.this,HomeActivity.class);
                startActivity(inte);
            }
        });

    }
}
