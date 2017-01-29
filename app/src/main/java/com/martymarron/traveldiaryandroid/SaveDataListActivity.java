package com.martymarron.traveldiaryandroid;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SaveDataListActivity extends FragmentActivity implements SaveDataListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_data_list);
    }

    @Override
    public void onItemSelected(String id) { }

}
