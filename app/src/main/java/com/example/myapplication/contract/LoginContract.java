package com.example.myapplication.contract;

import com.example.myapplication.bean.UserBean;
import com.example.myapplication.utils.INetCallBack;

public class LoginContract {
    public interface ILoginModel{
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }

    public interface ILoginPresenter{
        void login(String name,String password);
        void loginResult(String result);
    }

    public interface ILoginView{
        String getUserName();
        String getPassword();
        void getData(UserBean string);
    }

}
