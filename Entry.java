public class Entry
{
	private int entryNumber;
	private String entryDate;
	private InstlDetails installation;
	private Address adr;
	private static int curEntry=1;
	//private TechnicianDetails technician;
	//private ACdetails Ac;
	
	public Entry() 
	{
	}
	public void setEntry()
	{
		this.entryNumber=curEntry;
	}
	public Entry(String entryDate,InstlDetails installation,Address adr)
	{
		this.entryDate=entryDate;
		this.installation =installation;
		this.adr=adr;
		setEntry();
	}
	
	public void setentryDate(String entryDate)
	{
		this.entryDate=entryDate;
	}
	
	public void setInstlDetails(InstlDetails installation)
	{
		this.installation=installation;
	}
	
	public void setAddress(Address adr)
	{
		this.adr=adr;
	}
	 
	public String getentryDate()
	{
		return this.entryDate;
	}
	public int getentryNumber()
	{
		return entryNumber;
	}
	public Address getAddress()
	{
		return this.adr;
	}
	public InstlDetails getInstlDetails()
	{
		return this.installation;
	}
	public static int getcurEntry()
	{
		return curEntry++;
	}
    public String toString() {
        return this.adr.showDetails() +" which was installed by " + this.installation.showInstlDetails();
    }
	
}