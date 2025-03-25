package SchoolManagmentSystem;
class Principal extends Person{
	private String experience;

	public Principal(String name,int age,String experience){
		this.setName(name);
		this.setAge(age);
		this.setExperience(experience);

	}

	public void setExperience(String experience){
		this.experience=experience;
	}
	public String getExperience(){
		return experience;
	}


	public String getString(){
		return String.format("Principal Name: %s, Principal Age: %d, Principal Experience: %s",this.getName(),this.getAge(),this.experience);
}


}