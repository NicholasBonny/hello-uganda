package com.example.android.hello_ug;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Hotel extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hotel);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentHotel_A(), "Hotels");
        adapter.AddFragment(new FragmentLodge_A(), "Lodges");
        adapter.AddFragment(new FragmentApartment_A(), "Apartments");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.hotel);
        tabLayout.getTabAt(1).setIcon(R.drawable.lodge);
        tabLayout.getTabAt(2).setIcon(R.drawable.apartment);
    }
}
