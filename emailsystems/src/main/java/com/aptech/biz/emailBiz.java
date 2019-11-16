package com.aptech.biz;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.bean.Accessorybox;
import com.aptech.bean.Inbox;
import com.aptech.bean.outbox;
import com.aptech.dao.IemailDao;
import com.github.pagehelper.PageHelper;

@Service
public class emailBiz {
	@Autowired
	public IemailDao ed;
	
	public List<Inbox> queryInbox(int pageNum, int pageSize, String eid, Integer inboxid, String zt, String inboxname, String begin, String end) {
		PageHelper.startPage(pageNum, pageSize);
		List<Inbox> list=ed.queryInbox(eid, inboxid, zt, inboxname, begin, end);
		
		return list;
	}
	public List<Inbox> queryoutbox(int pageNum, int pageSize, String eid, Integer boxid, String zt, String outboxname, String begin, String end) {
		PageHelper.startPage(pageNum, pageSize);
		List<Inbox> list=ed.queryoutbox(eid, boxid, zt, outboxname, begin, end, 1);
		return list;
	}
	public List<Inbox> queryoutboxs(String eid, Integer boxid, String zt, String outboxname, String begin, String end) {
	
		List<Inbox> list=ed.queryoutbox(eid, boxid, zt, outboxname, begin, end, null);
		return list;
	}
	
	public List<Inbox> querydrafts(int pageNum, int pageSize, String eid, Integer boxid, String zt, String outboxname, String begin, String end,Integer drafts) {
		PageHelper.startPage(pageNum, pageSize);
		List<Inbox> list=ed.queryoutbox(eid, boxid, zt, outboxname, begin, end, drafts);
		return list;
	}
	
	public List<Inbox> queryremove(int pageNum, int pageSize,String eid,Integer removestatus,Integer outboxid,String zt,String outboxname,String inboxname,String begin,String end) {
		PageHelper.startPage(pageNum, pageSize);
		List<Inbox> list=ed.queryremove(eid, removestatus,outboxid,zt,outboxname,inboxname,begin,end);
		return list;
	}
	
	public boolean insertoutbox(Inbox out) {
		return ed.insertoutbox(out)>0;
	}
	public boolean insertinbox(Inbox out) {
		return ed.insertinbox(out)>0;
	}
	
	public boolean updateoutdelete(Integer removeid, Integer outboxid) {
		return ed.updateboxdelete(removeid, outboxid)>0;
	}
	
	
	public boolean boxdelete(Integer outboxid) {
		return ed.boxdelete(outboxid)>0;
	}
	
	public boolean insertaccbox(String path) {
		return ed.insertaccbox(path)>0;
	}
	public boolean updatepath(Integer emailid, Integer aid) {
		return ed.updatepath(emailid, aid)>0;
	}
	
	public List<Accessorybox> queryaccessorybox(Integer inboxid) {
		return ed.queryaccessorybox(inboxid);
	}
	public boolean updateinread(Integer readstatus,Integer inboxid) {
		return ed.updateinread(readstatus, inboxid)>0;
	}
	
}
