package com.threec.beans;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Expertise {
	@Id
	@GeneratedValue
	private int expertiseId;
	private String name;
	
	public Expertise(int expertiseId, String name) {
		this.expertiseId = expertiseId;
		this.name = name;
	}

	public Expertise() {
	}

	public int getExpertiseId() {
		return expertiseId;
	}

	public void setExpertiseId(int expertiseId) {
		this.expertiseId = expertiseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
