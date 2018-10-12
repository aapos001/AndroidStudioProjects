package apost.example.com.hellotoast02;

import android.content.Intent;
import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView countText;
    private String counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        countText = findViewById(R.id.count_text);
        Intent intent = getIntent();
        counter = intent.getStringExtra(MainActivity.COUNT);
        countText.setText(counter);
    }
}
