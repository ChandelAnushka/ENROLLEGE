package com.example.enrollege.Activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.enrollege.Fragments.AllPostsFragment;
import com.example.enrollege.Fragments.MyPostsFragment;
import com.example.enrollege.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new DashboardPagerAdapter(getSupportFragmentManager()));
        tabs.setupWithViewPager(viewPager);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(),true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });


    }

    class DashboardPagerAdapter extends FragmentPagerAdapter {

        ArrayList<Fragment> fragments;

        public DashboardPagerAdapter(FragmentManager fm) {
            super(fm);
            Log.i("hi" , "hi");
            fragments = new ArrayList<>();
            fragments.add(0,new AllPostsFragment());
            fragments.add(1,new MyPostsFragment());
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
