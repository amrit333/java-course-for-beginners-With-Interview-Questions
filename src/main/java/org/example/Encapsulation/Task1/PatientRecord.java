package org.example.Encapsulation.Task1;

public class PatientRecord {
    private String  id;
    private String name;
    private String diagnosis;
    private String  medicalRecord;

    public void setId(String  id){
        this.id = id;
    }
    public void setName (String  name){
        this.name = name;

    }
    public void  setDiagnosis(String  diagnosis){
        this.diagnosis = diagnosis;

    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }
}

