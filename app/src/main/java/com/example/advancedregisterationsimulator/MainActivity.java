package com.example.advancedregisterationsimulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;
    private Button uselessButton;
    private EditText userName;
    private EditText userEmail;
    private EditText userPassword;
    private EditText reEnterPassword;
    private CheckBox agreeBox;
    private RadioGroup genderGroup;
    private Button registerButton;
    private Spinner countrySpinner;



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

        countrySpinner = findViewById(R.id.countrySpinner);

        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().isEmpty()) {
                    Snackbar.make(parent, "Please fill in your name", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Go to fill it", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                }else if (userEmail.getText().toString().isEmpty()) {
                    Snackbar.make(parent, "Please fill in your Email", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Go to fill it", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else if (userPassword.getText().toString().isEmpty()) {
                    Snackbar.make(parent, "Please fill in your password", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Go to fill it", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else if (reEnterPassword.getText().toString().isEmpty()) {
                    Snackbar.make(parent, "Please re enter your password", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Go to fill it", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else if (!reEnterPassword.getText().toString().equals(userPassword.getText().toString())) {
                    Snackbar.make(parent, "Please enter the same password", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Re enter your password", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else if (genderGroup.getCheckedRadioButtonId() == -1) {
                    Snackbar.make(parent, "Please select your gender", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Go to select it", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else if (!agreeBox.isChecked()) {
                    Snackbar.make(parent, "Please agree our license", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Retry", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(MainActivity.this, "Go to check it", Toast.LENGTH_SHORT).show();
                                }
                            })
                            .show();
                } else {
                    int ID = genderGroup.getCheckedRadioButtonId();
                    switch (ID) {
                        case R.id.radioMale:

                    }
//                    Snackbar.make(parent, "Please confirm your information: "
//                                    + userName.getText().toString()
//                            + ", " + userEmail.getText().toString()
//                            + ", " + selectedGender
//                            + "," + countrySpinner.getSelectedItem().toString(),
//                            Snackbar.LENGTH_INDEFINITE)
//                            .setAction("Confirm", new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    Snackbar.make(parent, "Congratulations! You have registered successfully.", Snackbar.LENGTH_INDEFINITE)
//                                            .setAction("OK", new View.OnClickListener() {
//                                                @Override
//                                                public void onClick(View v) {
//                                                    return;
//                                                }
//                                            }).show();
//                                }
//                            })
//                            .setAction("Retry", new View.OnClickListener() {
//                                @Override
//                                public void onClick(View v) {
//                                    Toast.makeText(MainActivity.this, "Go to change what you want", Toast.LENGTH_SHORT).show();
//                                }
//                            }).show();
                }
            }
        });


        ArrayList<String> countries = new ArrayList<>();
        countries.add("France");
        countries.add("UK");
        countries.add("Deutschland");
        countries.add("Belgique");
        countries.add("España");
        countries.add("Italia");
        countries.add("中国");
        countries.add("US");
        countries.add("日本");
        countries.add("朝鲜");
        countries.add("Others/Autres/其他");

        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                countries
        );

        countrySpinner.setAdapter(countriesAdapter);



        uselessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parent, "Picture already selected", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}