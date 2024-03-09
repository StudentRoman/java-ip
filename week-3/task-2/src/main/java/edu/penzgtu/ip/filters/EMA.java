package edu.penzgtu.ip.filters;

import edu.penzgtu.ip.LogarithmicChart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EMA {
    private final double alpha = 0.2;
    private final int period;
    private final Map<Integer, Double> results = new HashMap<>();

    public EMA(int period) {
        assert period > 0 : "Period must be a positive integer";
        this.period = period;
    }

    public Map<Integer, Double> calculate(ArrayList<Double> numbers) {
        SMA sma = new SMA(this.period);

        double sum = sma.getSum();
        double ema = sma.getAverage();


        for (int i = this.period; i < numbers.size(); i++) {
            double weight = this.alpha / (1 - this.alpha);

            sum -= numbers.get(i - this.period) * (1 - this.alpha);
            ema += (numbers.get(i) - ema) * weight;
            sum += ema * this.alpha;

            this.results.put(i, ema);
        }

        return this.results;
    }

    public void getChart() {
        LogarithmicChart logarithmicChart = new LogarithmicChart(
                "EMA",
                "Number",
                "Index",
                this.results
        );
        logarithmicChart.pack();
        logarithmicChart.setVisible(true);
    }
}
