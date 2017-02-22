package com.example.user.simplebaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestSimpleAdapter extends AppCompatActivity {
    ListView lvSimple = null;
    ArrayList<Map<String,String>> listSalarie = new ArrayList<Map<String, String>>();
    String[] from = null;
    int[] to = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_simple_adapter);
        lvSimple = (ListView) findViewById(R.id.lvSimple);
        Map<String,String> salarie1 = new HashMap<String, String>();
        Map<String,String> salarie2 = new HashMap<String, String>();
        Map<String,String> salarie3 = new HashMap<String, String>();
        Map<String,String> salarie4 = new HashMap<String, String>();
        salarie1.put("nom","Kh");
        salarie1.put("prenom","Mouhcine");
        salarie1.put("salaire","4000 dh");

        salarie2.put("nom","Souto");
        salarie2.put("prenom","Toufik");
        salarie2.put("salaire","3500 dh");

        salarie3.put("nom","Bhaya");
        salarie3.put("prenom","Mouad");
        salarie3.put("salaire","4500 dh");

        salarie4.put("nom","Bsm");
        salarie4.put("prenom","Boubker");
        salarie4.put("salaire","4700 dh");

        listSalarie.add(salarie1);
        listSalarie.add(salarie2);
        listSalarie.add(salarie3);
        listSalarie.add(salarie4);
        from = new String[]{"nom", "prenom", "salaire"};
        to = new int[]{R.id.txtNom, R.id.txtPrenom, R.id.txtSalaire};

        SimpleAdapter adapter = new SimpleAdapter(TestSimpleAdapter.this,listSalarie,R.layout.item,from,to);
        lvSimple.setAdapter(adapter);
    }
}
