package project;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PatientRecord> data =
                dataLoader.loadData("healthcare_dataset.csv");

        System.out.println("Records loaded: " + data.size());

        Benchmark.runAllBenchmarks(data);

        System.out.println("\nBenchmark complete.");
    }
}