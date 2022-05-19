package com.example.normal_calculator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new calculations();
            case 1:
                return new convertor();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
