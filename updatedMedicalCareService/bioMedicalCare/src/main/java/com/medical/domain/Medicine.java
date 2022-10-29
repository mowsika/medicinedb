package com.medical.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer medicineId;
	
	@Column(name="Name")
	private String name;
	@Column(name="Brand")
	private String brand;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Price")
	private int price;
	public Integer getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(Integer medicineId) {
		this.medicineId = medicineId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", name=" + name + ", brand=" + brand + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	public Medicine(Integer medicineId, String name, String brand, int quantity, int price) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
