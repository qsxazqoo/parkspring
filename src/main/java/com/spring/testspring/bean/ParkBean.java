package com.spring.testspring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name ="Park")
public class ParkBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String type;
	private String num ;
	private String name;
	private String address;
	private Integer anypark;
	private Integer bigcar;
	private Integer smallcar;
	private Integer handicapped;
	private Integer wonmenchildren;
	private Integer energy;
	private Integer common;
	private Integer moto;
	private String time;
	private String money;
	private String local;
	
	
	public ParkBean(String type, String num, String name, String address, Integer anypark, Integer bigcar,
			Integer smallcar, Integer handicapped, Integer wonmenchildren, Integer energy, Integer common, Integer moto,
			String time, String money, String local) {
		super();
		this.type = type;
		this.num = num;
		this.name = name;
		this.address = address;
		this.anypark = anypark;
		this.bigcar = bigcar;
		this.smallcar = smallcar;
		this.handicapped = handicapped;
		this.wonmenchildren = wonmenchildren;
		this.energy = energy;
		this.common = common;
		this.moto = moto;
		this.time = time;
		this.money = money;
		this.local = local;
	}


	public ParkBean() {
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getAnypark() {
		return anypark;
	}


	public void setAnypark(Integer anypark) {
		this.anypark = anypark;
	}


	public Integer getBigcar() {
		return bigcar;
	}


	public void setBigcar(Integer bigcar) {
		this.bigcar = bigcar;
	}


	public Integer getSmallcar() {
		return smallcar;
	}


	public void setSmallcar(Integer smallcar) {
		this.smallcar = smallcar;
	}


	public Integer getHandicapped() {
		return handicapped;
	}


	public void setHandicapped(Integer handicapped) {
		this.handicapped = handicapped;
	}


	public Integer getWonmenchildren() {
		return wonmenchildren;
	}


	public void setWonmenchildren(Integer wonmenchildren) {
		this.wonmenchildren = wonmenchildren;
	}


	public Integer getEnergy() {
		return energy;
	}


	public void setEnergy(Integer energy) {
		this.energy = energy;
	}


	public Integer getCommon() {
		return common;
	}


	public void setCommon(Integer common) {
		this.common = common;
	}


	public Integer getMoto() {
		return moto;
	}


	public void setMoto(Integer moto) {
		this.moto = moto;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getMoney() {
		return money;
	}


	public void setMoney(String money) {
		this.money = money;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
	
}
