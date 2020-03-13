package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "user_table")
public class User implements Serializable{
	
	@Id
    private long userId;
    @Column
	private String username;
    @Column
    private String createdBy;
    @Column
    private Date createdDate;
    
    @OneToOne
    @JoinColumn(referencedColumnName = "idAddress")
    private Address addressId;
    
    public Address getAddress() {
		return addressId;
	}

	public void setAddress(Address addressId) {
		this.addressId = addressId;
	}

	public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
 
    public Date getCreatedDate() {
        return createdDate;
    }
 
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
 
    public long getUserId() {
        return userId;
    }
 
    public void setUserId(long userId) {
        this.userId = userId;
    }
}
