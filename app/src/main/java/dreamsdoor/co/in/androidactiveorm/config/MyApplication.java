package dreamsdoor.co.in.androidactiveorm.config;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
//        Configuration dbConfiguration = new Configuration.Builder(this)
//                .setDatabaseName("product.db")
//                .addModelClass(Products.class)
//                .create();
//        ActiveAndroid.initialize(dbConfiguration);
    }

}
