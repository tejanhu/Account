package com.qa.service;

import java.util.HashMap;

import com.qa.accounts.Account;
import com.qa.constants.Constants;

public class Service {
	
		
		private HashMap<Long, Account> account_map = new HashMap<Long, Account>();
		
		
		public void create(Account a) {
			account_map.put(a.getID(),a);
		}	
		
		public HashMap<Long,Account> readAll() {
			return this.account_map;
		}
				
		public void update(long id, String firstName, String lastName, String accountNumber) {
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
		
		public void delete(long id) {
			account_map.remove(id);
		}
		
		public Account findAccount(long id) {
			
			Account a = new Account(0000, "", "", "");
			
			if(this.account_map.containsKey(id)) {
				return this.account_map.get(id);
			}
			return a;
		}
		
		public int getNameCount(String firstName) {
			return (int) this.account_map.values().stream().filter(s -> s.getFirstName().equals(firstName)).count();
		}
	
	

}
