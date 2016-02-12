package com.saydaly.common.entity.application;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;

@Entity
@Table(name = "pharmacy_branch")
@Cacheable
public class PharmacyBranch extends AbstractEntity implements Serializable {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="pharamacy_id" , referencedColumnName = "id")
	private Pharmacy parmacy;
	
	@OneToOne
	@JoinColumn(name="pharamacy_address" , referencedColumnName = "id")
	private PharmacyAddress pharmcyAddress;
	
	
	@Column(name="working_days_hours_note")
	private String workingDaysHoursNote;
	
	@Column(name="main_branch")
	private Integer mainBranch;
	
	@ManyToOne
	@JoinColumn(name="status" , referencedColumnName = "id")
	private Lookup status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PharmacyAddress getPharmcyAddress() {
		return pharmcyAddress;
	}

	public void setPharmcyAddress(PharmacyAddress pharmcyAddress) {
		this.pharmcyAddress = pharmcyAddress;
	}

	public String getWorkingDaysHoursNote() {
		return workingDaysHoursNote;
	}

	public void setWorkingDaysHoursNote(String workingDaysHoursNote) {
		this.workingDaysHoursNote = workingDaysHoursNote;
	}

	public Integer getMainBranch() {
		return mainBranch;
	}

	public void setMainBranch(Integer mainBranch) {
		this.mainBranch = mainBranch;
	}

	public Lookup getStatus() {
		return status;
	}

	public void setStatus(Lookup status) {
		this.status = status;
	}
	
	
	
}
