package com.example.brainworker.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.brainworker.R;


import java.util.Random;

public class AkashicActivity extends AppCompatActivity {

    private int roll;

    int clicks = 0;

    ImageView akasha_loot;
    Button mButton;


    Random r;

    Integer [] images2 = {
            R.raw.akashic_a_blackgauntlet,
            R.raw.akashic_a_bonecrasher,
            R.raw.akashic_a_brock,
            R.raw.akashic_a_cain,
            R.raw.akashic_a_cell,
            R.raw.akashic_a_chaser,
            R.raw.akashic_a_dancing_shadow,
            R.raw.akashic_a_dark_alligator,
            R.raw.akashic_a_eye_beholder,
            R.raw.akashic_a_heavy_earthquake,
            R.raw.akashic_a_heavy_gears,
            R.raw.akashic_a_gallus,
            R.raw.akashic_a_hell_enforcer,
            R.raw.akashic_a_intension_garura,
            R.raw.akashic_a_maraude,
            R.raw.akashic_a_megiddon_maker_mk2,
            R.raw.akashic_a_mucus,
            R.raw.akashic_a_queen_gaura,
            R.raw.akashic_a_ran,
            R.raw.akashic_a_road_buster,
            R.raw.akashic_a_s01,
            R.raw.akashic_a_sedurin,
            R.raw.akashic_a_senia,
            R.raw.akashic_a_senion,
            R.raw.akashic_a_sewer_rat,
            R.raw.akashic_a_stlab,
            R.raw.akashic_a_tempest_left,
            R.raw.akashic_a_victor,
            R.raw.akashic_a_warlike,
            R.raw.akashic_a_warstone

    };

    Integer [] images3 = {
            R.raw.akashic_b_big_asphalt,
            R.raw.akashic_b_force_strike,
            R.raw.akashic_b_fortune,
            R.raw.akashic_b_hicks,
            R.raw.akashic_b_leona,
            R.raw.akashic_b_perry,
            R.raw.akashic_b_rawper,
            R.raw.akashic_b_robert,
            R.raw.akashic_b_sanghun,
            R.raw.akashic_b_sangyup,
            R.raw.akashic_b_sedurin,
            R.raw.akashic_b_sentry_commander,
            R.raw.akashic_b_setsuka_ryoko,
            R.raw.akashic_b_worren

    };

    Integer [] images3s = {
            R.raw.akashic_b_l_lenoch,
            R.raw.akashic_b_l_noa,
            R.raw.akashic_b_l_sion,
            R.raw.akashic_b_ls_lenoch,
            R.raw.akashic_b_ls_noa,
            R.raw.akashic_b_ls_sion

    };

    Integer [] images4 = {
            R.raw.akashic_c_arua,
            R.raw.akashic_c_beneris,
            R.raw.akashic_c_henry,
            R.raw.akashic_c_io,
            R.raw.akashic_c_ralph,
            R.raw.akashic_c_rapidflame,
            R.raw.akashic_c_retro_chii,
            R.raw.akashic_c_retro_erwin,
            R.raw.akashic_c_retro_haru,
            R.raw.akashic_c_retro_iris,
            R.raw.akashic_c_retro_jin,
            R.raw.akashic_c_retro_lily,
            R.raw.akashic_c_retro_stella,
            R.raw.akashic_c_rita,
            R.raw.akashic_c_rita_s,
            R.raw.akashic_c_sedurin,
            R.raw.akashic_c_sedurin_s,
            R.raw.akashic_c_senia,
            R.raw.akashic_c_senia_s,
            R.raw.akashic_c_zenis,
            R.raw.akashic_c_cynthia_hugo
    };
    Integer [] images4s = {
            R.raw.akashic_c_l_yumi,
            R.raw.akashic_c_l_yumi_s
    };
    Integer [] images5 = {
            R.raw.akashic_d_apocalypse,
            R.raw.akashic_d_arua,
            R.raw.akashic_d_arua_s,
            R.raw.akashic_d_bigpuppet,
            R.raw.akashic_d_bigpuppet_s,
            R.raw.akashic_d_eternity,
            R.raw.akashic_d_gluton_army,
            R.raw.akashic_d_juggernaut,
            R.raw.akashic_d_lucy,
            R.raw.akashic_d_lucy_s,
            R.raw.akashic_d_mirium,
            R.raw.akashic_d_mirium_s,
            R.raw.akashic_d_pandemonia,
            R.raw.akashic_d_tenebris,
            R.raw.akashic_d_tenebris_s,
            R.raw.akashic_d_ultimatum
    };
    Integer [] images5s = {
            R.raw.akashic_d_l_amande,
            R.raw.akashic_d_l_amande_s,
            R.raw.akashic_d_l_catherine_s,
            R.raw.akashic_d_l_catherine
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akashic);



        akasha_loot = (ImageView) findViewById(R.id.akasha_loot);
        mButton = (Button) findViewById(R.id.akasha_button);


        r = new Random();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                if (clicks>20){
                    Toast.makeText(AkashicActivity.this,"You've reached the limit !",Toast.LENGTH_SHORT).show();

                }
                else{
                    roll = (int) (Math.random()*200);
                    if(roll<=128){
                        akasha_loot.setImageResource(images2[r.nextInt(images2.length)]);

                    }
                    if((roll>128)&&(roll<=132)){
                    akasha_loot.setImageResource(images3s[r.nextInt(images3s.length)]);
                    }

                    if((roll>125)&&(roll<=183)){
                        akasha_loot.setImageResource(images3[r.nextInt(images3.length)]);
                    }
                    if((roll>183)&&(roll<=189)){
                        akasha_loot.setImageResource(images4[r.nextInt(images4.length)]);
                    }
                    if((roll>189)&&(roll<=192)){
                        akasha_loot.setImageResource(images4s[r.nextInt(images4s.length)]);
                    }
                    if((roll>195)&&(roll<=198)){
                        akasha_loot.setImageResource(images5[r.nextInt(images5.length)]);
                    }
                    if(roll>199){
                        akasha_loot.setImageResource(images5s[r.nextInt(images5s.length)]);
                        Toast.makeText(AkashicActivity.this,"MOM GET THE CAMERA",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}

