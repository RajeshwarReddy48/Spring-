package com.spring.rest.a4;

public class CreditCardModel {
	private boolean valid = false;
	private String type = "NoType";
	public CreditCardModel() {
	}
	public CreditCardModel(boolean valid, String type) {
		super();
		this.valid = valid;
		this.type = type;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CreditCard [valid=" + valid + ", type=" + type + "]";
	}
	
	
}