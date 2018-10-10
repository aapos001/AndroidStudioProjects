package apost.example.com.HelloConstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private TextView mZeroB;
    private TextView mCountB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mZeroB = (TextView) findViewById(R.id.button_zero);
        mCountB = (TextView)findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            mZeroB.setBackgroundResource(R.color.colorPrimaryDark);
        }
        if(mCount % 2 == 0) {
            mCountB.setBackgroundResource(R.color.colorPrimary);
        }
        else {
            mCountB.setBackgroundResource(R.color.colorAccent);
        }
    }

    public void Zero(View view) {
        mCount = 0;
        mZeroB.setBackgroundColor( -7829368);
        mShowCount.setText(Integer.toString(mCount));
    }
}
