package apost.example.com.twoactivitieschallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewOne;
    private TextView textViewTwo;
    private TextView textViewThree;

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewOne = findViewById(R.id.text_one);
        textViewTwo = findViewById(R.id.text_two);
        textViewThree = findViewById(R.id.text_three);
        Intent intent = getIntent();
        String textNumber = intent.getStringExtra(MainActivity.TEXT_NUMBER);
        textViewOne.setVisibility(View.VISIBLE);
        Log.d(LOG_TAG, textNumber);
        if(textNumber == "1") {
//            textViewOne.setVisibility(View.VISIBLE);
        }
        else if(textNumber == "2") {
            textViewTwo.setVisibility(View.VISIBLE);
        }
        else if(textNumber == "3") {
//            textViewThree.setVisibility(View.VISIBLE);
        }

    }


}
