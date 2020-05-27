package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateCandidateActivity extends AppCompatActivity {

    private Button btn_crt_can_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_candidate);

        btn_crt_can_back = (Button) findViewById(R.id.btn_crt_can_back);

        btn_crt_can_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(CreateCandidateActivity.this,DetailVoteActivity.class);
                startActivity(inte);
            }
        });
    }
}
