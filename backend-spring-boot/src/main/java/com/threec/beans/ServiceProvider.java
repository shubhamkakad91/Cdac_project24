package com.threec.beans;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"email", "phone"}))
public class ServiceProvider { 
	@Id
	@GeneratedValue
	private int serviceProviderId;
	// BASIC DETAILS
	private String fullname;
	private String phone;
	private String email;
	private String city;
	// AUTHENTICATION DETAILS
	private String username;
	private String password;
	@JsonIgnore
	private String salt;
	// EXTRA DETAILS
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="sp_exp_map", joinColumns = {@JoinColumn(name="serviceProviderId")}, 
	inverseJoinColumns = {@JoinColumn(name="expertiseId")})
	private List<Expertise> expertise;
	@OneToMany(mappedBy = "serviceProvider", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Bid> bids;
	
	public ServiceProvider() {
		
	}

	public ServiceProvider(int servicePId, String username, String password) {
		this.serviceProviderId=servicePId;
		this.username=username;
		this.password=password;
	}
	
	public ServiceProvider(String username, String password) {
		this.username=username;
		this.password=password;
	}

	public int getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(int serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public List<Expertise> getExpertise() {
		return expertise;
	}

	public void setExpertise(List<Expertise> expertise) {

		this.expertise = expertise;
	}

	public List<Bid> getBids() {
		return bids;
	}

	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}
	
}