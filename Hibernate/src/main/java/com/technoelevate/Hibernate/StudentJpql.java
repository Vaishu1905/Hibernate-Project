package com.technoelevate.Hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class StudentJpql implements Serializable {
	@Id
	private int roll_no;
	private String name;
	private long phn_no;
	private String standard;

}
