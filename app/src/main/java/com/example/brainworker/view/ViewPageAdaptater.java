package com.example.brainworker.view;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdaptater extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();


    public ViewPageAdaptater( FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitles.size();
    }
    @Override
    public CharSequence getPageTitle(int position){
        return super.getPageTitle(position);
    }
    public void AddFragment(Fragment fragment, String Title){
        mFragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }
}
