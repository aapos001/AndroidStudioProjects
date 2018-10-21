package apost.example.com.lifecyclehw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter");
            TextView textView = findViewById(R.id.text_counter);
            String displayCounter = Integer.toString(counter);
            textView.setText(displayCounter);
        }
    }

    public void IncrementCounter(View view) {
        counter++;
        TextView textView = findViewById(R.id.text_counter);
        String displayCounter = Integer.toString(counter);
        textView.setText(displayCounter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(counter > 0) {
            outState.putInt("counter", counter);
        }
    }
}
