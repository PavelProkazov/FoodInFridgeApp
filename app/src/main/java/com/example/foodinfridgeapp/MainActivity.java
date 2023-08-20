package com.example.foodinfridgeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodinfridgeapp.ocrreader.OcrCaptureActivity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button scanButton;
    private Button addProductButton;
    private EditText foodList_edit;
    private ListView textFoodList;
    private EditText expireDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        scanButton = findViewById(R.id.ScanButton);

        addProductButton = findViewById(R.id.addProductButton);
        foodList_edit = findViewById(R.id.FoodListEditText);
        textFoodList = findViewById(R.id.TextFoodList);
        expireDate = findViewById(R.id.FoodListEditData);

        HashMap<String, String> map = new HashMap();
        ArrayList<String> arrayList = new ArrayList<>();


        final ArrayAdapter<String>  adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, arrayList);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (foodList_edit.getText().toString().trim().equals("")
                        &&
                        expireDate.getText().toString().trim().equals("")) {

                    Toast.makeText(MainActivity.this,
                            R.string.no_text_input, Toast.LENGTH_LONG).show();
                   /**/
                }
                else {

                    arrayList.add(expireDate.getText()+" | "+foodList_edit.getText());

                    // Привяжем массив через адаптер к ListView
                    textFoodList.setAdapter(adapter);

                }

            }
        });


    }



    public void startScanText(View v){
        Intent intent = new Intent(this, OcrCaptureActivity.class);
        startActivity(intent);

    }




}