package jp.techacademy.kaori.fujita.taskapp;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by fujita on 2016/09/21.
 */

public class TaskApp extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this).build();
		Realm.setDefaultConfiguration(realmConfiguration);
	}
}
