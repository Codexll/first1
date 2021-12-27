package com.example.accessp.entity;


public class Access_Control_Device {

  private long id;
  private String principal;
  private String supplier;
  private String brand;
  private long hospital_Id;
  private long status;
  private java.sql.Date add_Time;
  private Buiding buiding;

  public Buiding getBuiding() {
    return buiding;
  }

  public void setBuiding(Buiding buiding) {
    this.buiding = buiding;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public long getHospital_Id() {
    return hospital_Id;
  }

  public void setHospital_Id(long hospital_Id) {
    this.hospital_Id = hospital_Id;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Date getAdd_Time() {
    return add_Time;
  }

  public void setAdd_Time(java.sql.Date add_Time) {
    this.add_Time = add_Time;
  }

}
