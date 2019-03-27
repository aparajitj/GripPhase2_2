package com.example.gripphase2;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        DrawerLayout dl;
        ActionBarDrawerToggle toggle;
        dl = (DrawerLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.Per_D:
                        Intent x = new Intent(Dashboard.this, Per_D.class);                        startActivity(x);

                        break;
                    case R.id.Pro_D:
                        Intent x1 = new Intent(Dashboard.this, Pro_D.class);                        startActivity(x1);
                        break;
                    case R.id.Ed:
                        Intent x2 = new Intent(Dashboard.this, Ed.class);                        startActivity(x2);
                        break;
                    case R.id.Logout:
                       Intent x3 = new Intent(Dashboard.this,MainActivity.class);
                       startActivity(x3);
                        break;

                }
                return false;
            }
        });
    }
}