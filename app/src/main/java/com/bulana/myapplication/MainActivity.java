package com.bulana.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_PICK_ITEM = 1;

    private TextView rowOne;
    private TextView rowTwo;
    private TextView rowThree;
    private TextView rowFour;
    private TextView rowFive;
    private TextView rowSix;
    private TextView rowSeven;
    private TextView rowEight;
    private TextView rowNine;
    private TextView rowTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rowOne = findViewById(R.id.row_one);
        rowTwo = findViewById(R.id.row_two);
        rowThree = findViewById(R.id.row_three);
        rowFour = findViewById(R.id.row_four);
        rowFive = findViewById(R.id.row_five);
        rowSix = findViewById(R.id.row_six);
        rowSeven = findViewById(R.id.row_seven);
        rowEight = findViewById(R.id.row_eight);
        rowNine = findViewById(R.id.row_nine);
        rowTen = findViewById(R.id.row_ten);
    }

    public void addItem(View view) {
        Intent pickItemIntent = new Intent(this, ItemList.class);
        startActivityForResult(pickItemIntent, REQUEST_PICK_ITEM);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PICK_ITEM && resultCode == RESULT_OK && null != data) {
            String itemName = data.getStringExtra(ItemList.EXTRA_PICKED_ITEM);
            rowOne.setText(itemName);
            rowTwo.setText(itemName);
            rowThree.setText(itemName);
            rowFour.setText(itemName);
            rowFive.setText(itemName);
            rowSix.setText(itemName);
            rowSeven.setText(itemName);
            rowEight.setText(itemName);
            rowNine.setText(itemName);
            rowTen.setText(itemName);
        }
    }
}


