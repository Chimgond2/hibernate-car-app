package com.ty.car_app;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String subject;
	private String content;
	@CreationTimestamp
	private LocalDateTime createDateAndTime;
	@UpdateTimestamp
	private LocalDateTime udateDateAndTime;
	private String writerName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreateDateAndTime() {
		return createDateAndTime;
	}
	public void setCreateDateAndTime(LocalDateTime createDateAndTime) {
		this.createDateAndTime = createDateAndTime;
	}
	public LocalDateTime getUdateDateAndTime() {
		return udateDateAndTime;
	}
	public void setUdateDateAndTime(LocalDateTime udateDateAndTime) {
		this.udateDateAndTime = udateDateAndTime;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	
	

}
