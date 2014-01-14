package com.canburaktumer.tellal;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class TellalAlert {
	
	public static void showAlert(Context context, JSONObject json){
		try{
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle(json.getInt("title"))
			.setMessage(json.getInt("message"))
			.setPositiveButton(json.getInt("buttonText"), new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();
				}
			  });
		}catch(JSONException je){
			je.printStackTrace();
		}
	}
	
}
