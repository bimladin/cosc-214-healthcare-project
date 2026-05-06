package project;


	public interface DataStructure {

	    void insertRecord(PatientRecord record);

	    PatientRecord searchRecord(int id);

	    void deleteRecord(int id);

	    void traverseRecords();
	}


