package com.mycroft.immersivestatus;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class ColorStatusBarFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color_status_bar, container, false);
        view.findViewById(R.id.black).setOnClickListener(v -> changeColor(ContextCompat.getColor(getContext(), android.R.color.black)));
        view.findViewById(R.id.red).setOnClickListener(v -> changeColor(ContextCompat.getColor(getContext(), android.R.color.holo_red_light)));
        view.findViewById(R.id.blue).setOnClickListener(v -> changeColor(ContextCompat.getColor(getContext(), android.R.color.holo_blue_bright)));
        view.findViewById(R.id.green).setOnClickListener(v -> changeColor(ContextCompat.getColor(getContext(), android.R.color.holo_green_light)));
        view.findViewById(R.id.transparent).setOnClickListener(v -> changeColor(ContextCompat.getColor(getContext(), android.R.color.transparent)));
        return view;
    }

    private void changeColor(int color) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        window.setStatusBarColor(color);
    }
}
