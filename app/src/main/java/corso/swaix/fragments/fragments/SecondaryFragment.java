package corso.swaix.fragments.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import corso.swaix.fragments.R;


public class SecondaryFragment extends Fragment {
    public SecondaryFragment() {
        // Required empty public constructor
    }

    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secondary, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text = (TextView) view.findViewById(R.id.text);
    }

    public void setText(String value){
        text.setText(value);
    }
}
