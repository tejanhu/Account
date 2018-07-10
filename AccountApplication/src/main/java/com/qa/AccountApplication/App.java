package com.qa.AccountApplication;

import java.io.IOException;
import java.util.HashMap;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.accounts.Account;
import com.qa.service.Service;

/**
 * Hello world!
 *
 */
public class App 
{
  
	public static void main(String [] args) {
		
		Account a = new Account(0121, "Billy", "Bob", "1234");
		Service service = new Service();
		service.create(a);
		JSONObject json = new JSONObject(service.readAll());
		System.out.println(json);
	}


}