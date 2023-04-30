package model;

import interfaces.CalculateBill;

import java.util.ArrayList;

public class Bill implements CalculateBill {
    private int billId;
    private int orderId;
    private double totalBill;
    public static ArrayList<Double> list;

    public Bill(int billId, int orderId, double totalBill) {
        this.billId = billId;
        this.orderId = orderId;
        this.totalBill = totalBill;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }


    @Override
    public double calculateBill(ArrayList<Double> list) {
        double total = 0;
        for (double i: list) {
            total += i;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", orderId=" + orderId +
                ", totalBill=" + totalBill +
                '}';
    }
}
