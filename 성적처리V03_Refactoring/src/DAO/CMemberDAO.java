package DAO;

import entity.CMember;

public class CMemberDAO {
	
	public CMember read(){return null;}
	
	public void write(CMember member) {
		System.out.println("user의 ID 와 password 를 출력합니다. ");
		System.out.println("ID: " + member.getUesrID());
		System.out.println("password: " + member.getPassword());
		
	}

}
