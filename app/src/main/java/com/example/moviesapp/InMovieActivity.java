package com.example.moviesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class InMovieActivity extends AppCompatActivity {

    ImageView imUrl;
    TextView imName;
    TextView imYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_movie);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        imUrl = findViewById(R.id.inMovieUrl);
        imName = findViewById(R.id.inMovieName);
        imYear = findViewById(R.id.inMovieYear);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("MovieName");
        String year = intent.getExtras().getString("MovieYear");
        String url = intent.getExtras().getString("MovieUrl");


        Glide.with(imUrl.getContext()).load(url).into(imUrl);
        imName.setText(name);
        imYear.setText(year);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
