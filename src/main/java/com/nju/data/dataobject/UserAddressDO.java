package com.nju.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
@Entity
@Table(name="user_addr")
public class UserAddressDO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String username;
	private String street;
	private String building;
	private String room;
	private boolean isDefault;
	
	public UserAddressDO(){}
	public UserAddressDO(String user,String street,String building,String room,boolean isDefault){
		this.username = user;
		this.street = street;
		this.building = building;
		this.room = room;
		this.isDefault = isDefault;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",nullable=false)
	public long getId(){
		return this.id;
	}
	@Column(name="username",length=45,nullable=false)
	public String getUsername(){
		return this.username;
	}
	
	@Column(name="street",length=200,nullable=false)
	public String getStreet(){
		return this.street;
	}
	@Column(name="building",length=50,nullable=false)
	public String getBuilding(){
		return this.building;
	}
	
	@Column(name="room",length=10,nullable=false)
	public String getRoom(){
		return this.room;
	}
	@Column(name="isDefault",nullable=false)
	public boolean getIsDefault(){
		return this.isDefault;
	}
	
	public void setUsername(String user){
		this.username = user;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public void setBuilding(String building){
		this.building = building;
	}
	public void setRoom(String room){
		this.room = room;
	}
	public void setIsDefault(boolean is_default){
		this.isDefault = is_default;
	}
	public void setId(long id){
		this.id = id;
	}
}
