package com.zawss.android.rpm2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    public AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,
                "ca-app-pub-2891742426395204~7644680560"); ///// this is the ADMOB APP ID for RECIPES FOR POCKET MORTYS//////

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }


    public void goToAttacks(View v) {
        startActivity(new Intent(this, attacks.class));
    }
    public void goToMortys(View v) {startActivity(new Intent(this, Mortys.class));}
    public void goToQuests(View v) {startActivity(new Intent(this, Quests.class));}
    public void goToRecipes(View v) {startActivity(new Intent(this, Recipes.class));}





}
