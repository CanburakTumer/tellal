package com.canburaktumer.tellal;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;


public class Tellal extends AsyncTask<TellalConfig, String, String>{
	
	Context context;
	
	public Tellal(Context cntxt){
		context = cntxt;
	}

	@Override
	protected String doInBackground(TellalConfig... params) {
		// TODO Auto-generated method stub
		TellalConfig config = params[0];
		Log.i("Tellal", "got params");
		TellalReader reader = new TellalReader();
		Log.i("Tellal", "reader created");
		TellalAlert.showAlert(context, reader.getJSONFromUrl(config.getSourceURL()));
		Log.i("Tellal", "alert dialog shown!");
		
		return null;
	}

	@Override
	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
	}

	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
	}
	
	

}
