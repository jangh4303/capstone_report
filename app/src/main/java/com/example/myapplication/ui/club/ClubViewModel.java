package com.example.myapplication.ui.club;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClubViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ClubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is club fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}