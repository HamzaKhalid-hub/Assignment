package SchoolManagmentSystem;

public class School {
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classRooms = new ClassRoom[2];
    private int classCount = 0;

    public School(String name, String address, int age, String experience) {
        this.name = name;
        this.address = address;
        this.principal = new Principal(name, age, experience);
    }

    public void addClassRoom(ClassRoom classRoom) {
        if (classCount < classRooms.length) {
            classRooms[classCount++] = classRoom;
        } else {
            System.out.println("----No More Classrooms Can Be Added----");
        }
    }


    public String toString() {
        return String.format("School Name: %s, Address: %s", 
                name, address);
    }
}
