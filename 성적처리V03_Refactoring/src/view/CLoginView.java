package view;
import java.util.Scanner;

import entity.CMember;


public class CLoginView {
	public CMember login(){
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();

	//	input from file using  scanner	
		
		System.out.println("ID를 입력하세요: ");
		member.setUesrID("userID");
		
		System.out.println("password를 입력하세요: ");
		member.setPassword("password");
		
		return member;
	}
}
