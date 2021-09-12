package com.example.mynsapilly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome,msports,mscience,mhealth,mtechnology,mbusiness,mentertainment;
    Adapter pagerAdapter;
    Toolbar toolbar;
    public String apikey = "f7a4dd0a58304e1ea78191c48bc7f3aa";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar =findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        tabLayout = findViewById(R.id.tablayout);
        mhome = findViewById(R.id.hometab);
        msports = findViewById(R.id.sportstab);
        mhealth = findViewById(R.id.healthtab);
        mtechnology = findViewById(R.id.tehnologytab);
        mscience = findViewById(R.id.sciencetab);
        mbusiness=findViewById(R.id.business);
        mentertainment=findViewById(R.id.entertainment);

        ViewPager viewPager = findViewById(R.id.fragmentcontainer);

        pagerAdapter = new Adapter(getSupportFragmentManager(),7);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5||tab.getPosition()==6)
                {   pagerAdapter.getItem(tab.getPosition());
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }



}