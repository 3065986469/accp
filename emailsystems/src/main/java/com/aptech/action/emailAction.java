package com.aptech.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.management.Query;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aptech.bean.Inbox;
import com.aptech.bean.employee;
import com.aptech.biz.emailBiz;
import com.aptech.biz.userBiz;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/email")
public class emailAction {
	@Autowired
	private emailBiz eb;
	
	@Autowired 
	private userBiz ub;
	
	
	@RequestMapping(value = "inbox")
	@ResponseBody
	public PageInfo<Inbox> queryinbox(Integer pageNum,Integer inboxid,String zt,String inboxname,String begin,String end ,HttpSession session) {
		int pageSize =5;
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		if (zt=="") {
			zt=null;
		}
		if (inboxname=="") {
			inboxname=null;
		}
		if (begin=="") {
			begin=null;
		}
		if (end=="") {
			end=null;
		}
		Page<Inbox> page=(Page<Inbox>) eb.queryInbox(pageNum, pageSize, eid, inboxid, zt, inboxname, begin, end);
		return page.toPageInfo();
	}
	
	@RequestMapping(value = "outbox")
	@ResponseBody
	public PageInfo<Inbox> queryoutbox(Integer pageNum,Integer inboxid,String zt,String inboxname,String begin,String end ,HttpSession session) {
		int pageSize =5;
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		if (zt=="") {
			zt=null;
		}
		if (inboxname=="") {
			inboxname=null;
		}
		if (begin=="") {
			begin=null;
		}
		if (end=="") {
			end=null;
		}
		Page<Inbox> page=(Page<Inbox>) eb.queryoutbox(pageNum, pageSize, eid, inboxid, zt, inboxname, begin, end);
		return page.toPageInfo();
	}
	
	@RequestMapping(value = "drafts")
	@ResponseBody
	public PageInfo<Inbox> querydrafts(Integer pageNum,Integer boxid,String zt,String inboxname,String begin,String end ,HttpSession session) {
		int pageSize =5;
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		if (zt=="") {
			zt=null;
		}
		if (inboxname=="") {
			inboxname=null;
		}
		if (begin=="") {
			begin=null;
		}
		if (end=="") {
			end=null;
		}
		Page<Inbox> page=(Page<Inbox>) eb.querydrafts(pageNum, pageSize, eid, boxid, zt, inboxname, begin, end,0);
		return page.toPageInfo();
	}
	
	@RequestMapping(value = "discardEmail")
	@ResponseBody
	public PageInfo<Inbox> querysearchEmail(Integer pageNum,Integer boxid,String zt,String outboxname,String inboxname,String begin,String end ,HttpSession session) {
		int pageSize =5;
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		if (zt=="") {
			zt=null;
		}
		if (inboxname=="") {
			inboxname=null;
		}
		if (outboxname=="") {
			outboxname=null;
		}
		if (begin=="") {
			begin=null;
		}
		if (end=="") {
			end=null;
		}
		Page<Inbox> page=(Page<Inbox>) eb.queryremove(pageNum, pageSize, eid, 1,null, zt,outboxname, inboxname, begin, end);
		return page.toPageInfo();
	}
	
	@RequestMapping(value = "addEmail")
	@ResponseBody
	public int queryaddemail(String inname,String zt,String topic, Integer box,MultipartFile file,HttpSession session) {
		employee e=(employee) session.getAttribute("user");
		Inbox in=new Inbox();
		in.setBoxstatus(2);
		in.setContent(zt);
		in.setTopic(topic);
		in.setCreateTime(new Date());
		in.setOutboxeid(e.getEid());
		in.setOutboxname(e.getEname());
		in.setInboxeid(inname);
		in.setReceiptstatus(0);
		in.setRemovestatus(0);
		
		String[] inboxname=inname.split(",");
		int ii=0;
		System.out.println(inboxname[0]);
		if (box==1) {
			String name="";
			for (int i = 0; i < inboxname.length; i++) {
				//System.out.println(inboxname[i]);
				name+=ub.queryin(inboxname[i]).get(0).getEname()+",";
			}
			in.setInboxname(name);
			in.setDraftstatus(1);
			if (eb.insertoutbox(in)) {
				System.out.println(eb.queryoutboxs(e.getEid(), null, null, null, null, null).size());
			Inbox lists=eb.queryoutboxs(e.getEid(), null, null, null, null, null).get(eb.queryoutboxs(e.getEid(), null, null, null, null, null).size()-1);
			if (file!=null) {
				eb.updatepath(lists.getBoxId(), eb.queryaccessorybox(null).get(eb.queryaccessorybox(null).size()-1).getAid());
			}	
			
				
				for (int i = 0; i < inboxname.length; i++) {
					System.out.println(inboxname[i]);
					if (ub.queryin(inboxname[i]).get(0)!=null) {
						Inbox out=new Inbox();
						out.setBoxstatus(1);
						out.setContent(zt);
						out.setCreateTime(new Date());
						out.setOutboxeid(e.getEid());
						out.setOutboxname(e.getEname());
						out.setTopic(topic);
						out.setReceiptstatus(0);
						out.setRemovestatus(0);
						out.setInboxeid(ub.queryin(inboxname[i]).get(0).getEid());
						out.setInboxname(ub.queryin(inboxname[i]).get(0).getEname());
						if (eb.insertinbox(out)) {
							ii++;
						}
					}
				}
				if (ii==inboxname.length) {
					return 1;
				}else {
					return 0;
				}
			}else {
				return 0;
			}
		}else {
			in.setDraftstatus(0);
			String name="";
			for (int i = 0; i < inboxname.length; i++) {
				//System.out.println(inboxname[i]);
				name+=ub.queryin(inboxname[i]).get(0).getEname()+",";
			}
			in.setInboxname(name);
			if (eb.insertoutbox(in)) {
				return 1;
			}else {
				return 0;
			}
		}
	}
	
//	
	
	
	@RequestMapping(value = "path")
	@ResponseBody
	public int queryuploading(MultipartFile file,HttpSession session) {
		System.out.println(file);
		String path=session.getServletContext().getRealPath("/images");
		String newName = UUID.randomUUID().toString().replaceAll("-", "");
		String suffix=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		try {
			file.transferTo(new File(path + File.separator + newName + suffix));
			if (eb.insertaccbox(path + File.separator + newName + suffix)) {
				return 1;
			}else {
				return 0;
			}
		} catch (IllegalStateException | IOException e) {
			return 0;
		}
//		stu.setImg()
	}
	
