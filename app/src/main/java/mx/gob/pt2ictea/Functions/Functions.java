package mx.gob.pt2ictea.Functions;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import mx.gob.pt2ictea.R;

public class Functions {
    public static void changeMainFragment(FragmentActivity fragmentActivity, Fragment fragment){
        fragmentActivity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, fragment)
                .commit();
    }

}
