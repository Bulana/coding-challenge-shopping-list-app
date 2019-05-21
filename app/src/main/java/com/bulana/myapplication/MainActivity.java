package com.bulana.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

            if (rowOne.getText().toString().isEmpty()) {
                rowOne.setText(itemName);
            } else if (rowTwo.getText().toString().isEmpty()) {
                rowTwo.setText(itemName);
            } else if (rowThree.getText().toString().isEmpty()) {
                rowThree.setText(itemName);
            } else if (rowFour.getText().toString().isEmpty()) {
                rowFour.setText(itemName);
            } else if (rowFive.getText().toString().isEmpty()) {
                rowFive.setText(itemName);
            } else if (rowSix.getText().toString().isEmpty()) {
                rowSix.setText(itemName);
            } else if (rowSeven.getText().toString().isEmpty()) {
                rowSeven.setText(itemName);
            } else if (rowEight.getText().toString().isEmpty()) {
                rowEight.setText(itemName);
            } else if (rowNine.getText().toString().isEmpty()) {
                rowNine.setText(itemName);
            } else if (rowTen.getText().toString().isEmpty()) {
                rowTen.setText(itemName);
            }
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Save the user's current game state
//        savedInstanceState.putInt("score", mCurrentScore);
//        savedInstanceState.putInt("level", mCurrentLevel);
    }
}


