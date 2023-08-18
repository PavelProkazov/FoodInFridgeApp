package com.example.foodinfridgeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.foodinfridgeapp.ocrreader.OcrCaptureActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button scanButton;
    private Button addProductButton;
    private EditText foodList_edit;
    private TextView textFoodList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        scanButton = findViewById(R.id.ScanButton);

        addProductButton = findViewById(R.id.addProductButton);
        foodList_edit = findViewById(R.id.FoodListEditText);
        textFoodList = findViewById(R.id.TextFoodList);

    }



    public void startScanText(View v){
        Intent intent = new Intent(this, OcrCaptureActivity.class);
        startActivity(intent);

    }



}