package com.example.moviesapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

import java.util.List;

public class ChoiseDialog extends DialogFragment {

    private DialogChoiser listener;

    public ChoiseDialog(DialogChoiser listener) {

        this.listener = listener;
    }




    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_layout, null);

        final TextView movieSelected = view.findViewById(R.id.movieSelected);
        Button addToFaforites = view.findViewById(R.id.addToFavorites);
        addToFaforites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.addFavorites();
                dismiss();

            }
        });

        Button removeFromFavorites = view.findViewById(R.id.removeFromFavorites);
        removeFromFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.removeFromFavorites();
                dismiss();
            }
        });

        Button deleteButton = view.findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.removeItem();
                dismiss();

            }
        });

        builder.setView(view)
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });


        return builder.create();
    }

    interface DialogChoiser {
        void removeItem ();
        void addFavorites();
        void removeFromFavorites();

    }

}
