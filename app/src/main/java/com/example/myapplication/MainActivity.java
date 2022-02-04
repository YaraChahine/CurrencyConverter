package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText lbp;
    EditText usd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbp= (EditText) findViewById(R.id.lbp);
        usd=(EditText)  findViewById(R.id.usd);

    }


    public void convert(View view){
        String lbp_input= lbp.getText().toString();
        String usd_input= usd.getText().toString();

        if (lbp_input.isEmpty() && usd_input.isEmpty() ){
            Toast.makeText(getApplicationContext(),"Please enter an amount", Toast.LENGTH_LONG).show();
        }


    }
}