package com.mobilegis.exercise3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // check device orientation and act accordingly

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Landscape mode
            LM_Fragment lm_fragment = new LM_Fragment();
            fragmentTransaction.replace(android.R.id.content, lm_fragment);
        } else {
            PM_Fragment pm_fragment = new PM_Fragment();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }

        fragmentTransaction.commit();

    }
}
