package com.zoragy.jersey;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
//Path: http://localhost/<appln-folder-name>/login
@Path("/login")
public class Login {
	// HTTP Get Method
	@POST 
	// Path: http://localhost/<appln-folder-name>/login/dologin
	@Path("/dologin")
	// Produces JSON as response
	@Produces(MediaType.APPLICATION_JSON) 
	// Query parameters are parameters: http://localhost/<appln-folder-name>/login/dologin?username=abc&password=xyz
	 public String doLogin(@FormParam("username") String uname, @FormParam("password") String pwd) throws Exception{
    	String response = "";

		if(checkCredentials(uname, pwd)){
	    	response = Utitlity.constructJSON("login",true);
		}else{
			response = Utitlity.constructJSON("login", false, "Incorrect Email or Password");
	           return response;	
		}
		return response;}
	private boolean checkCredentials(String uname, String pwd){
		System.out.println("Inside checkCredentials");
		boolean result = false;
		if(Utitlity.isNotNull(uname) && Utitlity.isNotNull(pwd)){
			try {
				result = DBConnection.checkLogin(uname, pwd);
				System.out.println("Inside checkCredentials try "+result);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Inside checkCredentials catch");
				result = false;
			}
		}    else{
			System.out.println("Inside checkCredentials else");
			result = false;
		} 
			
		     return result;  
		     
		    	}}
	

