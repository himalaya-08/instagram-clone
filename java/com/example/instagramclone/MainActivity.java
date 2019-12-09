package com.example.instagramclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.instagramclone.adapters.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(new ViewPagerAdapter(this));

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        GlobalApplication.setVpCurrentPosition(0);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.itemOne:
                    GlobalApplication.setVpCurrentPosition(0);
                    viewPager.setCurrentItem(0);
                    break;
                case R.id.itemTwo:
                    GlobalApplication.setVpCurrentPosition(1);
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.itemThree:
                    GlobalApplication.setVpCurrentPosition(2);
                    viewPager.setCurrentItem(2);
                    break;
            }
            return true;
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
