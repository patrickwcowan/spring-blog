//package com.codeup.blog;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "properties")
//public class Property {
//
//    @Id @GeneratedValue
//    private long id;
//
//    @Column(nullable = false, length = 250, name = "street_address")
//    private String streetAddress;
//
//    @Column(nullable = false, name = "bed_number")
//    private int bedrooms;
//
//    @Column(nullable = false, name = "bath_number")
//    private double bathrooms;
//
//    @Column(nullable = false, name = "lot_size")
//    private double lotSize;
//
//    @Column(nullable = false, name = "listing_price")
//    private int price;
//
////    CREATE TABLE listings {
////    id BIGINT(LONG) NOT NULL AUTO_INCREMENT,
////    street_address VARCHAR(255),
////    bed_number INT NOT NULL,
////    bath_number DOUBLE NOT NULL,
////    lot_size DOUBLE NOT NULL,
////    listing_price INT NOT NULL,
////    PRIMARY KET (id),
////}
//    public Property(){}
//
//
//
//    public Property(String streetAddress, int bedrooms, double bathrooms, double lotSize, int price) {
//        this.streetAddress = streetAddress;
//        this.bedrooms = bedrooms;
//        this.bathrooms = bathrooms;
//        this.lotSize = lotSize;
//        this.price = price;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getStreetAddress() {
//        return streetAddress;
//    }
//
//    public void setStreetAddress(String streetAddress) {
//        this.streetAddress = streetAddress;
//    }
//
//    public int getBedrooms() {
//        return bedrooms;
//    }
//
//    public void setBedrooms(int bedrooms) {
//        this.bedrooms = bedrooms;
//    }
//
//    public double getBathrooms() {
//        return bathrooms;
//    }
//
//    public void setBathrooms(double bathrooms) {
//        this.bathrooms = bathrooms;
//    }
//
//    public double getLotSize() {
//        return lotSize;
//    }
//
//    public void setLotSize(double lotSize) {
//        this.lotSize = lotSize;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//}
