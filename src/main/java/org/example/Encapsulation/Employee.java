package org.example.Encapsulation;

public class Employee {
    private String name;
    private String  id;
    private  String  jobRole;
    private double salery;

    public void setId(String  id){
        this.id = id;
    }

    public double getSalery() {
        return salery;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
