package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.bean.UserBean;
import com.example.myapplication.contract.LoginContract;
import com.example.myapplication.presenter.LogPresenterImpl;

public class LoginActivity extends BaseActivity<LogPresenterImpl> implements LoginContract.ILoginView {

    private EditText etName;
    private EditText etPassword;
    private Button btnLogin;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        initView();
//    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_login;
    }

    protected void initView() {
        etName = (EditText) findViewById(R.id.et_name);
        etPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
    }

    @Override
    protected void initDate() {

    }

    @Override
    public LogPresenterImpl add() {
        return new LogPresenterImpl(this);
    }

    @Override
    public String getUserName() {
        return etName.getText().toString();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void getData(UserBean string) {
                // 网络请求返回
    }
}