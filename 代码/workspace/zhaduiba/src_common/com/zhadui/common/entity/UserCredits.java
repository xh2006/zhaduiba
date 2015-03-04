package com.zhadui.common.entity;

public class UserCredits {

	private int userCreditsId;
	private String userCreditsCause;
	private int userCreditsPoints;
	
	public UserCredits(int userCreditsId, String userCreditsCause,
			int userCreditsPoints) {
		super();
		this.userCreditsId = userCreditsId;
		this.userCreditsCause = userCreditsCause;
		this.userCreditsPoints = userCreditsPoints;
	}
	public UserCredits() {
		super();
	}
	public int getUserCreditsId() {
		return userCreditsId;
	}
	public void setUserCreditsId(int userCreditsId) {
		this.userCreditsId = userCreditsId;
	}
	public String getUserCreditsCause() {
		return userCreditsCause;
	}
	public void setUserCreditsCause(String userCreditsCause) {
		this.userCreditsCause = userCreditsCause;
	}
	public int getUserCreditsPoints() {
		return userCreditsPoints;
	}
	public void setUserCreditsPoints(int userCreditsPoints) {
		this.userCreditsPoints = userCreditsPoints;
	}
	@Override
	public String toString() {
		return "{userCreditsId:" + userCreditsId
				+ ", userCreditsCause:" + userCreditsCause
				+ ", userCreditsPoints:" + userCreditsPoints + "}";
	}
	
}
