package com.aptech.bean;

import java.util.Date;

public class Inbox {
	private int boxId;//1
	private String content;//2
	private String topic;//3
	private Date createTime;//4
	private int readstatus;//5
	private int removestatus;//6
	private int receiptstatus;//7
	private String inboxeid;//8
	private String outboxeid;//9
	private int draftstatus;//10
	private String inboxname;//11
	private String outboxname;//12
	private Integer boxstatus;//13
	
	
	
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public Integer getBoxstatus() {
		return boxstatus;
	}
	public void setBoxstatus(Integer boxstatus) {
		this.boxstatus = boxstatus;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getReadstatus() {
		return readstatus;
	}
	public void setReadstatus(int readstatus) {
		this.readstatus = readstatus;
	}
	public int getRemovestatus() {
		return removestatus;
	}
	public void setRemovestatus(int removestatus) {
		this.removestatus = removestatus;
	}
	public int getReceiptstatus() {
		return receiptstatus;
	}
	public void setReceiptstatus(int receiptstatus) {
		this.receiptstatus = receiptstatus;
	}
	public String getInboxeid() {
		return inboxeid;
	}
	public void setInboxeid(String inboxeid) {
		this.inboxeid = inboxeid;
	}
	public String getOutboxeid() {
		return outboxeid;
	}
	public void setOutboxeid(String outboxeid) {
		this.outboxeid = outboxeid;
	}
	public int getDraftstatus() {
		return draftstatus;
	}
	public void setDraftstatus(int draftstatus) {
		this.draftstatus = draftstatus;
	}
	public String getInboxname() {
		return inboxname;
	}
	public void setInboxname(String inboxname) {
		this.inboxname = inboxname;
	}
	public String getOutboxname() {
		return outboxname;
	}
	public void setOutboxname(String outboxname) {
		this.outboxname = outboxname;
	}
	
//`inbox_id``content``topic``createTime``read_status`
//`remove_status``receipt_status``inbox_eid``outbox_eid``draft_status``inbox_name``outbox_name`
}
