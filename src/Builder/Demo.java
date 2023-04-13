package Builder;
import java.io.*;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Hola");			
		
		Student student = new Student(1,"34354354","","",120,20,"","",true);
		
		
		
		Student student2 = new StudentBuilder().setId(1).setCode("1234").setName("Pedro").build();
		
	
		
	}

}
