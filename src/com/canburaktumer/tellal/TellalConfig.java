package com.canburaktumer.tellal;

public class TellalConfig {
	private String sourceURL;
	private String buttonText;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSourceURL(String s){
		sourceURL = s;
	}
	
	public String getSourceURL(){
		return sourceURL;
	}
	
	public void setButtonText(String s){
		buttonText = s;
	}
	
	public String getButtonText(){
		return buttonText;
	}
}
