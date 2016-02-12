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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;

@Entity
@Table(name="Purchace_Order")
@Cacheable
public class PurchaceOrder extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column(name = "estimated_total_price")
	private Double estimatedTotalPrice;

	@ManyToOne
	@JoinColumn(name="purchace_order_initiator" , referencedColumnName="id")
	private PublicClient purchaceOrderInitiator;
	
	
	@Column(name = "full_public_client_name")
	private String fullUserName;

	@Column(name = "country_name")
	private String countryName;

	private String city;

	private String district;

	private String streetName;

	@Column(name = "building_number")
	private String buildingNumber;

	private Double latitude;

	private Double longitude;

	@Column(name = "foloor_number")
	@NotNull
	private Integer floorNumber;

	@NotNull
	@Column(name = "appartment_number")
	private String appartmentNumber;
	
	@Column(name="order_note")
	private String orderNote;
	
	@Column(name="order_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name="order_status" , referencedColumnName ="id")
	private Lookup orderStatus;
	
	@ManyToOne
	@JoinColumn(name="accepted_by_pharmacy" , referencedColumnName ="id")
	private Pharmacy acceptedByPharmacy;
	
	@Column(name="acceptance_date")
	private Date acceptanceDate;
	
	@ManyToOne
	@JoinColumn(name="order_last_status" , referencedColumnName = "id")
	private Lookup orderLastStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getEstimatedTotalPrice() {
		return estimatedTotalPrice;
	}

	public void setEstimatedTotalPrice(Double estimatedTotalPrice) {
		this.estimatedTotalPrice = estimatedTotalPrice;
	}

	public String getFullUserName() {
		return fullUserName;
	}

	public void setFullUserName(String fullUserName) {
		this.fullUserName = fullUserName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getAppartmentNumber() {
		return appartmentNumber;
	}

	public void setAppartmentNumber(String appartmentNumber) {
		this.appartmentNumber = appartmentNumber;
	}

	public String getOrderNote() {
		return orderNote;
	}

	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Lookup getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Lookup orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Pharmacy getAcceptedByPharmacy() {
		return acceptedByPharmacy;
	}

	public void setAcceptedByPharmacy(Pharmacy acceptedByPharmacy) {
		this.acceptedByPharmacy = acceptedByPharmacy;
	}

	public Date getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public Lookup getOrderLastStatus() {
		return orderLastStatus;
	}

	public void setOrderLastStatus(Lookup orderLastStatus) {
		this.orderLastStatus = orderLastStatus;
	}

	public PublicClient getPurchaceOrderInitiator() {
		return purchaceOrderInitiator;
	}

	public void setPurchaceOrderInitiator(PublicClient purchaceOrderInitiator) {
		this.purchaceOrderInitiator = purchaceOrderInitiator;
	}
	
	
	
	
}
