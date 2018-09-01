package com.cartavirtual.felipe.cartavirtual;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ProductosActivity extends ListActivity {

    private String[] testValues = new String[]{"Entradas", "Platos Fuertes","Postre", "Bebida"};

    private ListView lvl = null;
    private ListAdapter lal = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);


        lvl = (ListView)findViewById(android.R.id.list);

        lal = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,testValues);


        lvl.setAdapter(lal);

        lvl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(view.getContext(), MenuActivity.class);
                    startActivity(i);
                }
                if (position == 1){
                    Intent i = new Intent(view.getContext(), MenuActivity.class);
                    startActivity(i);
                }
                if (position == 2){
                    Intent i = new Intent(view.getContext(), MenuActivity.class);
                    startActivity(i);
                }
                if (position == 3){
                    Intent i = new Intent(view.getContext(), MenuActivity.class);
                    startActivity(i);
                }
                if (position == 4){
                    Intent i = new Intent(view.getContext(), MenuActivity.class);
                    startActivity(i);
                }
                if (position == 5){
                    Intent i = new Intent(view.getContext(), MenuActivity.class);
                    startActivity(i);
                }

            }
        });

    }

    protected void onListItemClick (ListView l, View v, int position, Long id){
        Toast.makeText(this, testValues[position], Toast.LENGTH_SHORT).show();
    }

    void ComeBack (View v){

        Intent intencion = new Intent ( this, MainActivity.class);
        startActivity(intencion);
    }

}


