package view;
import java.util.Scanner;

import entity.CMember;


public class CLoginView {
	public CMember login(){
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();

	//	input from file using  scanner	
		
		System.out.println("ID�� �Է��ϼ���: ");
		member.setUesrID("userID");
		
		System.out.println("password�� �Է��ϼ���: ");
		member.setPassword("password");
		
		return member;
	}
}
