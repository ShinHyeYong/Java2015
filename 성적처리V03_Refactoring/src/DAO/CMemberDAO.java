package DAO;

import entity.CMember;

public class CMemberDAO {
	
	public CMember read(){return null;}
	
	public void write(CMember member) {
		System.out.println("user�� ID �� password �� ����մϴ�. ");
		System.out.println("ID: " + member.getUesrID());
		System.out.println("password: " + member.getPassword());
		
	}

}
