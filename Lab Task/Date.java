class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
   	}
    
    public Date(Date copy) { 
        this.day = copy.day;
        this.month = copy.month;
        this.year = copy.year;
   	}
    
    public int getDay(){
	 return day;
	}
    public int getMonth(){
	 return month;
	}
    public int getYear(){
	return year;
	}

	@Override
	public String toString() {
    		return day + "/" + month + "/" + year;
	}
}
