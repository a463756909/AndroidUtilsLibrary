package net.smartbetter.utilslibrary.application;

import android.app.Application;

import utilslibrary.LogUtils;

/**
 * Created by gc on 2017/2/21.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.setDebug(true); //Open Log Debug.
    }
}
