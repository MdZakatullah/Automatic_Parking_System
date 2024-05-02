package com.aps.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PAYMENT_DTLS")
public class PaymentDtls {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cardno;
	private String expirydate;
	private String cvv;
	private String cardowner;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getCardowner() {
		return cardowner;
	}
	public void setCardowner(String cardowner) {
		this.cardowner = cardowner;
	}
	@Override
	public String toString() {
		return "PaymentDtls [id=" + id + ", cardno=" + cardno + ", expirydate=" + expirydate + ", cvv=" + cvv
				+ ", cardowner=" + cardowner + "]";
	}
	
	
	
	
}
