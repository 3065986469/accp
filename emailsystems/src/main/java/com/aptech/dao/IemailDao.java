package com.aptech.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aptech.bean.Accessorybox;
import com.aptech.bean.Inbox;
import com.aptech.bean.outbox;

public interface IemailDao {
	public List<Inbox> queryInbox(@Param("eid")String eid,@Param("inboxid")Integer inboxid,@Param("zt")String zt,@Param("inboxname")String inboxname,@Param("beginTime")String begin,@Param("endTime")String end);
	public List<Inbox> queryoutbox(@Param("eid")String eid,@Param("outboxid")Integer outboxid,@Param("zt")String zt,@Param("outboxname")String outboxname,@Param("beginTime")String begin,@Param("endTime")String end,@Param("draftstatus")Integer draftstatus);
	public List<Accessorybox> queryaccessorybox(@Param("inboxid")Integer inboxid);
	public  List<Inbox> queryremove(@Param("eid")String eid,@Param("removestatus") Integer removestatus,@Param("outboxid")Integer outboxid,@Param("zt")String zt,@Param("outboxname")String outboxname,@Param("inboxname")String inboxname,@Param("beginTime")String begin,@Param("endTime")String end);
	//public List<outbox> queryoutbox(@Param("eid")String eid,@Param("outboxid")Integer outboxid,@Param("zt")String zt,@Param("outboxname")String outboxname,@Param("beginTime")Date begin,@Param("endTime")Date end,@Param("draftstatus")Integer draftstatus);
	public int insertoutbox(Inbox outbox);
	public int insertinbox(Inbox inbox);
	public int updateboxdelete(@Param("removeid")Integer removeid,@Param("outboxid")Integer outboxid);
	public int updateinread(@Param("readstatus")Integer readstatus,@Param("inboxid")Integer inboxid);
	public int boxdelete(@Param("outboxid")Integer outboxid);
	
	public int insertaccbox(@Param("path") String path);
	public int updatepath(@Param("emailid")Integer emailid,@Param("aid")Integer aid);
}
