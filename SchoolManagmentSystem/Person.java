package SchoolManagmentSystem;
class Person{
	private String name;
	private int age;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.name=name;
	}
	public int getAge(){
		return age;	
	}
	public String toString(){
		return String.format("Name: %s, Age: %d",name,age);
	}

}