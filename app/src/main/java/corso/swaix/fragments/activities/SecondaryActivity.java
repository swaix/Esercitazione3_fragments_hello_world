package corso.swaix.fragments.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import corso.swaix.fragments.R;
import corso.swaix.fragments.fragments.SecondaryFragment;

/**
 * Created by SwaiX on 23/05/2015.
 */
public class SecondaryActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secondary);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            finish();
            return;
        }
        else {
            getSupportFragmentManager().beginTransaction().replace(R.id.container2, new SecondaryFragment()).commit();
        }

        SecondaryFragment secondary = (SecondaryFragment) getSupportFragmentManager().findFragmentById(R.id.container2);
        if(secondary != null && secondary.isInLayout())
        {
            secondary.setText("sono in portrait");
        }
    }
}
