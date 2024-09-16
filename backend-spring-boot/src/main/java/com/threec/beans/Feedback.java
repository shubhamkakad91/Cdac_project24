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
public class Feedback {
	@Id
	@GeneratedValue
	private int feedbackId;
	private int ratings;
	private int postId;
//	private ServiceProvider serviceProvider;
	private String reviews;
}