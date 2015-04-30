package com.example.myapplication;

import android.widget.TextView;

public class MockitoNPE {
    private TextView txtNextStep;
    private TextView txtGateView;

    public void stuff() {
        System.out.println(txtNextStep.getText());
    }
}
