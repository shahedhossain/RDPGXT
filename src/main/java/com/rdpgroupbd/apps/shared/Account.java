package com.rdpgroupbd.apps.shared;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ACCOUNT_ID", unique = true, nullable = false)
	private int accountId;

	@Column(name = "NAME", nullable = false, length = 26)
	private String name;

	@Column(name = "PASSWORD", nullable = false, length = 26)
	private String password;

	// bi-directional many-to-many association to Record
	@ManyToMany
	@JoinTable(name = "account_record", joinColumns = { @JoinColumn(name = "ACCOUNT_ID", nullable = false) }, inverseJoinColumns = { @JoinColumn(name = "RECORD_ID", nullable = false) })
	private List<Record> records;

	public Account() {
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Record> getRecords() {
		return this.records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

}