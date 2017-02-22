package com.example.user.simplebaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TestBaseAdapter extends AppCompatActivity {
    ListView lvPr = null;
    ArrayList<Personne> listPr = new ArrayList<Personne>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_base_adapter);
        lvPr= (ListView) findViewById(R.id.lvPr);
        listPr.add(new Personne("Kh","Mouhcine",21,R.drawable.mouhcine));
        listPr.add(new Personne("Souto","Toufik",21,R.drawable.souto));
        listPr.add(new Personne("Bhaya","Mouad",21,R.drawable.mouad));
        listPr.add(new Personne("Bsm","Boubker",21,R.drawable.boubker));
        MyAdapter adapter = new MyAdapter(TestBaseAdapter.this,listPr);
        lvPr.setAdapter(adapter);
    }
}
