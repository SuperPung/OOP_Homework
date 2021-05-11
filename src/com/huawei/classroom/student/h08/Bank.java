package com.huawei.classroom.student.h08;

/**
 * @author super
 */
public class Bank {
    private int deposit;
    public Bank() {
        this.deposit = 0;
    }

    public void save(int money) {
        if (money > 0) {
            this.deposit += money;
        }
    }
    public void get(int money) throws NoMoneyException {
        if (money > 0 && money < this.deposit) {
            this.deposit -= money;
        } else {
            throw new NoMoneyException();
        }
    }
}
