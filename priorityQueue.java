package project;

import java.util.PriorityQueue;

public class priorityQueue implements DataStructure {

    private PriorityQueue<PatientRecord> pq;

    public priorityQueue() {
        pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.billingAmount, a.billingAmount)
        );
    }

    public void insertRecord(PatientRecord record) {
        pq.add(record);
    }

    public PatientRecord searchRecord(int id) {
        for (PatientRecord p : pq) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    public void deleteRecord(int id) {
        pq.removeIf(p -> p.id == id);
    }

    public void traverseRecords() {
        for (PatientRecord p : pq) {
            System.out.println(p.id);
        }
    }

    public PatientRecord processNext() {
        return pq.poll();
    }
}