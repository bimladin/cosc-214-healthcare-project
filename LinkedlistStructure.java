package project;

import java.util.LinkedList;

public class LinkedlistStructure implements DataStructure {

    private LinkedList<PatientRecord> list;

    public LinkedlistStructure() {
        list = new LinkedList<>();
    }

    // Insert Record
    public void insertRecord(PatientRecord record) {
        list.add(record);
    }

    // Search Record by ID
    public PatientRecord searchRecord(int id) {
        for (PatientRecord p : list) {
            if (p.id == id) {
                return p;
            }
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