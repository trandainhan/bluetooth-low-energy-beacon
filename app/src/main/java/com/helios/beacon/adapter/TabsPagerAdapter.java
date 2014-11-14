package com.helios.beacon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.helios.beacon.fragment.OrderFragment;

/**
 * Created by nhantran on 10/17/14.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new OrderFragment();
//            case 1:
//                return new LocationFragment();
        }

        return null;

    }

    @Override
    public int getCount() {
        return 1;
    }
}
