package com.example.ratul_pc.fragment_manager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"Ratul", "Hira", "Mili", "Doli", "Reza", "Habib", "Humayn", "Shuvo", "Sabuj", "Sanjida", "Halima", "Liza", "Sunmoon", "Urmi"};

        listView = findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;
        if (position == 0) {

            fragment = new RatulFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId, fragment);
            fragmentTransaction.commit();
        } else if (position == 1) {

            fragment = new HiraFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

        } else if (position == 2) {
            fragment = new MiliFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

        } else if (position == 3) {
            fragment = new DoliFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

        } else if (position == 4) {
            fragment = new RezaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

        } else if (position == 5) {
            fragment = new HabibFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

        } else if (position == 6) {
            fragment = new HumaynFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();

        }
        else if (position ==7){
            fragment =new ShuvoFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        else if (position ==8){
            fragment =new SabujFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        else if (position ==9){
            fragment =new SanjidaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        else if (position ==10){
            fragment =new HalimaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        else if (position ==11){
            fragment =new LizaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        else if (position ==12){
            fragment =new SunmoonFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        else if (position ==13){
            fragment =new UrmiFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
    }
}
