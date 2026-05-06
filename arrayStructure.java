package project;

import java.util.ArrayList;

public class arrayStructure implements DataStructure {

    private ArrayList<PatientRecord> list = new ArrayList<>();

    // Insert Record
    public void insertRecord(PatientRecord record) {
        list.add(record);
    }

    // Search Record by ID
    public PatientRecord searchRecord(int id) {
        for (PatientRecord p : list) {
            if (p.id == id) return p;
        }
        return null;
    }

    // Delete Record by ID
    public void deleteRecord(int id) {
        list.removeIf(p -> p.id == id);
    }

    // Traverse Records
    public void traverseRecords() {
        for (PatientRecord p : list) {
            System.out.println(p.id + " " + p.medicalCondition);
        }
    }
}