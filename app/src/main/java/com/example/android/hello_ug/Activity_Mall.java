package com.example.android.hello_ug;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Mall extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__mall);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentMall_S(), "Malls");
        adapter.AddFragment(new FragmentInerior_S(), "interiors");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.malls);
        tabLayout.getTabAt(1).setIcon(R.drawable.interior);

    }
}
