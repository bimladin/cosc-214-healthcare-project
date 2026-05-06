package project;

import java.util.HashMap;

public class HashStructure implements DataStructure {

    private HashMap<Integer, PatientRecord> map = new HashMap<>();

    public void insertRecord(PatientRecord record) {
        map.put(record.id, record);
    }

    public PatientRecord searchRecord(int id) {
        return map.get(id);
    }

    public void deleteRecord(int id) {
        map.remove(id);
    }

    public void traverseRecords() {
        for (PatientRecord r : map.values()) {
            System.out.println(r.id + " " + r.medicalCondition);
        }
    }
}