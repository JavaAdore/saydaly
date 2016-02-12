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

import com.saydaly.common.entity.AbstractEntity;
import com.saydaly.common.entity.core.Lookup;

@Entity
@Table(name="public_client_application_feedback_rate")
@Cacheable
public class ApplicationFeedbackRate extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="public_client_id" , referencedColumnName="id")
	private PublicClient publicClient;
	
	
	private String feedback;
	
	@ManyToOne
	@JoinColumn(name="channel" , referencedColumnName = "id")
	private Lookup channel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="feedback_date")
	private Date feedbackDate;
	
	
	private String version;
	
	private Integer stars;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PublicClient getPublicClient() {
		return publicClient;
	}

	public void setPublicClient(PublicClient publicClient) {
		this.publicClient = publicClient;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Lookup getChannel() {
		return channel;
	}

	public void setChannel(Lookup channel) {
		this.channel = channel;
	}

	public Date getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}
	
	

}
