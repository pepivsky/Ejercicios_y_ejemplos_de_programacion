package com.company.interfaces.Accounts;
/* Ejemplo de uso de interfaces para implementar funcionalidad
Account Service
Imagine an interface AccountService that is designed for keeping track of accounts and balances.

It has two abstract methods:
findAccountByOwnerId(long id) takes user id and returns this user account or null in case no account was found;
countAccountsWithBalanceGreaterThan(long balance) returns the number of accounts with a balance exceeding the provided number.

There are also two classes: Account and User, each of them having several fields. The owner field of the Account class is an object of the User type. You can find the details in the provided template.

Your task is to create AccountServiceImpl class that implements AccountService interface and its two methods.
It should have a constructor that takes an Account array which will be used for searching when either of the methods is called.

For example, to find an account by the user id we need to go through all the accounts from this array and compare these accounts owners id with the given id.

Here's an example of how these methods will be called:

Account[] accounts = ...
AccountService service = new AccountServiceImpl(accounts);
service.findAccountByOwnerId(10L); // returns an account where owner id is 10
Note: do not make classes and the interface public.
 */
interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService{

    Account[] accounts;

    AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account: accounts) {
            if (account.getOwner().getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int accountsCounter = 0;
        for (Account account: accounts) {
            if (account.getBalance() > value) {
                accountsCounter++;
            }
        }
        return accountsCounter;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class TestDrive {
    public static void main(String[] args) {
        Account[] accounts;
        AccountService accountService;

        accounts = new Account[] {
                new Account(1, 2001L, new User(10, "Pp","Paredes")),
                new Account(2, 2001L, new User(20, "Blanca","Ramirez")),
                new Account(3, 2000L, new User(30, "Fabi","Bravo")),
        };
        accountService = new AccountServiceImpl(accounts);


        System.out.println(accountService.findAccountByOwnerId(10));//debe la cuenta de ser Pp

        System.out.println(accountService.countAccountsWithBalanceGreaterThan(2000)); // deben ser 2
    }
}