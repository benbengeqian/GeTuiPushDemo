package com.dengyy.pushtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.igexin.sdk.PushManager;

public class MainActivity extends Activity {
	public static TextView tView = null;
	public static TextView tLogView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		//初始化SDK
		PushManager.getInstance().initialize(this.getApplicationContext());
		
	}
}
