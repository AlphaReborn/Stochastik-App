package com.alphareborn.stochastik_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class UrneMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urne_menu_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Zum Hauptmenü");

        /*RelativeLayout layout = (RelativeLayout) findViewById(R.id.urnerechner);
        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(UrneMenu.this, UrneRechner.class);
                UrneMenu.this.startActivity(myIntent);

            }

        });
*/

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