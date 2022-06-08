package com.example.enumtem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView outputTv;
    private Button catBtn, dogBtn, frogBtn, rabbitBtn;
    private Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setReferences();

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animal = Animal.CAT;
                outputTv.setText(animal.getAnimal());
            }
        });

        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputTv.setText(Animal.DOG.getAnimal());
            }
        });

        frogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputTv.setText(Animal.FROG.getAnimal());
            }
        });

        rabbitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputTv.setText(Animal.RABBIT.getAnimal());
            }
        });
    }

    private void setReferences(){
        outputTv = findViewById(R.id.output_tv);
        catBtn = findViewById(R.id.cat_btn);
        dogBtn = findViewById(R.id.dog_btn);
        frogBtn = findViewById(R.id.frog_btn);
        rabbitBtn = findViewById(R.id.rabbit_btn);
    }
}