	@RequestMapping(value = "updateboxdelete")
	@ResponseBody
	public int updateoutdelete(Integer removeid, String outboxid,HttpSession session) {
		String[] m=outboxid.split(",");
		int ii=0;
		for (int i = 0; i < m.length; i++) {
			 int mm=Integer.parseInt(m[i]);
			if (eb.updateoutdelete(removeid, mm)) {
				ii++;
			}else {
				ii++;
			}
		}
		if (ii==m.length) {
			return 0;
		}else {
			return 1;
		}
	}
	
	@RequestMapping(value = "boxdelete")
	@ResponseBody
	public int boxdelete(String outboxid,HttpSession session) {
		String[] m=outboxid.split(",");
		int ii=0;
		for (int i = 0; i < m.length; i++) {
			 int mm=Integer.parseInt(m[i]);
			if (eb.boxdelete(mm)) {
				ii++;
			}else {
				ii++;
			}
		}
		if (ii==m.length) {
			return 0;
		}else {
			return 1;
		}
	}
	
	@RequestMapping(value = "readbox")
	@ResponseBody
	public int readbox(Integer inboxid,Integer readstatus,HttpSession session) {
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		if (eb.queryInbox(1, 1, eid, inboxid, null, null, null, null).get(0)!=null) {
			if (eb.queryInbox(1, 1, eid, inboxid, null, null, null, null).get(0).getReadstatus()==1) {
				if (readstatus!=null&&"".equals(readstatus)) {
					eb.updateinread(readstatus, inboxid);
				}
				
			}
			session.setAttribute("inbox", eb.queryInbox(1, 1, eid, inboxid, null, null, null, null).get(0));
			return 0;
		}else {
			return 1;
		}
	}
	
	
	@RequestMapping(value = "emailid")
	@ResponseBody
	public int emailid(String inboxid,Integer drafts,HttpSession session) {
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		Integer inboxids=Integer.parseInt(inboxid);
		if (eb.querydrafts(1, 1, eid, inboxids, null, null, null, null, drafts).get(0)!=null) {
			
			session.setAttribute("inbox", eb.querydrafts(1, 1, eid, inboxids, null, null, null, null, drafts).get(0));
			return 0;
		}else {
			return 1;
		}
	}
	
	@RequestMapping(value = "removeid")
	@ResponseBody
	public int removeid(String inboxid,HttpSession session) {
		employee e= (employee) session.getAttribute("user");
		String eid=e.getEid();
		Integer inboxids=Integer.parseInt(inboxid);
		if (eb.queryremove(1, 1, eid, 1, inboxids,null, null,null, null, null).get(0)!=null) {
			
			session.setAttribute("inbox", eb.queryremove(1, 1, eid, 1,inboxids, null, null, null,null, null).get(0));
			return 0;
		}else {
			return 1;
		}
	}
	
	
	@RequestMapping(value="box")
	@ResponseBody
	public Inbox sessionab(HttpSession session){
		
		Inbox ins=(Inbox) session.getAttribute("inbox");

		return ins;
	}
	
	@RequestMapping(value="user")
	@ResponseBody
	public employee sessionuser(HttpSession session){
		employee empp=(employee) session.getAttribute("user");
		
		return empp;
	}
	
	@RequestMapping(value = "readboxbj")
	@ResponseBody
	public int readboxbj(String inboxid,Integer readstatus,HttpSession session) {
			
		String[] m=inboxid.split(",");
		int ii=0;
		for (int i = 0; i < m.length; i++) {
			 int mm=Integer.parseInt(m[i]);
			if (eb.updateinread(readstatus,mm)) {
				ii++;
			}else {
				ii++;
			}
		}
		if (ii==m.length) {
			return 0;
		}else {
			return 1;
		}
				
	}
	
	
}
