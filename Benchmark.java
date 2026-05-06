package project;

import java.util.List;
import project.priorityQueue;

public class Benchmark {

    public static void runAllBenchmarks(List<PatientRecord> data) {

        int[] sizes = {100, 1000, 5000, 10000};
        int runs = 5;

        for (int size : sizes) {

            if (data.size() < size) continue;

            List<PatientRecord> testData = data.subList(0, size);
            int searchId = testData.get(size / 2).id;

            System.out.println("\n===== Dataset Size: " + size + " Records =====");

            testStructure("ArrayList", testData, searchId);
            testStructure("LinkedList", testData, searchId);
            testStructure("HashMap", testData, searchId);
            testStructure("PriorityQueue", testData, searchId);
        }
    }

    private static void testStructure(String name, List<PatientRecord> data, int searchId) {

        int runs = 5;

        long insertTotal = 0;
        long searchTotal = 0;
        long deleteTotal = 0;

        for (int i = 0; i < runs; i++) {

            DataStructure structure = createStructure(name);

            long start = System.nanoTime();

            for (PatientRecord p : data) {
                structure.insertRecord(p);
            }

            long end = System.nanoTime();
            insertTotal += (end - start);

            start = System.nanoTime();
            structure.searchRecord(searchId);
            end = System.nanoTime();
            searchTotal += (end - start);

            start = System.nanoTime();
            structure.deleteRecord(searchId);
            end = System.nanoTime();
            deleteTotal += (end - start);
        }

        System.out.println("\n--- " + name + " Average Performance ---");
        System.out.println("Average Insert Time: " + (insertTotal / runs));
        System.out.println("Average Search Time: " + (searchTotal / runs));
        System.out.println("Average Delete Time: " + (deleteTotal / runs));
    }

    private static DataStructure createStructure(String name) {

        if (name.equals("ArrayList")) {
            return new arrayStructure();
        } else if (name.equals("LinkedList")) {
            return new LinkedlistStructure();
        } else if (name.equals("HashMap")) {
            return new HashStructure();
        } else if (name.equals("PriorityQueue")) {
            return new priorityQueue();
        }

        return null;
    }
}