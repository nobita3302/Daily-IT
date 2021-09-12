package com.example.mynsapilly;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {
    int tabcount;
    public Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Home();
            case 1:
                return new Sports();
            case 2:
                return new Health();
            case 3:
                return new Technology();
            case 4:
                return new Science();
            case 5:
                return new business();
            case 6:
                return new entertainment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
