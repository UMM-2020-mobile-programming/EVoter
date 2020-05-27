package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailCandidateActivity extends AppCompatActivity {

    private Button btn_detail_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_candidate);

        btn_detail_back = (Button) findViewById(R.id.btn_detail_back);

        btn_detail_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(DetailCandidateActivity.this,VoteActivity.class);
                startActivity(inte);
            }
        });

    }
}
