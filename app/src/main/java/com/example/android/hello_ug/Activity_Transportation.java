package com.example.android.hello_ug;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Transportation extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__transportation);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentTaxi_T(), "Taxis");
        adapter.AddFragment(new FragmentBoda_T(), "Bodas");
        adapter.AddFragment(new FragmentBus_T(), "Buses");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_local_taxi);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_motorcycle);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_directions_bus_black_24dp);
    }
}
