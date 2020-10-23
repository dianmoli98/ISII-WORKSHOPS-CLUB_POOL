package ec.espol.edu.workshops.second;

public class CarInsurance {
	
	private int age;
	private String sex;
	private String marrial_Status;
	private int license;
	final int premium=500;
	
	
	public String getSex()
    {
            return sex;
    }
	
	public String getMarrial_Status()
    {
            return marrial_Status;
    }
	
	public int getAge()
    {
            return age;
    }
	
	public int getLicense()
    {
            return license;
    }
	
	public void setSex(String sex)
    {
      this.sex=sex;
    }
	
	public void setMarrial_Status(String marrial_Status)
    {
      this.marrial_Status=marrial_Status;
    }
	
	public void setAge(int age)
    {
      this.age = age;
    }
	
	public void setLicense(int license)
    {
      this.license = license;
    }
	
	
	
	
}
