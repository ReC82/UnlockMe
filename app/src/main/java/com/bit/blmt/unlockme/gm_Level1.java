package com.bit.blmt.unlockme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class gm_Level1 extends AppCompatActivity {

    player Player = new player("test",1,0,false,"1-0-1;2-1-0","myeamil");
    String SlotColor[] = {"red","green","blue"};
    int SlotValue[] = {0,1,2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gm__level1);

    }

    private void check_values(View v)
    {
        String level_codes[] = Player.getCode().split(";");
        String this_level_code = level_codes[Player.getLevel()-1];

        String slot_check[] = this_level_code.split("-");


    }

    public void change_me(View v)
    {
        System.out.println("Slot ID : " + v.getId());
        ImageView thisView = (ImageView) findViewById(v.getId());

    }
}
