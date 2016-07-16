package com.granthutchison.stifdev_tap.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.granthutchison.stifdev_tap.Model.Controller;
import com.granthutchison.stifdev_tap.R;

public class MainActivity extends AppCompatActivity {

    private TextView btnPlay;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Controller.initInstance();
        setContentView(R.layout.activity_main);
        btnPlay = (TextView) findViewById(R.id.playClick);



        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, ScenarioActivity.class);
                startActivity(intent);

            }
        });
    }

    //TODO: Override onBackPressed to always exit the game from this activity, even if not the first page.



}
