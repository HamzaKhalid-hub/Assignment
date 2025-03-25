package SchoolManagmentSystem;
public class Main {
    public static void main(String[] args) {
        School school = new School("Government School", "123 Faisalabad", 50, "30 years");
	
        Teacher teacher1 = new Teacher("Professor Ahmad Saeed", 35, "Chemistry");
        Teacher teacher2 = new Teacher("Professor Asad Abbas", 40, "Biology");

  
        Student student1 = new Student("Hamza Khalid", 15, 101);
        Student student2 = new Student("ALi Ahmad", 16, 102);
        Student student3 = new Student("Arslan Ahmad", 15, 103);
        Student student4 = new Student("Akbar Ali", 14, 104);
        Student student5 = new Student("Asif azhar", 16, 105);
        Student student6 = new Student("Saqib Hassan", 17, 106);

        ClassRoom class1 = new ClassRoom("Grade 10 - A", "G10A");
        class1.setTeacher(teacher1);
        class1.addStudents(student1);
        class1.addStudents(student2);
        class1.addStudents(student3);
        class1.addStudents(student4);
        class1.addStudents(student5);
        class1.addStudents(student6);

        ClassRoom class2 = new ClassRoom("Grade 10 - B", "G10B");
        class2.setTeacher(teacher2);

        school.addClassRoom(class1);
        school.addClassRoom(class2);

        
        System.out.println(school);
	Principal principal=new Principal("Ahmad",10,"10years");
	System.out.println(principal.toString());
        System.out.println(class1);
        System.out.println(class2);
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}

