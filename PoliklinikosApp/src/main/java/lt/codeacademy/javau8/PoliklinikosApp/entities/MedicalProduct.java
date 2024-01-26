
package lt.codeacademy.javau8.PoliklinikosApp.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class MedicalProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long productID;
    String productTitle;
    String productCategory;


    // Lists & Objects:
    @ManyToMany(mappedBy = "empMedicalProducts")
    private List<Employee> productEmployees;




    // Constructors:
    public MedicalProduct() {}

    public MedicalProduct(String productTitle, String productCategory) {
        this.productTitle = productTitle;
        this.productCategory = productCategory;
    }

    public MedicalProduct(Long productID, String productTitle, String productCategory) {
        this.productID = productID;
        this.productTitle = productTitle;
        this.productCategory = productCategory;
    }

    // Getters & Setters
    public Long getProductID() {
        return productID;}
    public void setProductID(Long productID) {
        this.productID = productID;}

    public String getProductCategory() {
        return productCategory;}
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;}

    public String getProductTitle() {
        return productTitle;}
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;}

    // Methods:


    @Override
    public String toString() {
        return "MedicalProduct{" +
                "productsID=" + productID +
                ", productsTitle='" + productTitle + '\'' +
                ", productsCategory='" + productCategory + '\'' +
                '}';
    }
}
