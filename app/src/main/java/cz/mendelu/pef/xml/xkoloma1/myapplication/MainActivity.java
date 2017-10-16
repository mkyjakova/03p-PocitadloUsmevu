package cz.mendelu.pef.xml.xkoloma1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTextView = (TextView) findViewById(R.id.counterTextView);
    }

    public void positive(View view) {
        score++;
        counterTextView.setText(Integer.toString(score));
    }

    public void negative(View view) {
        score--;
        counterTextView.setText(Integer.toString(score));
    }
}
