package com.gravitational.consultancy.pramod.user.dash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.gravitational.consultancy.pramod.user.R;

public class InterViewTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_view_tips);
        getSupportActionBar().setTitle("InterViewTips");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setTitle("InterViewtips");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    public boolean onOptionsItemSelected(MenuItem menuItem)
    {    int id = menuItem.getItemId();

        if(id== android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

