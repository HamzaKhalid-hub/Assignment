class Library {
    private String name;
    private Book book;
    private Person incharge;
    private Person staff;

    public Library(String name, Book book, Person incharge, Person staff) {
        this.name = name;
        this.book = new Book(book); 
        this.incharge = new Person(incharge);
        this.staff = new Person(staff); 
 	}
    
    public boolean equals(Object copy) {
        if (this == copy) return true;
        if (copy == null || getClass() != copy.getClass()) return false;
        Library library = (Library) copy;
        	return name.equals(library.name) && book.equals(library.book) && incharge.equals(library.incharge) && staff.equals(library.staff);
	}
    
    public void setName(String name) { this.name = name; }
	@Override
	public String toString(){
 		return "Library Name: " + name + "\nBook: " + book + "\nIncharge: " + incharge + "\nStaff: " + staff + "";
	}
}
