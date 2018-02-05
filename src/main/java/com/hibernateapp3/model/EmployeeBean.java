package com.hibernateapp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Employee")
@NamedNativeQueries(value={
		@NamedNativeQuery(name="",query="")
})
public class EmployeeBean {

	@Id
	@Column(name = "id")
	@GenericGenerator(strategy="org.hibernate.id.IncrementGenerator",name="incr")
	@GeneratedValue(generator="incr")
	private int eid;

	@Column(name = "name")
	private String ename;

	@Column(name = "sal")
	private float esal;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	
	public void setEsal(float esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

}
