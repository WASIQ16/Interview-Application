package com.example.midlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class main_menu extends AppCompatActivity {
    ImageButton simple, tough, other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        other=findViewById(R.id.tou);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o;
                o = new Intent(Intent.ACTION_VIEW);
                o.setData(Uri.parse("https://www.linkedin.com/in/mohammad-wasiq-zafar-a66a21233"));

                if (getIntent().resolveActivity(getPackageManager())!=null){
                    startActivity(o);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No App Available",Toast.LENGTH_LONG).show();
                }
            }
        });
        tough=findViewById(R.id.tougharr);
        tough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(main_menu.this,Tough.class);
                startActivity(intent);
            }
        });

        simple=findViewById(R.id.simplearr);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(main_menu.this,Simple.class);
                startActivity(i);
            }
        });
    }


}