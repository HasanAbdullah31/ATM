package com.concretepage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getChecking() {
		return checking;
	}
	public void setChecking(double checking) {
		this.checking = checking;
	}
	public double getSaving() {
		return saving;
	}
	public void setSaving(double saving) {
		this.saving = saving;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_id")
	private int accountId;
	@Column(name = "checking")
	private double checking;
	@Column(name = "saving")
	private double saving;
}
