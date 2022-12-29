package com.example.advancedregisterationsimulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private Button uselessButton;
    private EditText userName;
    private EditText userEmail;
    private EditText userPassword;
    private EditText reEnterPassword;
    private CheckBox agreeBox;
    private RadioGroup genderGroup;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parentLayout);
        uselessButton = findViewById(R.id.uselessButton);

        agreeBox = findViewById(R.id.agreeBox);

        genderGroup = findViewById(R.id.genderGroup);

        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);
        reEnterPassword = findViewById(R.id.reEnterPassword);

        uselessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parent, "Picture already selected", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}