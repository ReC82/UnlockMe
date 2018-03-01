package com.bit.blmt.unlockme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go_to_game(View v)
    {
        Intent nextAction = new Intent(this,Game_Menu.class);
        startActivity(nextAction);
    }
}
