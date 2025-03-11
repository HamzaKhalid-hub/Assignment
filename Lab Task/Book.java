class Book {
    private String title;
    private String isbn;
    private Date publicationDate;
    private Person author;

    public Book(String title, String isbn, Date publicationDate, Person author) {
        this.title = title;
        this.isbn = isbn;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }

    public Book(Book copy) {
        this.title = copy.title;
        this.isbn = copy.isbn;
        this.publicationDate = new Date(copy.publicationDate);
        this.author = new Person(copy.author);
    }
    
    public boolean equals(Object copy) {
        if (this == copy) return true;
        if (copy == null || getClass() != copy.getClass()) return false;
        Book book = (Book) copy;
        return title.equals(book.title) && isbn.equals(book.isbn) && publicationDate.equals(book.publicationDate) && author.equals(book.author);
    }
    
    public void setTitle(String title) { this.title = title; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
	@Override
	public String toString() {
    		return "Title: " + title + ", ISBN: " + isbn + ", Publication Date: " + publicationDate + 	", Author: " + author + "";
}
}
