class SystemUnit{
	private String cpuName="i7";
	private String ramSize="8 Gbs";
	private String diskSize="256 Gbs";
	private String systemId="C001";
	private String lcdModel="abc";
	
	public SystemUnit(String cpuName,String ramSize,String diskSize,String lcdModel)
{

	this.cpuName=cpuName;
	this.ramSize=ramSize;
	this.diskSize=diskSize;
	this.lcdModel=lcdModel;

}

	public void setCpuName(String newCpuName){
		this.cpuName=newCpuName;
	}

	public String getCpuName(){
		return cpuName;
	}



	public String getRamSize(){
		return ramSize;
	}
	public void setRamSize(String newRamSize){
		this.ramSize=newRamSize;
	}


	public String getdiskSize(){
		return diskSize;
	}
	public void setDiskSize(String newDiskSize){
		this.diskSize=newDiskSize;
	}

	public String getLcdModel(){
		return lcdModel;
	}
	public void setLcdModel(String newLcdModel){
		this.lcdModel=newLcdModel;
	}

	public String toString(){
		
		return String.format("CPU Name=%s ,RAM Size=%s ,Disk Size=%s ,LCD Model=%s ",cpuName,ramSize,diskSize,lcdModel);
	}

	

}

