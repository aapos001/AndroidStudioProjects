package apost.example.com.twoactivitieschallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT_NUMBER = "apost.example.com.twoactivitieschallenge.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchTextOneActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TEXT_NUMBER, "1");
        startActivity(intent);
    }

    public void launchTextTwoActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TEXT_NUMBER, "2");
        startActivity(intent);
    }

    public void launchTextThreeActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TEXT_NUMBER, "3");
        startActivity(intent);
    }
}
