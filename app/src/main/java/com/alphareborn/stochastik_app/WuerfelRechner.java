package com.alphareborn.stochastik_app;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WuerfelRechner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wuerfel_rechner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Zurück");

        //Auf Buttonklick reagieren
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            TextView text = (TextView) findViewById(R.id.output);
            TextView text2 = (TextView) findViewById(R.id.output2);
            TextView text3 = (TextView) findViewById(R.id.output3);
            TextView text4 = (TextView) findViewById(R.id.output4);
            TextView text5 = (TextView) findViewById(R.id.output5);
            TextView text6 = (TextView) findViewById(R.id.output6);
            EditText input = (EditText) findViewById(R.id.wurfzahl);


            @Override
            public void onClick(View v) {

                //int-Variablen einführen
                int einscounter = 0;
                int zweicounter = 0;
                int dreicounter = 0;
                int viercounter = 0;
                int fuenfcounter = 0;
                int sechscounter = 0;
                int number;
                double random = 0;

                //Alle Felder 0 setzen
                text.setText("Einsen: 0");
                text2.setText("Zweien: 0");
                text3.setText("Dreien: 0");
                text4.setText("Vieren: 0");
                text5.setText("Fünfen: 0");
                text6.setText("Sechsen: 0");

                //Anzahl der Würfe toString()
                number = Integer.parseInt(input.getText().toString());


                //Würfelfunktion
                for (int i = 0; i < number; i++) {

                    random = Math.random();

                    if (random <= 0.1666666667)
                        text.setText("Einsen: " + ++einscounter);
                    if (random > 0.1666666667 && random <= 0.3333333333)
                        text2.setText("Zweien: " + ++zweicounter);
                    if (random > 0.3333333333 && random <= 0.5)
                        text3.setText("Dreien: " + ++dreicounter);
                    if (random > 0.5 && random <= 0.6666666667)
                        text4.setText("Vieren: " + ++viercounter);
                    if (random > 0.6666666667 && random <= 0.8333333334)
                        text5.setText("Fünfen: " + ++fuenfcounter);
                    if (random > 0.8333333334 && random <= 1)
                        text6.setText("Sechsen: " + ++sechscounter);

                }


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