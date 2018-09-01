package com.cartavirtual.felipe.cartavirtual;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void VerMaps(View v){

        Intent intention = new Intent(this, MapsActivity.class);
        startActivity(intention);
    }

    void VerCarta(View v){

        Intent intention = new Intent(this, ProductosActivity.class);
        startActivity(intention);
    }

    void ReservarMesa(View v){
        String cel = "3147601976";
        String mensaje = new String("Hola, me interesa reservar una mesa") ;

        Uri uri = Uri.parse("smsto:" + cel);
        Intent i = new Intent(Intent.ACTION_SENDTO,uri);
        i.putExtra("sms_body",mensaje);
        i.setPackage("com.whatsapp");
        startActivity(i);

    }

    void CalificarServicio(View v){

        Intent intention = new Intent(this, ServicioActivity.class);
        startActivity(intention);
    }
}
