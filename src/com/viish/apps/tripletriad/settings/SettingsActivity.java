// import game specific packages
package com.viish.apps.tripletriad.settings;

// import java packages
import java.util.List;

// import android packages
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

import com.viish.apps.tripletriad.R;

public class SettingsActivity extends PreferenceActivity {    
    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);
    }
    
    public static class RulesSettingsFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.rules_preferences);
        }
    }
    
    public static class NetworkSettingsFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.network_preferences);
        }
    }
}
