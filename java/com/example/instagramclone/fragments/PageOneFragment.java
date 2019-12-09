package com.example.instagramclone.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.instagramclone.GlobalApplication;
import com.example.instagramclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageOneFragment extends Fragment implements View.OnClickListener {

    private NavController navController;


    public PageOneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            /*switch (GlobalApplication.getVpCurrentPosition()) {
                case 0:
                    navController.navigate(R.id.action_pageOneFragment_to_pageTwoFragment);
                    break;
                case 1:
                    navController.navigate(R.id.action_pageOneFragment2_to_pageTwoFragment2);
                    break;
                case 2:
                    navController.navigate(R.id.action_pageOneFragment3_to_pageTwoFragment3);
                    break;
            }*/
            navController.navigate(R.id.action_pageOneFragment_to_pageTwoFragment);
        }
    }
}
