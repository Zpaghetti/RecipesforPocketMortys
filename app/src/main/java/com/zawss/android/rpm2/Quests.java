package com.zawss.android.rpm2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class Quests extends AppCompatActivity {

    public AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quests);

        MobileAds.initialize(this,
                "ca-app-pub-2891742426395204~7644680560"); ///// this is the ADMOB APP ID for RECIPES FOR POCKET Quests//////

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}
