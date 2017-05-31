package org.johnide.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by john on 5/31/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
