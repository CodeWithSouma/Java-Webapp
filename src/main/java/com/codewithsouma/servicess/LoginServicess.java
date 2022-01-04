package com.codewithsouma.servicess;

public class LoginServicess {
	private static boolean loggedInStatus = false;
	private static int _token = 4584;
	private static String _username="souma.hitech@gmail.com";
	private static String _password="12345";
	
	public static boolean isValid(String email, String password) {
		if( email.equals(_username) && password.equals(_password)) 
			loggedInStatus = true;
			
		
		
		return loggedInStatus;
	}
	
	
	public static boolean validateToken(boolean isLoggedIn, int token) {
		return isLoggedIn == loggedInStatus && token == _token;
	}


	public static boolean getLoggedInStatus() {
		return loggedInStatus;
	}


	public static int getToken() {
		return _token;
	}
	
	

}
