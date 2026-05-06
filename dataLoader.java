package project;

import java.io.*;
import java.util.*;

public class dataLoader {

    public static List<PatientRecord> loadData(String filePath) {
        List<PatientRecord> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header
            int id = 1;

            while ((line = br.readLine()) != null) {

                List<String> values = parseCSVLine(line);

                if (values.size() < 12) {
                    continue;
                }

                try {
                    int age = Integer.parseInt(values.get(1));
                    String gender = values.get(2);
                    String medicalCondition = values.get(4);
                    String hospital = values.get(7);
                    double billingAmount = Double.parseDouble(values.get(9));
                    String admissionType = values.get(11);

                    PatientRecord record = new PatientRecord(
                            id++, age, gender, medicalCondition,
                            hospital, admissionType, billingAmount
                    );

                    records.add(record);

                } catch (Exception e) {
                    // skip bad row quietly
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return records;
    }

    private static List<String> parseCSVLine(String line) {
        List<String> values = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        boolean insideQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"') {
                insideQuotes = !insideQuotes;
            } else if (c == ',' && !insideQuotes) {
                values.add(current.toString().trim());
                current.setLength(0);
            } else {
                current.append(c);
            }
        }

        values.add(current.toString().trim());
        return values;
    }
}