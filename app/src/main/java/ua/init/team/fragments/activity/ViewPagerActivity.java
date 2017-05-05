package ua.init.team.fragments.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ua.init.team.fragments.R;
import ua.init.team.fragments.adapters.ViewPagerAdapter;
import ua.init.team.fragments.fragments.InitFragment;
import ua.init.team.fragments.fragments.UtFragment;

/**
 * Created by dev on 05.05.17.
 */

public class ViewPagerActivity extends AppCompatActivity{

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vioew_pager_activity);
        initUI();
    }


    private void initUI(){

        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tl_tabs);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(UtFragment.getIntstance("pager works!"));
        viewPagerAdapter.addFragment(new InitFragment());
        viewPagerAdapter.addFragment(new InitFragment());
        viewPagerAdapter.addFragment(new InitFragment());
        viewPagerAdapter.addFragment(new InitFragment());
        viewPagerAdapter.addFragment(new InitFragment());
        viewPagerAdapter.addFragment(new InitFragment());

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);


    }
}

