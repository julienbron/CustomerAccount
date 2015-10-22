package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

	private Collection<Account> accounts;
	private int number;
	private String firstName;
	private String lastName;

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param number
	 * @param firstName
	 * @param lastName
	 */
	public Customer(Integer number, String firstName, String lastName) {
		this.number = number;
                this.firstName = firstName;
                this.lastName = lastName;
	}

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
            Account accountSearch = null;
            for (Account account : accounts) {
                if (account.getNumber().equals(number)) {
                    accountSearch = account;
                    break;
                }
            }
            return accountSearch;
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public Account addAccount(String number, String name, double rate) {
            Account account = new Account(number,name,rate,this);
            accounts.add(account);
            return account;
	}

}