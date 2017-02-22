package com.example.user.simplebaseadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button simpleadapter = null,baseadapter =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        simpleadapter = (Button) findViewById(R.id.simpleAdapter);
        baseadapter = (Button) findViewById(R.id.baseAdapter);

        simpleadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this,TestSimpleAdapter.class);
                startActivity(it);
            }
        });
        baseadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this,TestBaseAdapter.class);
                startActivity(it);
            }
        });
    }
}
