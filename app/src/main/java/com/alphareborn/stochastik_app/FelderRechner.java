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
                    if (PvonAS_V.equals("") && PvonA_V.equals("") && PvonB_V.equals("") && PvonBS_V.equals("") && PvonASundB_V.equals("") && PvonAundB_V.equals("") && PvonASundBS_V.equals("") && PvonAundBS_V.equals("")){
                        PvonG.setText("0");
                    } else {
                        Log.d("Stochastik-App", "1");
                        if (PvonAundB_V.equals("") && PvonASundB_V.equals("") && PvonB_V.equals("")) {
                            if (PvonAundBS_V.equals("") && PvonASundBS_V.equals("") && PvonBS_V.equals("")) {
                                if (PvonA_V.equals("") && PvonAS_V.equals("") && PvonG_V.equals("")) {
                                    PvonG.setText("blub");
                                } else {
                                    if (PvonA_V.equals("")) {
                                        int PvonAS_VZ = Integer.valueOf(PvonAS_V);
                                        int PvonG_VZ = Integer.valueOf(PvonG_V);
                                        PvonA.setText(String.valueOf(PvonG_VZ - PvonAS_VZ));
                                        PvonAS.setText(String.valueOf(PvonAS_VZ));
                                        PvonG.setText(String.valueOf(PvonG_VZ));
                                    } else {
                                        if (PvonAS_V.equals("")) {
                                            int PvonA_VZ = Integer.valueOf(PvonA_V);
                                            int PvonG_VZ = Integer.valueOf(PvonG_V);
                                            PvonAS.setText(String.valueOf(PvonG_VZ - PvonA_VZ));
                                            PvonG.setText(String.valueOf(PvonG_VZ));
                                            PvonA.setText(String.valueOf(PvonA_VZ));
                                        } else {
                                            if (PvonG_V.equals("")) {
                                                int PvonA_VZ = Integer.valueOf(PvonA_V);
                                                int PvonAS_VZ = Integer.valueOf(PvonAS_V);
                                                PvonG.setText(String.valueOf(PvonA_VZ + PvonAS_VZ));
                                                PvonAS.setText(String.valueOf(PvonAS_VZ));
                                                PvonA.setText(String.valueOf(PvonA_VZ));
                                            }
                                        }
                                    }
                                } //hier muss noch was
                            }else {
                                if (PvonAundBS_V.equals("")){
                                    int PvonASundBS_VZ = Integer.valueOf(PvonASundBS_V);
                                    int PvonBS_VZ = Integer.valueOf(PvonBS_V);
                                    PvonAundBS.setText(String.valueOf(PvonBS_VZ-PvonASundBS_VZ));
                                    PvonBS.setText(String.valueOf(PvonBS_VZ));
                                    PvonASundBS.setText(String.valueOf(PvonASundBS_VZ));
                                }else {
                                    if (PvonASundBS_V.equals("")){
                                        int PvonAundBS_VZ = Integer.valueOf(PvonAundBS_V);
                                        int PvonBS_VZ = Integer.valueOf(PvonBS_V);
                                        PvonASundBS.setText(String.valueOf(PvonBS_VZ-PvonAundBS_VZ));
                                        PvonBS.setText(String.valueOf(PvonBS_VZ));
                                        PvonAundBS.setText(String.valueOf(PvonAundBS_VZ));
                                    }else {
                                        if (PvonBS_V.equals("")){
                                            int PvonAundBS_VZ = Integer.valueOf(PvonAundBS_V);
                                            int PvonASundBS_VZ = Integer.valueOf(PvonASundBS_V);
                                            PvonBS.setText(String.valueOf(PvonAundBS_VZ+PvonASundBS_VZ));
                                            PvonAundBS.setText(String.valueOf(PvonAundBS_VZ));
                                            PvonASundBS.setText(String.valueOf(PvonASundBS_VZ));
                                        }
                                    }
                                }
                            } //hier auch
                        }else {
                            Log.d("Stochastik-App", "2");
                            if (PvonAundB_V.equals("")){
                                int PvonASundB_VZ = Integer.valueOf(PvonASundB_V);
                                int PvonB_VZ = Integer.valueOf(PvonB_V);
                                PvonAundB.setText(String.valueOf(PvonB_VZ-PvonASundB_VZ));
                                PvonB.setText(String.valueOf(PvonB_VZ));
                                PvonASundB.setText(String.valueOf(PvonASundB_VZ));
                            }else {
                                Log.d("Stochastik-App", "3");
                                if (PvonASundB_V.equals("")){
                                    int PvonAundB_VZ = Integer.valueOf(PvonAundB_V);
                                    int PvonB_VZ = Integer.valueOf(PvonB_V);
                                    PvonASundB.setText(String.valueOf(PvonB_VZ-PvonAundB_VZ));
                                    PvonB.setText(String.valueOf(PvonB_VZ));
                                    PvonAundB.setText(String.valueOf(PvonAundB_VZ));
                                }else {
                                    Log.d("Stochastik-App", "4");
                                    if (PvonB_V.equals("")){
                                        int PvonAundB_VZ = Integer.valueOf(PvonAundB_V);
                                        int PvonASundB_VZ = Integer.valueOf(PvonASundB_V);
                                        PvonB.setText(String.valueOf(PvonAundB_VZ+PvonASundB_VZ));
                                        PvonAundB.setText(String.valueOf(PvonAundB_VZ));
                                        PvonASundB.setText(String.valueOf(PvonASundB_VZ));
                                    }
                                }
                            }
                        } //hier auch!
                    }
                } catch (NumberFormatException e){
                    PvonG.setText("Geht nicht!");
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
