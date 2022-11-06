package model;

import java.sql.Date;

public class Order {
    private int id;
    private int id_Account;
    private Date date;

    public Order() {
    }

    public Order(int id, int id_Account, Date date) {
        this.id = id;
        this.id_Account = id_Account;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Account() {
        return id_Account;
    }

    public void setId_Account(int id_Account) {
        this.id_Account = id_Account;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
