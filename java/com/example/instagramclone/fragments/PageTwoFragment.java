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
public class PageTwoFragment extends Fragment implements View.OnClickListener {

    private NavController navController;

    public PageTwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page_two, container, false);
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
                    navController.navigate(R.id.action_pageTwoFragment_to_pageThreeFragment);
                    break;
                case 1:
                    navController.navigate(R.id.action_pageTwoFragment2_to_pageThreeFragment2);
                    break;
                case 2:
                    navController.navigate(R.id.action_pageTwoFragment3_to_pageThreeFragment3);
                    break;
            }*/
            navController.navigate(R.id.action_pageTwoFragment_to_pageThreeFragment);
        }
    }
}
