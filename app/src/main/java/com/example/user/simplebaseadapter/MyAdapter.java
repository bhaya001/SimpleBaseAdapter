package com.example.user.simplebaseadapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by USER on 16/02/2017.
 */

public class MyAdapter extends BaseAdapter {
    private Activity context ;
    private ArrayList<Personne> listPr = new ArrayList<Personne>();
    TextView txvNom = null,txvPrenom = null,txvAge=null;

    public MyAdapter(Activity context, ArrayList<Personne> listPr) {
        this.context = context;
        this.listPr = listPr;
    }

    @Override
    public int getCount() {
        return listPr.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView ==null)
            convertView = context.getLayoutInflater().inflate(R.layout.item_base_adapter,null);

        ImageView imgPr = (ImageView) convertView.findViewById(R.id.imgPr);
                 txvNom = (TextView) convertView.findViewById(R.id.txvNom);
              txvPrenom = (TextView) convertView.findViewById(R.id.txvNom);
        txvAge = (TextView) convertView.findViewById(R.id.txvNom);

        imgPr.setImageResource(listPr.get(position).getImage());
        txvNom.setText(listPr.get(position).getNom().toString());
      txvPrenom.setText(listPr.get(position).getPrenom().toString());
         txvAge.setText(""+listPr.get(position).getAge());
      /*  Toast.makeText(context,listPr.get(position).getNom()+" "+listPr.get(position).getPrenom() ,Toast.LENGTH_LONG).show();
*/
        return convertView;
    }
}
