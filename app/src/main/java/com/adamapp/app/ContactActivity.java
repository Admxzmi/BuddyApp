package com.adamapp.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class ContactActivity extends AppCompatActivity {
    WebView webView4;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        webView4=(WebView) findViewById(R.id.webView4);
        webView4.loadUrl("https://www.instagram.com/admxzmi/");
        WebSettings webSettings=webView4.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        webSettings.setDomStorageEnabled(true);
        webView4.setWebViewClient(new WebViewClient());

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    Toast.makeText(ContactActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                    Intent intentHome = new Intent(ContactActivity.this, HomeActivity.class);
                    startActivity(intentHome);
                } else if (id == R.id.about) {
                    Toast.makeText(ContactActivity.this, "About Me Selected", Toast.LENGTH_SHORT).show();
                    Intent intentAbout = new Intent(ContactActivity.this, AboutActivity.class);
                    startActivity(intentAbout);
                } else if (id == R.id.hobi) {
                    Toast.makeText(ContactActivity.this, "Hobbies Selected", Toast.LENGTH_SHORT).show();
                    Intent intentHobby = new Intent(ContactActivity.this, HobbiesActivity.class);
                    startActivity(intentHobby);
                } else if (id == R.id.skill) {
                    Toast.makeText(ContactActivity.this, "Skills Selected", Toast.LENGTH_SHORT).show();
                    Intent intentSkill = new Intent(ContactActivity.this, SkillsActivity.class);
                    startActivity(intentSkill);
                } else if (id == R.id.timeTable) {
                    Toast.makeText(ContactActivity.this, "Timetable Selected", Toast.LENGTH_SHORT).show();
                    Intent intentTimeTable = new Intent(ContactActivity.this, TimeTableActivity.class);
                    startActivity(intentTimeTable);
                } else if (id == R.id.contact) {
                    Toast.makeText(ContactActivity.this, "Contact Selected", Toast.LENGTH_SHORT).show();
                    Intent intentContact = new Intent(ContactActivity.this, ContactActivity.class);
                    startActivity(intentContact);
                } else if (id == R.id.uni) {
                    Toast.makeText(ContactActivity.this, "UiTM Selected", Toast.LENGTH_SHORT).show();
                    Intent intentUni = new Intent(ContactActivity.this, UniActivity.class);
                    startActivity(intentUni);
                } else if (id == R.id.student) {
                    Toast.makeText(ContactActivity.this, "Student Portal Selected", Toast.LENGTH_SHORT).show();
                    Intent intentStd = new Intent(ContactActivity.this, StudentActivity.class);
                    startActivity(intentStd);
                }
                return false;
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}