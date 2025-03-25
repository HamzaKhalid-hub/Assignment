package SchoolManagmentSystem;
class Student extends Person{
	private int rollNo;
	//private int r_counter=1;

	public Student(String name,int age,int rollNo){
		this.setName(name);
		this.setAge(age);
		this.rollNo=rollNo;
	}

	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	public int getRollNo(){
		return rollNo;
	}
	public Boolean equals(Student s){
		if(this.rollNo==s.rollNo)
			return true;
		else
			return false;
		
	}
	public String toString(){
		return String.format("Student Name: %s, Student Roll Number: %d, Student Age: %d",this.getName(),this.rollNo,this.getAge());
}


}