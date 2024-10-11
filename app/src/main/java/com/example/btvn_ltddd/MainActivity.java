package com.example.btvn_ltddd;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private TextView tvFragmentOne, tvFragmentSecond, tvFragmentThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFragmentOne = findViewById(R.id.tvFragmentOne);
        tvFragmentSecond = findViewById(R.id.tvFragmentSecond);
        tvFragmentThird = findViewById(R.id.tvFragmentThird);

        loadFragment(new OneFragment());
        updateSelectedTab(tvFragmentOne);

        tvFragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new OneFragment());
                updateSelectedTab(tvFragmentOne);
            }
        });

        tvFragmentSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
                updateSelectedTab(tvFragmentSecond);
            }
        });

        tvFragmentThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ThirdFragment());
                updateSelectedTab(tvFragmentThird);
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
    // Phương thức để cập nhật tab được chọn
    private void updateSelectedTab(TextView selectedTab) {
        // Reset trạng thái cho tất cả các TextView
        tvFragmentOne.setTypeface(null, Typeface.NORMAL);
        tvFragmentSecond.setTypeface(null, Typeface.NORMAL);
        tvFragmentThird.setTypeface(null, Typeface.NORMAL);

        tvFragmentOne.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        tvFragmentSecond.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        tvFragmentThird.setBackgroundColor(getResources().getColor(android.R.color.transparent));


        selectedTab.setTypeface(null, Typeface.BOLD);
        selectedTab.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
    }
}