package com.example.covidAP;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class Categ_main extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.category_layout, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );

        view.findViewById(R.id.back_to_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Categ_main.this)
                        .navigate(R.id.action_CategNav_to_MainHome);
            }
        }
        );
    }
}