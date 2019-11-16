package com.aptech.bean;

import java.util.Date;

public class outbox {
	private int outboxid;
	private String content;
	private String topic;
	private Date craeteTime;
	private int removestatus;
	private int receiptstatus;
	private String outboxeid;
	private String inboxeid;
	private int draftstatus;
	private String outboxname;
	private String inboxname;
	private Integer instatus;
	public Integer getInstatus() {
		return instatus;
	}
	public void setInstatus(Integer instatus) {
		this.instatus = instatus;
	}
	//`content``topic``createTime``remove_status``receipt_status``outbox_eid``inbox_eid``draft_status``outbox_name``inbox_name`
	public int getOutboxid() {
		return outboxid;
	}
	public void setOutboxid(int outboxid) {
		this.outboxid = outboxid;
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
	public Date getCraeteTime() {
		return craeteTime;
	}
	public void setCraeteTime(Date craeteTime) {
		this.craeteTime = craeteTime;
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
	public String getOutboxeid() {
		return outboxeid;
	}
	public void setOutboxeid(String outboxeid) {
		this.outboxeid = outboxeid;
	}
	public String getInboxeid() {
		return inboxeid;
	}
	public void setInboxeid(String inboxeid) {
		this.inboxeid = inboxeid;
	}
	public int getDraftstatus() {
		return draftstatus;
	}
	public void setDraftstatus(int draftstatus) {
		this.draftstatus = draftstatus;
	}
	public String getOutboxname() {
		return outboxname;
	}
	public void setOutboxname(String outboxname) {
		this.outboxname = outboxname;
	}
	public String getInboxname() {
		return inboxname;
	}
	public void setInboxname(String inboxname) {
		this.inboxname = inboxname;
	}
}
