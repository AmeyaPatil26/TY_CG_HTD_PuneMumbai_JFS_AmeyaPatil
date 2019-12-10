package com.capgemini.jawithhibernate.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pencilbox")
public class PencilBox {
	
	@Id
	@Column
	private int boxid;
	@Column
	private String bname;
	@OneToMany(mappedBy = "pencilBox")
	private List<Pencil> pencil;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public List<Pencil> getPencil() {
		return pencil;
	}
	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}
	public int getBoxid() {
		return boxid;
	}
	public void setBoxid(int boxid) {
		this.boxid = boxid;
	}
	
}
