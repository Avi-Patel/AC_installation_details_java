public class ACdetails
{
	private double  horse_power = 5.0;
    private int zones = 2;
    private int outlets = 2;
    
    public ACdetails() 
    {
    	this.horse_power=5.0;
    	this.zones=2;
    	this.outlets=2;
    }
    public ACdetails(double hp, int zones, int outlets) 
    {
    	this.horse_power=hp;
    	this.zones=zones;
    	this.outlets=outlets;
    }
    public void setHorse_power(double Horse_power)
    {
    	this.horse_power=Horse_power;
    }
    public void setZones(int Zones)
    {
    	this.zones=Zones;
    }
    public void setOutlets(int Outlets)
    {
    	this.outlets=Outlets;
    }
    public double getHorse_power()
    {
    	return this.horse_power;
    }
    public int getZones()
    {
    	return this.zones;
    }
    public int getOutlets()
    {
    	return this.outlets;
    }
    @Override
    public String toString()
    {
    	return "";
    }
}