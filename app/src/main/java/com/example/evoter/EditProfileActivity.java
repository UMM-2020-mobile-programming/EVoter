package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditProfileActivity extends AppCompatActivity {

    private Button btn_save_profile, btn_edit_profile_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        btn_save_profile = (Button) findViewById(R.id.btn_save_profil);
        btn_edit_profile_back = (Button) findViewById(R.id.btn_edit_profil_back);

        btn_save_profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(EditProfileActivity.this,ProfilActivity.class);
                startActivity(inte);
            }
        });
        btn_edit_profile_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(EditProfileActivity.this,ProfilActivity.class);
                startActivity(inte);
            }
        });

    }
}
