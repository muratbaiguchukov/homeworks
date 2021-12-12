package com.company.task3;

public class Credit {
    public String Id; // фио получателя
    public int amount;// cумма
    public String period;// период
    public int percentage;// процентная ставка

    public Credit(String id, int amount, String period, int percentage) {
        Id = id;
        this.amount = amount;
        this.period = period;
        this.percentage = percentage;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
