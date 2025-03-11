class Person {
    private String name;
    private String role;
    private Address address;

    public Person(String name, String role, Address address) {
        this.name = name;
        this.role = role;
        this.address = new Address(address); 
    }

    public Person(Person copy) {
        this.name = copy.name;
        this.role = copy.role;
        this.address = new Address(copy.address);
    }
    
    public boolean equals(Object copy) {
        if (this == copy) return true;
        if (copy == null || getClass() != copy.getClass())
		 return false;
        Person person = (Person) copy;
      		  return name.equals(person.name) && role.equals(person.role) && address.equals(person.address);
    }
    
    public void setRole(String role) { this.role = role; }
	@Override
	public String toString() {
    		return "Name: " + name + ", Role: " + role + ", Address: " + address + "";
	}

}