class Lab{
	private String name="C01";
	private Employe labStaff;
	SystemUnit system[]=new SystemUnit[50];
	Boolean hasMultiMedia;

	
	
	public Lab(String name,Boolean hasMultiMedia,Employe labStaff, SystemUnit system[]){
		this.name=name;
		this.hasMultiMedia=hasMultiMedia;
		this.labStaff=new Employe("","");

		for(int i=0;i<50;i++){
			this.system[i]=new SystemUnit(system[i].getCpuName(),system[i].getRamSize(),system[i].getdiskSize(),system[i].getLcdModel());
}
	
	} 

	public SystemUnit[] system(){
		return system;
}
	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name=newName;
	}


	public void setHasMultiMedia(Boolean hasMultiMedia){
		this.hasMultiMedia=hasMultiMedia;
	}
	public Boolean getHasMultiMedia(){
		return hasMultiMedia;
	}

	public String toString(){

		String s;

		StringBuilder sb = new StringBuilder();

		sb.append("LAB NAME: ").append(name).append("\nHas MultiMedia: ").append(hasMultiMedia).append("\nLab incharge: ").append(this.labStaff.getName()).append("\nSYSTEM DETAILS; \n");

		for (int i=0; i<system.length; i++){

			sb.append(system[i].toString()).append("\n");

		}

		return sb.toString();

		

	}




}