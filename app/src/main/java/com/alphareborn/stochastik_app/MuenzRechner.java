package com.alphareborn.stochastik_app;

import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MuenzRechner extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muenze_rechner_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Zurück");



        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            TextView text = (TextView) findViewById(R.id.output);
            TextView text2 = (TextView) findViewById(R.id.output2);
            EditText input = (EditText) findViewById(R.id.wurfzahl);


            @Override
            public void onClick(View v) {

                int zahlcounter = 0;
                int kopfcounter = 0;
                int number;


              number = Integer.parseInt(input.getText().toString());


                for (int i = 0; i < number; i++) {
                    if (Math.random() < 0.5)
                        text.setText("Kopf: " + ++kopfcounter);
                    else
                        text2.setText("Zahl: " + ++zahlcounter);

                }

                if (kopfcounter == number)
                    text2.setText("Zahl: " + "0");

                if (zahlcounter == number)
                    text.setText("Kopf: " + "0");

            }



        });


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}