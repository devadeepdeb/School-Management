package school_management_model;

import java.io.Serializable;

public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
    private String tid,tname;
    
public Teacher() {
    	
    }
    
    public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
  
}
