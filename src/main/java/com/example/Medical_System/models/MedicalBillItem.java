package com.example.Medical_System.models;

import jakarta.persistence.*;

@Entity
public class MedicalBillItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String item;
    private int quantity;
    private double rate;
    @Transient
    private double amount;
    public  MedicalBillItem(){}
    public MedicalBillItem(String item, int quantity, double rate){
        this.item = item;
        this.quantity = quantity;
        this.rate = rate;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAmount() {
        return quantity * rate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
