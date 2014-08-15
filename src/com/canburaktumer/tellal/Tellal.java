package com.canburaktumer.tellal;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;


public class Tellal extends AsyncTask<TellalConfig, String, String>{
	
	Context context;
	TellalReader reader;
	TellalConfig config;
	JSONObject json;
	
	public Tellal(Context cntxt){
		context = cntxt;
	}

	@Override
	protected String doInBackground(TellalConfig... params) {
		// TODO Auto-generated method stub
		config = params[0];
		Log.i("Tellal", "got params");
		reader = new TellalReader();
		json = reader.getJSONFromUrl(config.getSourceURL());
		Log.i("Tellal", "reader created");
		
		
		return config.getType();
	}

	@Override
	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		if(result.equalsIgnoreCase("a")){
			if(json!=null){
				TellalAlert.showAlert(context, json);
				Log.i("Tellal", "alert dialog shown!");
				super.onPostExecute(result);
			}
		}else if(result.equalsIgnoreCase("n")){
			if(json!=null){
				TellalAlert.showNotification(context, json);
				Log.i("Tellal", "alert notification shown!");
				super.onPostExecute(result);
			}
		}
	}

	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
	}
	
	

}
