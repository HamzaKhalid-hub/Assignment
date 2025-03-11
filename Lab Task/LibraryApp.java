public class LibraryApp {
    public static void main(String[] args) {
        Address address = new Address("LDA Avenue", "Lahore");
        Person author = new Person("Hamza Khalid", "Writer", address);
        Date pubDate = new Date(11, 03, 2025);
        Book book = new Book("Java Programming", "0321-321321", pubDate, author);
        Person incharge = new Person("Ali Ahmad", "Incharge", address);
        Person staff = new Person("Asad Akram", "Sub-Incharge", address);
        
        Library library = new Library("Comsats Library", book, incharge, staff);
        
       System.out.println(library);
    }
}