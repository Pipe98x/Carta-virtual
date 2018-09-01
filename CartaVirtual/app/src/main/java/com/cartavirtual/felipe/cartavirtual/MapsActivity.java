package com.cartavirtual.felipe.cartavirtual;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng boulevard = new LatLng(6.241616, -75.590077);
        LatLng bloque9 = new LatLng(6.240645, -75.589358);
        LatLng arquitectura = new LatLng(6.240336, -75.590377);
        LatLng derecho = new LatLng(6.243386, -75.590313);
        LatLng bloque6 = new LatLng(6.242442, -75.589524);
        mMap.addMarker(new MarkerOptions().position(boulevard).title("Boulevard"));
        mMap.addMarker(new MarkerOptions().position(bloque9).title("Bloque 9"));
        mMap.addMarker(new MarkerOptions().position(arquitectura).title("Arquitectura"));
        mMap.addMarker(new MarkerOptions().position(derecho).title("Derecho"));
        mMap.addMarker(new MarkerOptions().position(bloque6).title("Bloque6"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(boulevard));
    }
}
