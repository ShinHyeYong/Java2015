package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGwamok;

public class CGwamokDAO {
	
	public CGwamok read(){return null;}
	
	public void write(CGwamok gwamok) {
		// serialize
		System.out.println("과목ID" + gwamok.getID());
		System.out.println(",과목명: "+ gwamok.getName());
		
		try {
			ObjectOutputStream out
				= new ObjectOutputStream(new FileOutputStream("gwamok"));
			out.writeObject(gwamok);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
