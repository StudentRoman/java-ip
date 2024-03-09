package edu.penzgtu.ip;

import edu.penzgtu.ip.filters.EMA;
import edu.penzgtu.ip.filters.Median;
import edu.penzgtu.ip.filters.SMA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Window size: ");
        int windowSize = Integer.parseInt(scanner.nextLine());

        System.out.println("Fill the array with double numbers (* or an empty string to delete the input): ");
        ArrayList<Double> data = fillNumbersArray();
        getInitialChart(data);

        EMA ema = new EMA(windowSize);
        ema.calculate(data);
        ema.getChart();

        SMA sma = new SMA(windowSize);
        sma.calculate(data);
        sma.getChart();

        Median median = new Median(windowSize);
        median.calculate(data);
        median.getChart();

        scanner.close();
    }

    private static ArrayList<Double> fillNumbersArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("*") || line.isEmpty()) {
                break;
            }

            numbers.add(Double.parseDouble(line));
        }

        scanner.close();

        return numbers;
    }

    private static void getInitialChart(ArrayList<Double> numbers) {
        HashMap<Integer, Double> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            numberMap.put(i, numbers.get(i));
        }

        LogarithmicChart defaultChart = new LogarithmicChart(
                "Initial Data",
                "Number",
                "Index",
                numberMap
        );
        defaultChart.pack();
        defaultChart.setVisible(true);
    }
}