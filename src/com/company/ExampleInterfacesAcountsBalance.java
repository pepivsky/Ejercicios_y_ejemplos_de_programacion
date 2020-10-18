package com.company;

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
class AccountServiceImpl implements AccountService {

    private Account[] accounts;

    AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts.clone();
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts) {
            //System.out.println("id del owner de la cuenta" + account.getOwner().getId());
            if (account.getOwner().getId() == id) {
                System.out.println("Econtre algo");
                System.out.println(account.getOwner().getFirstName());
                return account;
                //System.out.println("ya no se ejecuta");
            } else {
                System.out.println("No encontre nada");
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int counter = 0;
        for (Account account : accounts) {
            if (account.getBalance() > value) {
                counter++;
            }
        }
        return counter;
    }
}

class Account {

    private long id;
    private long balance;
    private UserS owner;

    public Account(long id, long balance, UserS owner) {
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

    public UserS getOwner() {
        return owner;
    }
}

class UserS {

    private long id;
    private String firstName;
    private String lastName;

    public UserS(long id, String firstName, String lastName) {
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
}

public class ExampleInterfacesAcountsBalance {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new Account(1L, 200, new UserS(2L, "Jose", "Paredes"));
        accounts[1] = new Account(2L, 300, new UserS(10L, "Fabiolin", "Bravo"));

        AccountService service = new AccountServiceImpl(accounts);
        service.findAccountByOwnerId(10L);
        //System.out.println(service.getClass());
    }
}
