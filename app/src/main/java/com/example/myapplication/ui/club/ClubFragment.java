package com.example.myapplication.ui.club;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentClubBinding;

public class ClubFragment extends Fragment {

    private FragmentClubBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ClubViewModel clubViewModel =
                new ViewModelProvider(this).get(ClubViewModel.class);

        binding = FragmentClubBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textClub;
        clubViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}