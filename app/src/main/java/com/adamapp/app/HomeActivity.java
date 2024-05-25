package com.adamapp.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public class HomeActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    ImageButton aboutMe;
    Button about;
    ImageButton hobbies;
    Button hobby;
    ImageButton skills;
    Button skill;
    ImageButton timetable;
    Button table;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    Toast.makeText(HomeActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                    Intent intentHome = new Intent(HomeActivity.this, HomeActivity.class);
                    startActivity(intentHome);

                } else if (id == R.id.about) {
                    Toast.makeText(HomeActivity.this, "About Me Selected", Toast.LENGTH_SHORT).show();
                    Intent intentAbout = new Intent(HomeActivity.this, AboutActivity.class);
                    startActivity(intentAbout);

                } else if (id == R.id.hobi) {
                    Toast.makeText(HomeActivity.this, "Hobbies Selected", Toast.LENGTH_SHORT).show();
                    Intent intentHobi = new Intent(HomeActivity.this, HobbiesActivity.class);
                    startActivity(intentHobi);

                } else if (id == R.id.skill) {
                    Toast.makeText(HomeActivity.this, "Skills Selected", Toast.LENGTH_SHORT).show();
                    Intent intentSkill = new Intent(HomeActivity.this, SkillsActivity.class);
                    startActivity(intentSkill);

                } else if (id == R.id.timeTable) {
                    Toast.makeText(HomeActivity.this, "Timetable Selected", Toast.LENGTH_SHORT).show();
                    Intent intentTimeTable = new Intent(HomeActivity.this, TimeTableActivity.class);
                    startActivity(intentTimeTable);
                } else if (id == R.id.contact) {
                    Toast.makeText(HomeActivity.this, "Contact Selected", Toast.LENGTH_SHORT).show();
                    Intent intentContact = new Intent(HomeActivity.this, ContactActivity.class);
                    startActivity(intentContact);
                } else if (id == R.id.uni) {
                    Toast.makeText(HomeActivity.this, "UiTM Selected", Toast.LENGTH_SHORT).show();
                    Intent intentUni = new Intent(HomeActivity.this, UniActivity.class);
                    startActivity(intentUni);
                } else if (id == R.id.student) {
                    Toast.makeText(HomeActivity.this, "Student Portal Selected", Toast.LENGTH_SHORT).show();
                    Intent intentStd= new Intent(HomeActivity.this, StudentActivity.class);
                    startActivity(intentStd);
                }
                return false;
            }
        });


        aboutMe = (ImageButton) findViewById(R.id.aboutme);
        aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAboutMe = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(intentAboutMe);
            }
        });
        about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(intentAbout);
            }
        });


        hobbies = (ImageButton) findViewById(R.id.hobbies);
        hobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHobbies = new Intent(HomeActivity.this, HobbiesActivity.class);
                startActivity(intentHobbies);
            }
        });
        hobby = (Button) findViewById(R.id.hobby);
        hobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHobby = new Intent(HomeActivity.this, HobbiesActivity.class);
                startActivity(intentHobby);
            }
        });


        skills = (ImageButton) findViewById(R.id.skills);
        skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSkills = new Intent(HomeActivity.this, SkillsActivity.class);
                startActivity(intentSkills);
            }
        });
        skill = (Button) findViewById(R.id.skill);
        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSkill = new Intent(HomeActivity.this, SkillsActivity.class);
                startActivity(intentSkill);
            }
        });


        timetable = (ImageButton) findViewById(R.id.timetable);
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTime = new Intent(HomeActivity.this, TimeTableActivity.class);
                startActivity(intentTime);
            }
        });
        table = (Button) findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTable = new Intent(HomeActivity.this, TimeTableActivity.class);
                startActivity(intentTable);
            }
        });
    }
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}

