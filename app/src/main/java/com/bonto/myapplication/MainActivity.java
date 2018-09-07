package com.bonto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<Planets> planets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planets.add(new Planets("Name: Pluto \n Diameter: 2,377 km \n Status: Not part of Solar System", "pluto.jpg"));
        planets.add(new Planets("Name: Saturn \n Diameter: 116,464 km \n Status: Still Part of Solar System", "saturn.jpg"));
        planets.add(new Planets("Name: Uranus \n Diameter: 50,724 km \n Status: Still Part of Solar System", "uranus.jpg"));
        planets.add(new Planets("Name: Venus \n Diameter: 12,104 km \n Status: Still Part of Solar System", "venus.jpg"));
        planets.add(new Planets("Name: Earth \n Diameter: 12,742 km \n Status: Still Part of Solar System", "earth.jpg"));
        planets.add(new Planets("Name: Jupiter \n Diameter: 139,822 km \n Status: Still Part of Solar System", "jupiter.jpg"));
        planets.add(new Planets("Name: Mars \n Diameter: 6,779 km \n Status: Still Part of Solar System", "mars.jpg"));
        planets.add(new Planets("Name: Mercury \n Diameter: 4,879 km \n Status: Still Part of Solar System", "mercury.jpg"));
        planets.add(new Planets("Name: Neptune \n Diameter: 49,244 km \n Status: Still Part of Solar System", "neptune.jpg"));

        GridView planetsGrid = findViewById(R.id.planet_grid);
        PlanetsAdapter adapter  = new PlanetsAdapter(this, R.layout.activity_planets_adapter , planets);
        planetsGrid.setAdapter(adapter);
        planetsGrid.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView planetTitleTextview = view.findViewById(R.id.planet_title_textView);
        Toast.makeText(this, planetTitleTextview.getText().toString(), Toast.LENGTH_LONG).show();

    }
}
