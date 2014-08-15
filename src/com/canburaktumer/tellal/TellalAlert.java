package com.canburaktumer.tellal;

import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
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
			.setMessage(json.getString("message"))
			.setCancelable(false)
			.setPositiveButton(json.getString("buttonText"), new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();
				}
			  });
		Log.i("TellalAlert", "created alertDialog");
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
		}catch(JSONException je){
			je.printStackTrace();
		}
	}
	
	@SuppressLint("NewApi")
	public static void showNotification(Context context, JSONObject json){
		Log.i("TellalAlert", "Inside showNotification");
		try{
			Notification not = new Notification.Builder(context)
			.setContentTitle(json.getString("title"))
			.setContentText(json.getString("message"))
			.build();
		Log.i("TellalAlert", "Created notification builder");
		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.notify(0, not); 
		Log.i("TellalAlert", "created notification");
		}catch(JSONException je){
			je.printStackTrace();
		}
	}
	
}
