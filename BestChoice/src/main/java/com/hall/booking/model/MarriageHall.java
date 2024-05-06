package com.hall.booking.model;

import jakarta.persistence.*;

@Entity
@Table(name = "marriagehall")
public class MarriageHall {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "seatings")
	private String seatings;
	@Column(name = "cooking")
	private String cooking;
	@Column(name = "Rate")
	private String Rate;
	@Column(name = "Responsible_Person")
	private String Responsible_Person;
	 @Column(nullable = true, length = 64)
	  private String photos;
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSeatings() {
		return seatings;
	}
	public void setSeatings(String seatings) {
		this.seatings = seatings;
	}
	public String getCooking() {
		return cooking;
	}
	public void setCooking(String cooking) {
		this.cooking = cooking;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	public String getResponsible_Person() {
		return Responsible_Person;
	}
	public void setResponsible_Person(String responsible_Person) {
		Responsible_Person = responsible_Person;
	}
 
}
