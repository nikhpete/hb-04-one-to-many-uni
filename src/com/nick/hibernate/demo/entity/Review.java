package com.nick.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "review")
@NoArgsConstructor
@Data
public class Review {
	
	public Review(String comment) {
		super();
		this.comment = comment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "comment")
	private String comment;

	@Override
	public String toString() {
		return "Review [comment=" + comment + "]";
	}
	
}
