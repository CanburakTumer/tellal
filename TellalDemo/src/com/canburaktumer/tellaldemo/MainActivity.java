package com.canburaktumer.tellaldemo;

import com.canburaktumer.tellal.Tellal;
import com.canburaktumer.tellal.TellalConfig;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
	}
	
	public void init(){
		TellalConfig demoConfig = new TellalConfig();
		demoConfig.setSourceURL("https://dl.dropboxusercontent.com/u/868500/tellaldemo.txt");
		Context cnt = (Context)this;
		Tellal demo = new Tellal(cnt);
		demo.execute(demoConfig);
	}
}
