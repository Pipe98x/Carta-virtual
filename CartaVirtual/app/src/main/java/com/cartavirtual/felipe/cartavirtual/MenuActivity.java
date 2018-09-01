package com.cartavirtual.felipe.cartavirtual;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends ListActivity {

    private  MyAdapter mAdapter = null;

    public class Node{

        public String mTitle;
        public  String mDescription;
        public  Integer mImagenR;
    }

    private  static ArrayList<Node> mArray = new ArrayList<Node>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetData();

        mAdapter = new MyAdapter(this);
        setContentView(R.layout.activity_menu);
        setListAdapter(mAdapter);
    }

    public static  class MyAdapter extends BaseAdapter {

        private Context mContext;
        public MyAdapter(Context c){
            mContext = c;
        }

        @Override
        public int getCount() {
            return mArray.size();
        }

        @Override
        public Object getItem(int i) {
            return mArray.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View cview = null;

            if(view == null){
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                cview = inflater.inflate(R.layout.activity_menu, null);
            } else{

                cview = view;
            }

            ImageView img = (ImageView) cview.findViewById(R.id.image);
            img.setImageDrawable(mContext.getResources().getDrawable(mArray.get(i).mImagenR));

            TextView tTitle =(TextView) cview.findViewById(R.id.title);
            tTitle.setText(mArray.get(i).mTitle);

            TextView tDescription =(TextView) cview.findViewById(R.id.description);
            tDescription.setText(mArray.get(i).mDescription);


            return cview;
        }
    }

    private  void  SetData(){

        mArray.clear();

        Node mynode = new Node();

        //plato 1

        mynode.mTitle = "Pargo ciruelano";
        mynode.mDescription = "Arroz de coco con pargo rojo en salsa de ciruela acompañado con ensalada de repollo zanahoria cebolla y vinagretta, junto con sopa de pescado con yuca con suero al gusto";
        mynode.mImagenR = R.drawable.i1;

        Node mynode2 = new Node();

        //plato 2

        mynode2.mTitle = "Tentáculos maduros";
        mynode2.mDescription = "Sopa de pulpo, porción de pulpo en salsa de soya y piña, acompañado de platano maduro, papas cocinadas o fritas";
        mynode2.mImagenR = R.drawable.i1;

        Node mynode3 = new Node();

        //plato 3

        mynode3.mTitle = "Bolognesas";
        mynode3.mDescription = "Pastas bolognesas";
        mynode3.mImagenR = R.drawable.i1;

        Node mynode4 = new Node();

        //plato 4

        mynode4.mTitle = "Langosto encebollado";
        mynode4.mDescription = "Sopa de camarones, acompañado por yuca en suero y langosta cocinada en salda bbq y cebolla, acompañada por arroz rissoto y ensalda de fruta (mango, papaya, uvas chilenas y manzana verde)";
        mynode4.mImagenR = R.drawable.i1;
    }
}
