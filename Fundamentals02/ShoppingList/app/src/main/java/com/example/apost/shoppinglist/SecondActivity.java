package com.example.apost.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_GROCERY = "com.example.apost.shoppinglist.extra.MESSAGE";

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void AddGrocery(View view) {
        Intent intent = new Intent();

        switch(view.getId()) {
            case R.id.button_fruit:
                intent.putExtra(EXTRA_GROCERY, "Fruit");
                break;

            case R.id.button_milk:
                intent.putExtra(EXTRA_GROCERY, "Milk");
                break;

            case R.id.button_cereal:
                intent.putExtra(EXTRA_GROCERY, "Cereal");
                break;

            case R.id.button_eggs:
                intent.putExtra(EXTRA_GROCERY, "Eggs");
                break;

            case R.id.button_bread:
                intent.putExtra(EXTRA_GROCERY, "Bread");
                break;
        }

        setResult(RESULT_OK, intent);
        finish();
    }
}
