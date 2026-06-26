package org.example.Encapsulation;

import org.example.Encapsulation.Task1.PatientRecord;

public class Main {


    static void main() {
        Employee aman = new Employee();
        aman.setName("Amandeep Kaur");
        System.out.println(aman.getName());
        PatientRecord p = new PatientRecord();
        p.setName("Ramandeep ");
        p.setDiagnosis("Fever");
        p.setId("34L");
        p.setMedicalRecord("great");

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p);
    }
}
