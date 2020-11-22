package school_management_model;
import java.io.Serializable;

public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;
    private String sid,sname;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

}
