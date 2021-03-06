package com.example.a507.myapplication0905;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected Button button;
    protected TextView textView;
    protected int nCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nCount++;
                String sCount = String.format("Count = %d", nCount);
                textView.setText(sCount);
                Toast.makeText(getBaseContext(), sCount, Toast.LENGTH_SHORT).show();
            }
        });

        textView = (TextView) findViewById(R.id.textView);

        nCount = 0;

    }
}
