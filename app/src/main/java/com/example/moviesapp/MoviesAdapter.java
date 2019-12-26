package com.example.moviesapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

import static android.app.PendingIntent.getActivity;
import static android.os.Build.VERSION_CODES.M;
import static androidx.constraintlayout.widget.Constraints.TAG;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {

    private List<Movie> movies;
    private Context context;
    private FragmentManager fragmentManager;





    public MoviesAdapter(List<Movie> movies, Context context, FragmentManager fragmentManager){
        this.movies = movies;
        this.context = context;
        this.fragmentManager = fragmentManager;

    }



    public void sort(boolean byYear) {
//        ja sortiras movies listata

        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View mView = (View) inflater.inflate(R.layout.movie_item, parent , false);

        MoviesViewHolder viewHolder = new MoviesViewHolder(mView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MoviesViewHolder holder, int position) {
        Movie movie = movies.get(position);

        holder.ivName.setText(movie.getName());
        holder.ivYear.setText(movie.getYear());

        String uri = movie.getUrl();
        Glide.with(holder.ivImage.getContext()).load(uri).into(holder.ivImage);


    }

    @Override
    public int getItemCount() { return movies.size(); }

    public class MoviesViewHolder extends RecyclerView.ViewHolder {

        public TextView ivName;
        public TextView ivYear;
        public ImageView ivImage;



        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            ivName = itemView.findViewById(R.id.tvName);
            ivYear = itemView.findViewById(R.id.tvYear);
            ivImage = itemView.findViewById(R.id.imageView);





            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {


                    final ChoiseDialog choiseDialog = new ChoiseDialog(new ChoiseDialog.DialogChoiser() {

                        Movie movie = movies.get(getAdapterPosition());




                        @Override
                        public void removeItem() {
                            movies.remove(getAdapterPosition());
                            notifyItemRemoved(getAdapterPosition());
                            Toast.makeText(context, "Movie deleted", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void addFavorites() {
                            movie.setFavorites(true);
                            Toast.makeText(context, "Movie added to favorites", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void removeFromFavorites() {
                            movie.setFavorites(false);
                            notifyItemRemoved(getAdapterPosition());
                            Toast.makeText(context, "Movie removed from favorites", Toast.LENGTH_SHORT).show();
                        }


                    });
                    choiseDialog.show(fragmentManager, "bilo sto");

                    return true;
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(context, InMovieActivity.class);
                    intent.putExtra("MovieName", movies.get(getAdapterPosition()).getName());
                    intent.putExtra("MovieYear", movies.get(getAdapterPosition()).getYear());
                    intent.putExtra("MovieUrl", movies.get(getAdapterPosition()).getUrl());


                    context.startActivity(intent);
//
                }
            });


        }
    }



}
