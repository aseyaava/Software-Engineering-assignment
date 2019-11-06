public class bike extends uber
{
	private String bikenum;
	public bike(String name,String passwrd)
	{
	  super(name,passwrd);
	  this.bikenum=bikenum;
    }
    public String getbikenum()
    {
	return bikenum;
    }
    public void setbikenum(String bikenum)
    {
	   this.bikenum=bikenum;
    }
}