package edu.penzgtu.ip.filters;

import edu.penzgtu.ip.LogarithmicChart;
import lombok.Getter;

import java.util.*;

public class SMA {
    private final Queue<Double> window = new LinkedList<>();
    private final int period;
    @Getter
    private double sum;
    private final Map<Integer, Double> results = new HashMap<>();

    public SMA(int period) {
        assert period > 0 : "Period must be a positive integer";
        this.period = period;
    }

    public void newNum(double num) {
        sum += num;
        window.add(num);

        if (window.size() > period) {
            sum -= window.remove();
        }
    }

    public double getAverage() {
        if (window.isEmpty()) return 0.0;
        return sum / window.size();
    }

    public Map<Integer, Double> calculate(ArrayList<Double> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            double currentNumber = numbers.get(i);

            this.newNum(currentNumber);
            double average = this.getAverage();
            this.results.put(i, average);
        }

        return this.results;
    }

    public void getChart() {
        LogarithmicChart logarithmicChart = new LogarithmicChart(
                "SMA",
                "Number",
                "Index",
                this.results
        );
        logarithmicChart.pack();
        logarithmicChart.setVisible(true);
    }
}
