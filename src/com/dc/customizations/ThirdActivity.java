package com.dc.customizations;

import com.dc.customizations.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.preference.PreferenceFragment;

public class ThirdActivity extends PreferenceFragment {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);	
        addPreferencesFromResource(R.xml.hub);        
    }
}
