package entity;
//entity class or value class
public class CMember {
	//value object
	//attributes: 속성
	//절대 속성을 public 으로 놓지않음
	
	private String uesrID;
	private String password;

	//
	public String getUesrID() {return uesrID;}
	public void setUesrID(String uesrID) {this.uesrID = uesrID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

}
