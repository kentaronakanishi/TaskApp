package jp.techacademy.kentaro.nakanishi.taskapp;

/**
 * Created by world_000 on 2018/03/18.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}