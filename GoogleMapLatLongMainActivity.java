package com.example.lab02.GoogleMap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lab02.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class GoogleMapLatLongMainActivity extends AppCompatActivity {
    TextInputLayout lati,longi;
    TextInputEditText latitude,longitude;

    //EditText longitude= new TextInputEditText(textInputLayout.getContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_google_map_lat_long_main);
        lati=findViewById(R.id.latitude);
        longi=findViewById(R.id.longitude);
    }
    public void showOnMap(View view) {
        String lat=lati.getEditText().getText().toString();
        String lon=longi.getEditText().getText().toString();
        Intent intent=new Intent(this,Google_Map_1MapsActivity.class);
        intent.putExtra("lat",Float.valueOf(lat));
        intent.putExtra("lon",Float.valueOf(lon));
        startActivity(intent);
    }
}