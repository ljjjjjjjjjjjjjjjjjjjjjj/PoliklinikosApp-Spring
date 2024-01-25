package lt.codeacademy.javau8.PoliklinikosApp.entities;

import jakarta.persistence.Entity;

@Entity
public class Patient {

    Long patientID;

    String patientName;
    String patientSurname;
    String patientContactInfo;
    String patientCategory;


    // Constructors:

    public Patient() {
    }

    public Patient(String patientName, String patientSurname, String patientContactInfo, String patientCategory) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientContactInfo = patientContactInfo;
        this.patientCategory = patientCategory;
    }

    public Patient(Long patientID, String patientName, String patientSurname, String patientContactInfo, String patientCategory) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientContactInfo = patientContactInfo;
        this.patientCategory = patientCategory;
    }

    // Getters & Setters:

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public String getPatientContactInfo() {
        return patientContactInfo;
    }

    public void setPatientContactInfo(String patientContactInfo) {
        this.patientContactInfo = patientContactInfo;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(String patientCategory) {
        this.patientCategory = patientCategory;
    }

    // Methods:


    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", patientName='" + patientName + '\'' +
                ", patientSurname='" + patientSurname + '\'' +
                ", patientContactInfo='" + patientContactInfo + '\'' +
                ", patientCategory='" + patientCategory + '\'' +
                '}';
    }
}
