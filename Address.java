public class Address extends ACdetails
{
	private String adrsOfInstl;
	public Address() 
	{
		super();
		this.adrsOfInstl=null;
	}
	public Address(double hp,int zones,int outlets,String adrsOfInstl) 
	{
		super(hp,zones,outlets);
		this.adrsOfInstl=adrsOfInstl;
	}
	public void setAdrsOfInstl(String AdrsOfInstl)
	{
		this.adrsOfInstl=AdrsOfInstl;
	}
	public String getAdrsOfInstl()
	{
		return this.adrsOfInstl;
	}
	public String showDetails()
	{
		return ("\n"+" "+this.getAdrsOfInstl() +" has AC of "+ super.getHorse_power()+","+ super.getZones()+" and "+super.getOutlets())+" ";
	}
}