package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditDetailCandidateActivity extends AppCompatActivity {

    private TextView tv_no_cndt,tv_nama_cndt,tv_des_cndt;
    private Button btn_edit_det_can_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_detail_candidate);

        String no_cndt = getIntent().getStringExtra("no_cndt");
        String nama_cndt = getIntent().getStringExtra("nama_cndt");
        String des_cndt = getIntent().getStringExtra("des_cndt");

        tv_no_cndt = (TextView) findViewById(R.id.tv_no_cndt);
        tv_nama_cndt = (TextView) findViewById(R.id.tv_nama_cndt);
        tv_des_cndt = (TextView) findViewById(R.id.tv_des_cndt);
        btn_edit_det_can_back = (Button) findViewById(R.id.btn_edit_det_can_back);

        tv_no_cndt.setText(no_cndt);
        tv_nama_cndt.setText(nama_cndt);
        tv_des_cndt.setText(des_cndt);

        btn_edit_det_can_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(EditDetailCandidateActivity.this,DetailVoteActivity.class);
                startActivity(inte);
            }
        });
    }
}
