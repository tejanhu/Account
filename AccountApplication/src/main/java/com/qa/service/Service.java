package com.qa.service;

import java.util.HashMap;

import com.qa.accounts.Account;
import com.qa.constants.Constants;

public class Service {
	
		
		private HashMap<Long, Account> account_map = new HashMap<Long, Account>();
		
		
		public void create(Account a) {
			account_map.put(a.getID(),a);
		}	
		
		public void read(Account a) {
			account_map.get(a.getID());
		}
				
		public void update(Long id, String firstName, String lastName, String accountNumber) {
			if(account_map.containsKey(id)) {
				Account newAccount = account_map.get(id);
				newAccount.setFirstName(firstName);
				newAccount.setLastName(lastName);
				newAccount.setAccountNumber(accountNumber);
			}
			else {
				System.out.println(Constants.ERROR_MESSAGE);
			}
		}
		
		public void delete(Long id) {
			account_map.remove(id);
		}
	
	

}
