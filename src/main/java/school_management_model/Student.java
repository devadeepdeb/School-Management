package school_management_model;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
    private String stid,stname;
    
public Student() {
    	
    }

public String getStid() {
	return stid;
}

public void setStid(String stid) {
	this.stid = stid;
}

public String getStname() {
	return stname;
}

public void setStname(String stname) {
	this.stname = stname;
}
    
      
}
