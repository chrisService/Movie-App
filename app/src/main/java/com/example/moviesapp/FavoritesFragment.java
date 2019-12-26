package com.example.moviesapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {


    public FavoritesFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favorites, container, false);
        // Inflate the layout for this fragment


        RecyclerView recyclerView = rootView.findViewById(R.id.favoritesRecyclerView);
        GridLayoutManager glmenager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(glmenager);

        boolean fave = true;

        List<Movie> movies = MoviesRepository.movies;

        List<Movie> favoriteMovies = new ArrayList<>();
        for (int i = 0; i<movies.size(); i++){
            Movie movie = movies.get(i);
            if(fave == (movie.isFavorites())){
                favoriteMovies.add(movie);
            }
        }




        final MoviesAdapter favoriteadapter = new MoviesAdapter(favoriteMovies, getContext(), getFragmentManager());
        recyclerView.setAdapter(favoriteadapter);

        return rootView;


    }

}
