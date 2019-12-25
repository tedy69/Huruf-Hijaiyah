package tech.tedybear.hurufhijaiyyah;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import tech.tedybear.hurufhijaiyyah.adapter.HijaiyyahAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Huruf Hijaiyyah");

        viewPager = findViewById(R.id.container);
        viewPager.setAdapter(new HijaiyyahAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(4);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
