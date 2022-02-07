package com.example.brainworker.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.brainworker.R;
import com.example.brainworker.view.broochtypes.FragmentBSK;
import com.example.brainworker.view.broochtypes.FragmentFOT;
import com.example.brainworker.view.broochtypes.FragmentGUIDE;
import com.example.brainworker.view.broochtypes.FragmentSD;
import com.example.brainworker.view.broochtypes.FragmentSIN;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class BroochActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private AppBarLayout mAppBarLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brooch);
        mTabLayout = (TabLayout) findViewById(R.id.tablayoutbrooch_id);
        mAppBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        mViewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPageAdaptater adaptater = new ViewPageAdaptater(getSupportFragmentManager());
        // On ajoute les fragments
        adaptater.AddFragment(new FragmentGUIDE(),"SIN");
        adaptater.AddFragment(new FragmentSD(),"SD");
        adaptater.AddFragment(new FragmentBSK(),"BSK");
        adaptater.AddFragment(new FragmentFOT(),"FOT");
        adaptater.AddFragment(new FragmentSIN(),"SIN");


        //Setup
        mViewPager.setAdapter(adaptater);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
