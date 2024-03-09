package edu.penzgtu.ip.filters;

import edu.penzgtu.ip.LogarithmicChart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Median {
    private final int period;
    private final Map<Integer, Double> results = new HashMap<>();

    public Median(int period) {
        this.period = period;
    }

    public Map<Integer, Double> calculate(ArrayList<Double> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int fromIndex = Math.max(0, i - this.period);
            ArrayList<Double> copy = new ArrayList<>(numbers.subList(fromIndex, i + 1));

            Collections.sort(copy);
            this.results.put(i, copy.get(copy.size() / 2));
        }

        return this.results;
    }

    public void getChart() {
        LogarithmicChart logarithmicChart = new LogarithmicChart(
                "Median",
                "Number",
                "Index",
                this.results
        );
        logarithmicChart.pack();
        logarithmicChart.setVisible(true);
    }
}
