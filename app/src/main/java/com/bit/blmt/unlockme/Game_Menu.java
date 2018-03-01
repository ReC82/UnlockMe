package com.bit.blmt.unlockme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Game_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__menu);
        String level_intent;
        int ACTUAL_LEVEL = 1;
        player Player = new player("test",ACTUAL_LEVEL,0,false,"101","myemail@gmail.com");

        Intent nextAction = new Intent(this,get_levelIntent(Player.getLevel()));
        startActivity(nextAction);
    }

    private Class get_levelIntent(int level)
    {
        Class levelclass = null;
        try {
            levelclass = Class.forName("com.bit.blmt.unlockme.gm_Level" + level);
        }
        catch (ClassNotFoundException e)
        {
            Log.e("ClassNotFoundException","Error class not found : " + levelclass.toString());
        }
        return levelclass;
    }
}
