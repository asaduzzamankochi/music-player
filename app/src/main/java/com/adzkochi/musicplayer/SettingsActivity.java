package com.adzkochi.musicplayer;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by kochi on 26-May-15.
 */
public class SettingsActivity extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
