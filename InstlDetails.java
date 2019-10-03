public class InstlDetails extends TechnicianDetails
{
	private String startDate;
	private String endDate;
	
	public InstlDetails() 
	{
		super();
		this.startDate=null;
		this.endDate=null;
	}
	public InstlDetails(String name,String contactNumber,String startDate,String endDate) 
	{
		super(name,contactNumber);
		this.startDate=startDate;
		this.endDate=endDate;
	}
	public void setstartDate(String startDate)
	{
		this.startDate=startDate;
	}
	public void setendDate(String endDate)
	{
		this.endDate=endDate;
	}
	public void setName(String Name)
	{
		super.setName(Name);
	}
	public void setcontactNumber(String Number)
	{
		super.setContactNumber(Number);
	}
	
	public String getstartDate()
	{
		return this.startDate;
	}
	public String getendDate()
	{
		return this.endDate;
	}
	public String getName()
	{
		return super.getName();
	}
	public String getcontactNumber()
	{
		return super.getContactNumber();
	}
	
	public String showInstlDetails()
	{
		return this.getName()+" from "+this.getstartDate()+" to "+this.getendDate();
	}
}