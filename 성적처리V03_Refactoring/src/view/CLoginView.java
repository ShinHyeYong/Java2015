package view;
import entity.CMember;


public class CLoginView {
	public CMember login(){
		CMember member = new CMember();

	//	input from file using  scanner	
		
		System.out.println("ID�� �Է��ϼ���: ");
		member.setUesrID("userID");
		
		System.out.println("password�� �Է��ϼ���: ");
		member.setPassword("password");
		
		return member;
	}
}
