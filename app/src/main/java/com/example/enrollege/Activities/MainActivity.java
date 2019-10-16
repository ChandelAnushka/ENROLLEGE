package com.example.enrollege.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.enrollege.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_navigation);

        final DrawerLayout dashboard = (DrawerLayout) findViewById(R.id.dashboardNavigationDrawer);
        ImageView toolbarNavigationOpenner=(ImageView)findViewById(R.id.toolbarNavigationOpenner);
        toolbarNavigationOpenner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dashboard.openDrawer(GravityCompat.START);
            }
        });
    }
}
