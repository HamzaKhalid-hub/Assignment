package SchoolManagmentSystem;
public class ClassRoom{
	private String className;
	private Teacher teacher;
	private String classCode;
	Student[] students=new Student[5];
	
	public ClassRoom(String classname, String classCode){
	this.className=className;
	this.classCode=classCode;
	}
	public void setTeacher(Teacher teacher){
		this.teacher=teacher;
	}	
	public void addStudents(Student s){
		 int counter=0;
	if(counter<students.length){
		students[counter++]=new Student(s.getName(),s.getAge(),s.getRollNo());
}
	else
		System.out.println("----No Seats Available for Students----");
	}
	public String toString(){

		return String.format("Class Name: %d,Class Teacher: %s ",className,teacher);
}
}