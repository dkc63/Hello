package com.example.davis.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {

        private int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    public void onClick(View v)
    {
           Button b = (Button) v;
            String bText = (String) b.getText();
            int value = Integer.parseInt(bText);
            total += value;

            TextView myTextView = (TextView) findViewById(R.id.myTextView);

            myTextView.setText(Integer.toString(total));
    }
}
