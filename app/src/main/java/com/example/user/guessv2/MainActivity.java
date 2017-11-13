package com.example.user.guessv2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int n = r.nextInt(100)+1;
    int min = 1;
    int max = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guess(View view){
        boolean b = true;
        EditText edNumber = (EditText) findViewById(R.id.ed_number);
        int s = Integer.parseInt(edNumber.getText().toString());
        if (n>100||n<1){
            b=false;
            Toast.makeText(this,"請輸入1~100",Toast.LENGTH_LONG)
                    .show();
        }
        if (b=true){
        if (n==s){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setTitle("結果")
                    .setPositiveButton("ok",null)
                    .show();
        }
        if (n>s){
            min = s;
            Toast.makeText(this,"請輸入:"+min+"~"+max,Toast.LENGTH_LONG)
                    .show();
        }
            if (n<s){
                max = s;
                Toast.makeText(this,"請輸入:"+min+"~"+max,Toast.LENGTH_LONG)
                        .show();
            }
}}}
