package interfaces;

import java.util.ArrayList;
import java.util.List;

public interface CalculateBill {
    public final double TAX_RATE = 0.06;
    public double calculateBill(ArrayList<Double> list);
}
