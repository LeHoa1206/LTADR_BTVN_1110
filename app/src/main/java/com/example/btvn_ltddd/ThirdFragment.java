package com.example.btvn_ltddd;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import android.view.MenuItem;

public class ThirdFragment extends Fragment {

    public static final int nav_home = 1;   // Định nghĩa ID cho Home
    public static final int nav_search = 2; // Định nghĩa ID cho Search
    public static final int nav_profile = 3; // Định nghĩa ID cho Profile

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        // Thiết lập Bottom Navigation View
        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottom_navigation);

        // Thêm các mục menu vào Bottom Navigation View
        bottomNavigationView.getMenu().add(0, nav_home, 0, "Thông tin");
        bottomNavigationView.getMenu().add(0, nav_search, 1, "Kĩ năng");


        // Thiết lập sự kiện cho Bottom Navigation View
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case nav_home:
                        // Chuyển đến Home Fragment
                        getParentFragmentManager().beginTransaction()
                                .replace(R.id.fragment_content, new OneFragment())
                                .commit();
                        return true;
                    case nav_search:
                        // Chuyển đến Search Fragment
                        getParentFragmentManager().beginTransaction()
                                .replace(R.id.fragment_content, new SecondFragment())
                                .commit();
                        return true;

                    default:
                        return false;
                }
            }
        });

        return view;
    }
}
