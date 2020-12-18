package com.example.myapplication.presenter;

import com.example.myapplication.bean.UserBean;
import com.example.myapplication.contract.LoginContract;
import com.example.myapplication.model.LoginModelImpl;
import com.example.myapplication.utils.INetCallBack;

public class LogPresenterImpl extends BasePresenter implements LoginContract.ILoginPresenter {

    private LoginContract.ILoginModel loginModel;
    private LoginContract.ILoginView loginView;

    public LogPresenterImpl(LoginContract.ILoginView loginView) {
        this.loginView = loginView;
        this.loginModel=new LoginModelImpl(this);
    }

    @Override
    public void login(String name, String password) {
        loginModel.getLoginData("", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                loginView.getData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    }
}
