package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    private Button btn_profil_back,btn_edit_profile, btn_crt_vote_profil;
    private TextView tv_list_1, tv_list_2;
    private String no, nama, des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        btn_profil_back = (Button) findViewById(R.id.btn_profil_back);
        btn_edit_profile = (Button) findViewById(R.id.btn_edit_profil);
        btn_crt_vote_profil = (Button) findViewById(R.id.btn_crt_vote_profil);

        tv_list_1 = (TextView) findViewById(R.id.tv_list_1);
        tv_list_2 = (TextView) findViewById(R.id.tv_list_2);

        btn_profil_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ProfilActivity.this,HomeActivity.class);
                startActivity(inte);
            }
        });

        btn_edit_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ProfilActivity.this,EditProfileActivity.class);
                startActivity(inte);
            }
        });

        btn_crt_vote_profil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ProfilActivity.this,CreateVoteActivity.class);
                startActivity(inte);
            }
        });

        tv_list_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ProfilActivity.this,DetailVoteActivity.class);
                nama = "Pemilihan ketua himpunan IF";
                des = "visi misi";

                inte.putExtra("nama", nama);
                inte.putExtra("des", des);
                startActivity(inte);
            }
        });

        tv_list_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(ProfilActivity.this,DetailVoteActivity.class);
                nama = "Pemilihan ketua UKM";
                des = "visi misi kandidat 2";

                inte.putExtra("nama", nama);
                inte.putExtra("des", des);
                startActivity(inte);
            }
        });
    }
}
