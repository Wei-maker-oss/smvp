package com.example.myapplication.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.presenter.BasePresenter;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    public P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutID());

        if (presenter == null) {
            presenter = add();
        }
        initView();
        initDate();
    }

    protected abstract int getLayoutID();

    protected abstract void initView();

    protected abstract void initDate();

    public abstract P add();
}
