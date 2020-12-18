package com.example.myapplication.utils.net;

import com.example.myapplication.utils.INetCallBack;

import java.util.HashMap;

public interface INetWorkInterface {

    // 不考虑回调的情况下
    public <T> void get(String url, INetCallBack<T> callBack);
    public <T> void post(String url, INetCallBack<T> callBack);
    public <T> void post(String url, HashMap<String,String>map,INetCallBack<T> callBack);
}
