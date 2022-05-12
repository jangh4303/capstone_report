package com.example.myapplication.ui.resume;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentResumeBinding;

public class ResumeFragment extends Fragment {

    private FragmentResumeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ResumeViewModel resumeViewModel =
                new ViewModelProvider(this).get(ResumeViewModel.class);

        binding = FragmentResumeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textResume;
        resumeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}