package school_management_model;

import java.io.Serializable;

public class Assignment implements Serializable {
	private static final long serialVersionUID = 1L;
    private String tid,cid,sid,stid;
    
public Assignment() {
    	
    }

public String getTid() {
	return tid;
}

public void setTid(String tid) {
	this.tid = tid;
}

public String getCid() {
	return cid;
}

public void setCid(String cid) {
	this.cid = cid;
}

public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}

public String getStid() {
	return stid;
}

public void setStid(String stid) {
	this.stid = stid;
}
      
}

