package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rudolf on 3/26/2016.
 */
public class SunshineFragment extends Fragment {

    private static final String TAG = "SunshineFragment";

    public static SunshineFragment newInstance() {

        Bundle args = new Bundle();

        SunshineFragment fragment = new SunshineFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }
}
