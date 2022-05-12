package com.example.myapplication.ui.resume;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.Activity_Resume;
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


        Button button = binding.btnWrite;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Activity_Resume.class);
                startActivity(intent);
            }
        });




        resumeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}