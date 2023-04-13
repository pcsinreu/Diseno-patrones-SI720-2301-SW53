package Builder;

public class Student {
	
	private int id;
	private String code;
	private String name;
	private String courses;
	private int age ;
	private int pension ;
	private String lastName;
	private String carreer;
	private boolean isActive;
	
	public Student() {}
	
	public Student(int id, String code, String name,String Courses,int pension , int age,String lastname,String carreer, boolean isActive) {
		this.id =id;
		this.code=code;
		this.name= name;		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Student(int id, String code) {
		
	}

	
	public Student(int id, String code,String name,String Courses) {
		
	}
	
}

