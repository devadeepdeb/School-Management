package school_management_model;

import java.io.Serializable;

public class Clas implements Serializable {
	private static final long serialVersionUID = 1L;
    private String cid,cname;
    
public Clas() {
    	
    }

public String getCid() {
	return cid;
}

public void setCid(String cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}
    
      
}

