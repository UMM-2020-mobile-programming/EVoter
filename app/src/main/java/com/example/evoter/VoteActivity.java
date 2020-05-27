package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VoteActivity extends AppCompatActivity {

    private Button btn_plh_can1, btn_plh_can2, btn_dtl_can1, btn_dtl_can2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        btn_plh_can1 = (Button) findViewById(R.id.btn_plh_can1);
        btn_plh_can2 = (Button) findViewById(R.id.btn_plh_can2);
        btn_dtl_can1 = (Button) findViewById(R.id.btn_dtl_can1);
        btn_dtl_can2 = (Button) findViewById(R.id.btn_dtl_can2);

        btn_plh_can1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(VoteActivity.this,SuccessActivity.class);
                startActivity(inte);
            }
        });

        btn_plh_can2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(VoteActivity.this,SuccessActivity.class);
                startActivity(inte);
            }
        });

        btn_dtl_can1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(VoteActivity.this,DetailCandidateActivity.class);
                startActivity(inte);
            }
        });

        btn_dtl_can2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(VoteActivity.this,DetailCandidateActivity.class);
                startActivity(inte);
            }
        });
    }
}
