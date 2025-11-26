package com.example.siri_clone.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> recognizedText = new MutableLiveData<>();
    private final MutableLiveData<String> tipText = new MutableLiveData<>();

    public LiveData<String> getRecognizedText() {
        return recognizedText;
    }

    public LiveData<String> getTipText() {
        return tipText;
    }

    public void setRecognizedText(String text) {
        recognizedText.setValue(text);
    }

    public void setTipText(String text) {
        tipText.setValue(text);
    }
}
