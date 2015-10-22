/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.Collection;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class Bank {

    private int number;
    private String name;
    private Collection<Customer> customers;
    private Collection<Account> accounts;

    //Constructeur
    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }

    //Récupère un compte par son numéro de compte
    public Account getAccountByNumber(final String number) {
        Account accountSearch = null;
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                accountSearch = account;
                break;
            }
        }
        return accountSearch;
    }

    //Récupère un customer par son numéro
    public Customer getCustomerByNUmber(final int number) {
        Customer customerSearch = null;
        for (Customer customer : customers) {
            if (customer.getNumber() == number) {
                customerSearch = customer;
                break;
            }
        }
        return customerSearch;
    }

    //Ajoute un customer
    public void addCustomer(final int number, final String fn, final String in) {
        Customer newCustomer = new Customer(number, fn, in);
        customers.add(newCustomer);
    }

    //Ajoute un compte
    public void addAccount(final String number, final String name, final Double rate, final Customer customer) {
        Account newAccount = new Account(number, name, rate, customer);
        accounts.add(newAccount);
    }

}
