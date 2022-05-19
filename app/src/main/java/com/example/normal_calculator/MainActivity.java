package com.example.normal_calculator;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    long pressed_time;
    ViewpagerAdapter viewpagerAdapter;
    ViewPager viewPager;
    View view1, view2;
    boolean calc = true, convert = false;

    @Override
    public void onBackPressed() {
        if (pressed_time + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "press back again to exit ", Toast.LENGTH_SHORT).show();
        }
        pressed_time = System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager_1);
        view1 = findViewById(R.id.view2);
        view2 = findViewById(R.id.view);
        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                position++;
                switch (position) {
                    case 1:
                        calc = true;
                        convert = false;
                        view1.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.ic_calculator_tab_focused));
                        view2.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.convertor_tab_not_focused));
                        break;
                    case 2:
                        calc = false;
                        convert = true;
                        view1.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.ic_calculator_tab_not_focused));
                        view2.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.convertor_tab_focused));
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        view1.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.ic_calculator_tab_focused));
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = true;
                convert = false;
                view1.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.ic_calculator_tab_focused));
                view2.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.convertor_tab_not_focused));
                viewPager.setCurrentItem(0);
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = false;
                convert = true;
                view1.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.ic_calculator_tab_not_focused));
                view2.setBackground(AppCompatResources.getDrawable(getApplicationContext(), R.drawable.convertor_tab_focused));
                viewPager.setCurrentItem(1);
            }
        });
    }
}