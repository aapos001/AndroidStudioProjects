package apost.example.com.hellotoast02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import apost.example.com.hellotoast02.R;

public class MainActivity extends AppCompatActivity {

    public int mCount = 0;
    private TextView mShowCount;
    public static final String COUNT = "apost.example.com.hellotoast02.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(COUNT, Integer.toString(mCount));
        startActivity(intent);

//        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
//        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }


    }
}
