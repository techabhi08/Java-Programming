package com.abhinaygarg;

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer(){
        this("Ambani", 1000000000, "ambani@gmail.com");
    }
    public VipCustomer(String name, long creditLimit){
        this(name, creditLimit, "123@m.com");
    }
    public VipCustomer(String name, long creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
