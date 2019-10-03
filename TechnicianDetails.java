public class TechnicianDetails
{
	private String name;
	private String contactNumber;
	
	public TechnicianDetails() {
		this.name=null;
		this.contactNumber=null;
	}
	public TechnicianDetails(String Name, String ContactNumber) {
		this.name=Name;
		this.contactNumber=ContactNumber;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
	public void setContactNumber(String ContactNumber)
	{
		this.contactNumber=ContactNumber;
	}
	public String getName()
	{
		return this.name;
	}
	public String getContactNumber()
	{
		return this.contactNumber;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
}