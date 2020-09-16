package com.example.snackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button openButton, closeButton;
    private Snackbar mSnackbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openButton = findViewById(R.id.buttonOpen);
        closeButton = findViewById(R.id.buttonClose);

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Open Snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Confirm", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openButton.setText("Button open alert");
                    }
                }).setActionTextColor(getResources().getColor(R.color.colorPrimary)).show();

            }
        });

        /*closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSnackbar.dismiss();
            }
        });
         */

    }


}