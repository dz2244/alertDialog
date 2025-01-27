package com.example.alertdialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    Button btnT,btnTI,btnTI1,btnTI2,btnTI3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnT = findViewById(R.id.btnT);
        btnTI = findViewById(R.id.btnTI);
        btnTI1 = findViewById(R.id.btnTI1);
        btnTI2 = findViewById(R.id.btnTI2);
        btnTI3 = findViewById(R.id.btnTI3);

    }

    public void clickedBtnT(View view) {
        adb = new AlertDialog.Builder(this);
        AlertDialog ad = adb.create();
        adb.setTitle("text.");
        adb.setMessage("This is text");
        ad.show();
    }

    public void clickedBtnTI(View view) {
        adb = new AlertDialog.Builder(this);
        AlertDialog ad = adb.create();
        adb.setTitle("First example: only text");
        adb.setMessage("This is a simple alert");
        adb.setIcon(R.drawable.flag1);
        ad.show();
    }

    public void clickedBtnTI1(View view) {
        adb = new AlertDialog.Builder(this);
        AlertDialog ad = adb.create();
        adb.setTitle("First example: only text");
        adb.setMessage("This is a simple alert");
        adb.setIcon(R.drawable.flag1);
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        ad.show();
    }

    public void clickedBtnTI2(View view) {
    }

    public void clickedBtnTI3(View view) {
    }
}