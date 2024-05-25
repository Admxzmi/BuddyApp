package com.adamapp.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class HobbiesActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_hobbies);

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
                    Toast.makeText(HobbiesActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                    Intent intentHome = new Intent(HobbiesActivity.this, HomeActivity.class);
                    startActivity(intentHome);
                } else if (id == R.id.about) {
                    Toast.makeText(HobbiesActivity.this, "About Me Selected", Toast.LENGTH_SHORT).show();
                    Intent intentAbout = new Intent(HobbiesActivity.this, AboutActivity.class);
                    startActivity(intentAbout);
                } else if (id == R.id.hobi) {
                    Toast.makeText(HobbiesActivity.this, "Hobbies Selected", Toast.LENGTH_SHORT).show();
                    Intent intentHobby = new Intent(HobbiesActivity.this, HobbiesActivity.class);
                    startActivity(intentHobby);
                } else if (id == R.id.skill) {
                    Toast.makeText(HobbiesActivity.this, "Skills Selected", Toast.LENGTH_SHORT).show();
                    Intent intentSkill = new Intent(HobbiesActivity.this, SkillsActivity.class);
                    startActivity(intentSkill);
                } else if (id == R.id.timeTable) {
                    Toast.makeText(HobbiesActivity.this, "Timetable Selected", Toast.LENGTH_SHORT).show();
                    Intent intentTimeTable = new Intent(HobbiesActivity.this, TimeTableActivity.class);
                    startActivity(intentTimeTable);
                } else if (id == R.id.contact) {
                    Toast.makeText(HobbiesActivity.this, "Contact Selected", Toast.LENGTH_SHORT).show();
                    Intent intentContact = new Intent(HobbiesActivity.this, ContactActivity.class);
                    startActivity(intentContact);
                } else if (id == R.id.uni) {
                    Toast.makeText(HobbiesActivity.this, "UiTM Selected", Toast.LENGTH_SHORT).show();
                    Intent intentUni = new Intent(HobbiesActivity.this, UniActivity.class);
                    startActivity(intentUni);
                } else if (id == R.id.student) {
                    Toast.makeText(HobbiesActivity.this, "Student Portal Selected", Toast.LENGTH_SHORT).show();
                    Intent intentStd = new Intent(HobbiesActivity.this, StudentActivity.class);
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