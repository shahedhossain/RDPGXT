package com.rdpgroupbd.apps.shared;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RECORD")
public class Record implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RECORD_ID", unique = true, nullable = false)
	private int recordId;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "TITLE", nullable = false, length = 30)
	private String title;

	@Column(name = "YEAR", nullable = false)
	private int year;

	@ManyToMany(mappedBy = "records")
	private List<Account> accounts;

	public Record() {
	}

	public int getRecordId() {
		return this.recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}