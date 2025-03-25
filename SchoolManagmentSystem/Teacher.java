package SchoolManagmentSystem;
public class Teacher extends Person{
	int Id;
	String subject;
	private int counter=1;
	
	public Teacher(String name,int age,String subject){
		this.setAge(age);	
		this.setName(name);
		this.setSubject(subject);
		this.Id=counter++;
	
	}
	public void setId(int Id){
		this.Id=Id;
	}
	public int getId(){
		return Id;
	}
	public void setSubject(String subject){
		this.Id=Id;
	}
	public String getSubject(){
		return subject;
	}
	/*public Boolean equals(Teacher teacherId){
		
		if(this.Id==Teacher.teacherId)
			return true;
		else{return false;}
		
	}*/
	public String toString(){
		return String.format("Teacher Name: %s, Teacher Id= %d, Teacher Age: %d, Teacher Subject: %s",this.getName(), this.Id, this.getAge(), this.subject);
	}
}
