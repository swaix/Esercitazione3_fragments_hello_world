package corso.swaix.fragments.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import corso.swaix.fragments.R;
import corso.swaix.fragments.fragments.SecondaryFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openSecondary(View v) {
        SecondaryFragment descriptionFragment = (SecondaryFragment) getSupportFragmentManager().findFragmentById(R.id.container2);
        if (descriptionFragment != null && descriptionFragment.isInLayout()) {
            descriptionFragment.setText("sono in landscape");
        } else {
            Intent intent = new Intent(this, SecondaryActivity.class);
            startActivity(intent);
        }
    }
}
