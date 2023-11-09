package com.example.normal_calculator;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.documentfile.provider.DocumentFile;
import androidx.viewpager.widget.ViewPager;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    long pressed_time;
    ViewpagerAdapter viewpagerAdapter;
    ViewPager viewPager;
    View view1, view2;
    boolean calc = true, convert = false;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            Uri treeUri = data.getData();
            DocumentFile pickedDir = DocumentFile.fromTreeUri(this, treeUri);
            String dirPath = pickedDir.getUri().getPath();
            Log.i("storage",dirPath + pickedDir.canWrite());
            // Use dirPath to write files to the selected directory
        }
    }

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
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
        startActivityForResult(intent, 101);
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