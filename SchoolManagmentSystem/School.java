package SchoolManagmentSystem;
public class School{
	private String name;
	private String address;
	
	ClassRoom[] classRoom=new ClassRoom[2];

	public School(String address,String name,int age,String experience){
		this.name=name;
		this.address=address;
		Principal principal=new Principal( name, age , experience);
		
		
	}


}