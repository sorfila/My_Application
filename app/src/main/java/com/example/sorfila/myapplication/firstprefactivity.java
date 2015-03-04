package com.example.sorfila.myapplication;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by sorfila on 03/03/2015.
 */
public class firstprefactivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.firstpref);
    }
}
