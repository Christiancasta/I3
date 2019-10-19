package mx.gob.pt2ictea.Fragments;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import mx.gob.pt2ictea.Activities.MainActivity;
import mx.gob.pt2ictea.R;

public class Ubicacion2 extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ubicacion2, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Se inserta un marcador que identifica la ubicación del Instituto
        LatLng ictea = new LatLng(21.889535, -102.281596);
        mMap.addMarker(new MarkerOptions().position(ictea).title("ICTEA Gómez Morín"));

        LatLng ictea2 = new LatLng(21.849806, -102.296071);
        mMap.addMarker(new MarkerOptions().position(ictea2).title("ICTEA Pilar Blanco"));

        LatLng ictea3 = new LatLng(21.865881, -102.235563);
        mMap.addMarker(new MarkerOptions().position(ictea3).title("ICTEA Guadalupe Peralta"));

        LatLng ictea4 = new LatLng(21.865685, -102.235313);
        mMap.addMarker(new MarkerOptions().position(ictea4).title("Acción Móvil Guadalupe Peralta"));

        LatLng ictea5 = new LatLng(21.954503, -102.344620);
        mMap.addMarker(new MarkerOptions().position(ictea5).title("ICTEA López Mateos & Valle de México"));

        LatLng ictea6 = new LatLng(22.232968, -102.322966);
        mMap.addMarker(new MarkerOptions().position(ictea6).title("Acción Móvil Rincón de Romos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ictea6, 9f));

        LatLng ictea7 = new LatLng(22.068531, -102.271002);
        mMap.addMarker(new MarkerOptions().position(ictea7).title("Plantel San Francisco de los Romo"));

        LatLng ictea8 = new LatLng(22.075367, -102.272237);
        mMap.addMarker(new MarkerOptions().position(ictea8).title("Acción Móvil San Francisco de los Romo"));

        LatLng ictea9 = new LatLng(21.917438, -101.964250);
        mMap.addMarker(new MarkerOptions().position(ictea9).title("Acción Móvil El Llano"));

        LatLng ictea10 = new LatLng(22.098803, -102.069389);
        mMap.addMarker(new MarkerOptions().position(ictea10).title("Acción Móvil Villa Juárez"));
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}