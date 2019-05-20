package com.bulana.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemList extends AppCompatActivity {
    public static final String EXTRA_PICKED_ITEM = "com.bulana.myapplication.extra.PICKED_ITEM";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }

    public void returnItem(View view) {

        Button pickedItemButton = (Button) view;
        String pickedItemName = pickedItemButton.getText().toString();

        Intent sendPickedItemIntent = new Intent();
        sendPickedItemIntent.putExtra(EXTRA_PICKED_ITEM, pickedItemName);
        setResult(RESULT_OK, sendPickedItemIntent);
        finish();
    }
}

