package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] ilceleri={"Sancaktepe","Kadıköy","Şile","Kartal"};
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        adapterOlustur();
        spinnerAdapterEkle();
        bilgiVer();

    }
    private void tanimla(){
        spinner = findViewById(R.id.spinner);
    }
    private void adapterOlustur(){
        arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,ilceleri);
    }
    private void spinnerAdapterEkle(){
        spinner.setAdapter(arrayAdapter);
    }
    private void bilgiVer(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}