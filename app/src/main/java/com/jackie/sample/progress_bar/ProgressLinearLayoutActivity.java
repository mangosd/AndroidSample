package com.jackie.sample.progress_bar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jackie.sample.R;
import com.jackie.sample.custom_view.ProgressLinearLayout;

/**
 * Created by Jackie on 2017/5/9.
 */

public class ProgressLinearLayoutActivity extends AppCompatActivity {
    private ProgressLinearLayout mProgressLinearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_linear_layout);

        mProgressLinearLayout = (ProgressLinearLayout) findViewById(R.id.progress_linear_layout);
        mProgressLinearLayout.setProgress(30, 40, 80, 60);
    }
}
