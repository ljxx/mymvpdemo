package com.ylx.mymvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter mMainPresenter;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.mTextView);
        loadDatas();
    }

    private void loadDatas() {
        mMainPresenter = new MainPresenter();
        mMainPresenter.addTaskListener(this);
        mMainPresenter.getString();

    }

    @Override
    public void showString(String json) {
        mTextView.setText(json);
    }
}
