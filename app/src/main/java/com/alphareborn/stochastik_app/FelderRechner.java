package com.alphareborn.stochastik_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FelderRechner extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.felder_rechner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Zurück");

        final EditText PvonAundB, PvonASundB, PvonB, PvonAundBS, PvonASundBS, PvonBS, PvonA, PvonAS, PvonG;
        final Button weiter;


        PvonAundB = (EditText) findViewById(R.id.AB);
        PvonASundB = (EditText) findViewById(R.id.ASB);
        PvonB = (EditText) findViewById(R.id.SummeB);
        PvonAundBS = (EditText) findViewById(R.id.ABS);
        PvonASundBS = (EditText) findViewById(R.id.ASBS);
        PvonBS = (EditText) findViewById(R.id.SummeBS);
        PvonA = (EditText) findViewById(R.id.SummeA);
        PvonAS = (EditText) findViewById(R.id.SummeAS);
        PvonG = (EditText) findViewById(R.id.Endsumme);
        weiter = (Button) findViewById(R.id.weiter);

        weiter.setEnabled(false);

        PvonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weiter.setEnabled(true);
            }
        });

        weiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String PvonAundB_V  = PvonAundB.getText().toString();
                String PvonASundB_V = PvonASundB.getText().toString();
                String PvonB_V = PvonB.getText().toString();
                String PvonAundBS_V = PvonAundBS.getText().toString();
                String PvonASundBS_V = PvonASundBS.getText().toString();
                String PvonBS_V = PvonBS.getText().toString();
                String PvonA_V = PvonA.getText().toString();
                String PvonAS_V = PvonAS.getText().toString();
                String PvonG_V = PvonG.getText().toString();

                try {
                    if (PvonAS_V.equals("")){
                        PvonAS.setText("0");
                    } else {
                        int PvonAS_VZ = Integer.valueOf(PvonAS_V);
                    }
                    if (PvonAundB_V.equals("") && PvonASundB_V.equals("")){
                        PvonB.setText("");
                    }else {
                        int PvonAundB_VZ = Integer.valueOf(PvonAundB_V);
                        int PvonASundB_VZ = Integer.valueOf(PvonASundB_V);
                        PvonB.setText(String.valueOf(PvonAundB_VZ+PvonASundB_VZ));
                    }
                    if (PvonAundBS_V.equals("") && PvonASundBS_V.equals("")){
                        PvonBS.setText("");
                    }else {
                        int PvonAundBS_VZ =Integer.valueOf(PvonAundBS_V);
                        int PvonASundBS_VZ =Integer.valueOf(PvonASundBS_V);
                        PvonBS.setText(String.valueOf(PvonAundBS_VZ+PvonASundBS_VZ));
                    }
                    if (PvonAundB_V.equals("") && PvonAundBS_V.equals("")){
                        PvonA.setText("");
                    }else {
                        int PvonAundB_VZ = Integer.valueOf(PvonAundB_V);
                        int PvonAundBS_VZ = Integer.valueOf(PvonAundBS_V);
                        PvonA.setText(String.valueOf(PvonAundB_VZ+PvonAundBS_VZ));
                    }
                    if (PvonASundB_V.equals("") && PvonASundBS_V.equals("")){
                        PvonAS.setText("");
                    }else {
                        int PvonASundB_VZ = Integer.valueOf(PvonASundB_V);
                        int PvonASundBS_VZ = Integer.valueOf(PvonASundBS_V);
                        PvonAS.setText(String.valueOf(PvonASundB_VZ+PvonASundBS_VZ));
                    }
                    if (PvonB_V.equals("") && PvonBS_V.equals("")){
                        PvonG.setText("");
                    }else {
                        int PvonB_VZ = Integer.valueOf(PvonB_V);
                        int PvonBS_VZ = Integer.valueOf(PvonBS_V);
                        PvonG.setText(String.valueOf(PvonB_VZ+PvonBS_VZ));
                    }
                    if (PvonA_V.equals("") && PvonAS_V.equals("")){
                        PvonG.setText("");
                    }else {
                        int PvonA_VZ = Integer.valueOf(PvonA_V);
                        int PvonAS_VZ = Integer.valueOf(PvonAS_V);
                        PvonG.setText(String.valueOf(PvonA_VZ+PvonAS_VZ));
                    }

                    //PvonG.setText(String.valueOf(PvonA_VZ+PvonAS_VZ));

            } catch (NumberFormatException e){
                PvonG.setText("0");
            }
            }

        });

    }

    //Hallo
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
