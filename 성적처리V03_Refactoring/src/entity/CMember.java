package entity;

import java.io.Serializable;

//entity class or value class
public class CMember implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String uesrID;
	private String password;

	//
	public String getUesrID() {return uesrID;}
	public void setUesrID(String uesrID) {this.uesrID = uesrID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

}
