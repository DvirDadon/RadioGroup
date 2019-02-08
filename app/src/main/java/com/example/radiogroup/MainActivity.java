package com.example.radiogroup;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
RadioButton rbR;
RadioButton rbB;
RadioButton rbY;
LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbR = (RadioButton) findViewById(R.id.rbR);
        rbB = (RadioButton) findViewById(R.id.rbB);
        rbY = (RadioButton) findViewById(R.id.rbY);
        ll = (LinearLayout) findViewById(R.id.ll);
    }
    public void btnChangeColor(View view) {
        if (rbR.isChecked())
            ll.setBackgroundColor(Color.RED);
        if (rbB.isChecked())
            ll.setBackgroundColor(Color.BLUE);
        if (rbY.isChecked())
            ll.setBackgroundColor(Color.YELLOW);

    }
    public void btnBackToStandard(View view) {
        ll.setBackgroundColor(Color.WHITE);
    }
}
