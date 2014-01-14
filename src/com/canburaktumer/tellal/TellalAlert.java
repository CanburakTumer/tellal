package com.canburaktumer.tellal;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;

public class TellalAlert {
	
	public static void showAlert(Context context, JSONObject json){
		Log.i("TellalAlert", "Inside showAlert");
		try{
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		Log.i("TellalAlert", "Created builder");
		builder.setTitle(json.getString("title"))
			.setMessage(json.getString("message"));
//			.setPositiveButton(json.getString("buttonText"), new DialogInterface.OnClickListener() {
//				public void onClick(DialogInterface dialog,int id) {
//					dialog.cancel();
//				}
//			  });
		Log.i("TellalAlert", "created alertDialog");
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
		}catch(JSONException je){
			je.printStackTrace();
		}
	}
	
}
