package com.example.moviesapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {



    public MoviesFragment() {

    }

    MoviesAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movies, container, false);

        String genre = null;
        if(getArguments() != null){
            genre = getArguments().getString("GENRE");
        }


        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        GridLayoutManager glmenager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(glmenager);

        List<Movie> movies = MoviesRepository.createMovies();

        List<Movie> filteredMovies = new ArrayList<>();
        for (int i = 0; i<movies.size(); i++){
            Movie movie = movies.get(i);
            if(genre.equals(movie.getGenre())){
                filteredMovies.add(movie);
            }
        }


        adapter = new MoviesAdapter(filteredMovies, getContext(), getFragmentManager());
        recyclerView.setAdapter(adapter);

        return rootView;


    }



}
