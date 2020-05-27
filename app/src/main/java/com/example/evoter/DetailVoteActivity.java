package com.example.evoter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DetailVoteActivity extends AppCompatActivity {

    private Button btn_detail_vote_back;
    private TextView tv_no_vt, tv_nama_vt, tv_des_vt;
    private String no_can, nama_can, des_can;
    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult,tvDateResult1;
    private TextView  tv_list_can1,tv_list_can2;
    private Button btDatePicker, btDatePicker1,btn_crt_crt_back,btn_crt_can_vote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vote);



        btn_detail_vote_back = (Button) findViewById(R.id.btn_detail_vote_back);
        btn_crt_can_vote = (Button) findViewById(R.id.btn_crt_can_vote);

        tv_nama_vt = (TextView) findViewById(R.id.tv_nama_vt);
        tv_des_vt = (TextView) findViewById(R.id.tv_des_vt);

        tv_list_can1 = (TextView) findViewById(R.id.tv_list_can1);
        tv_list_can2 = (TextView) findViewById(R.id.tv_list_can2);


        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        tvDateResult = (TextView) findViewById(R.id.tv_dateresult);
        btDatePicker = (Button) findViewById(R.id.bt_datepicker);
        btDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        tvDateResult1 = (TextView) findViewById(R.id.tv_dateresult1);
        btDatePicker1 = (Button) findViewById(R.id.bt_datepicker1);

        btDatePicker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog1();
            }
        });

        String nama = getIntent().getStringExtra("nama");
        String des = getIntent().getStringExtra("des");

        tv_nama_vt.setText(nama);
        tv_des_vt.setText(des);

        btn_detail_vote_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(DetailVoteActivity.this,ProfilActivity.class);
                startActivity(inte);
            }
        });

        btn_crt_can_vote.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(DetailVoteActivity.this,CreateCandidateActivity.class);
                startActivity(inte);
            }
        });

        tv_list_can1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(DetailVoteActivity.this,EditDetailCandidateActivity.class);
                no_can = "1";
                nama_can = "Amirul";
                des_can = "visi:terbaik misi:membuat orang menjadi baik";

                inte.putExtra("no_cndt", no_can);
                inte.putExtra("nama_cndt", nama_can);
                inte.putExtra("des_cndt", des_can);
                startActivity(inte);
            }
        });

        tv_list_can2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(DetailVoteActivity.this,EditDetailCandidateActivity.class);
                no_can = "2";
                nama_can = "Bambang";
                des_can = "visi:kerja keras misi:membangun kerja sama yang baik";

                inte.putExtra("no_cndt", no_can);
                inte.putExtra("nama_cndt", nama_can);
                inte.putExtra("des_cndt", des_can);
                startActivity(inte);
            }
        });

    }


    private void showDateDialog(){

        /**
         * Calendar untuk mendapatkan tanggal sekarang
         */
        Calendar newCalendar = Calendar.getInstance();

        /**
         * Initiate DatePicker dialog
         */
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                /**
                 * Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                 */

                /**
                 * Set Calendar untuk menampung tanggal yang dipilih
                 */
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                /**
                 * Update TextView dengan tanggal yang kita pilih
                 */
                tvDateResult.setText("Tanggal dipilih : "+dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        /**
         * Tampilkan DatePicker dialog
         */
        datePickerDialog.show();
    }

    private void showDateDialog1(){

        /**
         * Calendar untuk mendapatkan tanggal sekarang
         */
        Calendar newCalendar = Calendar.getInstance();

        /**
         * Initiate DatePicker dialog
         */
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                /**
                 * Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                 */

                /**
                 * Set Calendar untuk menampung tanggal yang dipilih
                 */
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                /**
                 * Update TextView dengan tanggal yang kita pilih
                 */
                tvDateResult1.setText("Tanggal dipilih : "+dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        /**
         * Tampilkan DatePicker dialog
         */
        datePickerDialog.show();
    }
}
