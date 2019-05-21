package com.univalle.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class TEM extends AppCompatActivity {
Button tem=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        tem=(Button)findViewById(R.id.btn);
        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambiar =new Intent(getApplicationContext(),t.class);
                startActivity(cambiar);
            }
        });
    }
}
