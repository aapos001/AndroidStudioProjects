package com.example.apost.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView List1, List2, List3, List4, List5, List6, List7, List8, List9;
    private int listsCounter = 0;
    public static final int GROCERY_REQUEST = 1;


    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String grocery = intent.getStringExtra(SecondActivity.EXTRA_GROCERY);
        List1 = findViewById(R.id.List1);
        List2 = findViewById(R.id.List2);
        List3 = findViewById(R.id.List3);
        List4 = findViewById(R.id.List4);
        List5 = findViewById(R.id.List5);
        List6 = findViewById(R.id.List6);
        List7 = findViewById(R.id.List7);
        List8 = findViewById(R.id.List8);
        List9 = findViewById(R.id.List9);
    }

    public void launchAddItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, GROCERY_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GROCERY_REQUEST) {
            if(resultCode == RESULT_OK) {
                String grocery = data.getStringExtra(SecondActivity.EXTRA_GROCERY);
                switch(listsCounter) {
                    case 0:
                        List1.setText(grocery);
                        List1.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 1:
                        List2.setText(grocery);
                        List2.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 2:
                        List3.setText(grocery);
                        List3.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 3:
                        List4.setText(grocery);
                        List4.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 4:
                        List5.setText(grocery);
                        List5.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 5:
                        List6.setText(grocery);
                        List6.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 6:
                        List7.setText(grocery);
                        List7.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 7:
                        List8.setText(grocery);
                        List8.setVisibility(View.VISIBLE);
                        listsCounter++;
                        break;

                    case 8:
                        List9.setText(grocery);
                        List9.setVisibility(View.VISIBLE);
                        listsCounter = 0;
                        break;
                }
            }
        }
    }

}
