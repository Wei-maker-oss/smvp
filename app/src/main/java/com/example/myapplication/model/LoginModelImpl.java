package com.example.myapplication.model;

import com.example.myapplication.contract.LoginContract;
import com.example.myapplication.utils.INetCallBack;
import com.example.myapplication.utils.net.RetrofitUtils;

public class LoginModelImpl implements LoginContract.ILoginModel {
    private LoginContract.ILoginPresenter presenter;

    public LoginModelImpl(LoginContract.ILoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        presenter.loginResult("登录成功");
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
