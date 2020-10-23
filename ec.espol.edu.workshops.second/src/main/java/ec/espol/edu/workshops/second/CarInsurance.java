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
	
	public int calculo(int age, String sex, String marrial_Status) {
		int pbase=500;
		if(sex.equals("M") && marrial_Status.equals("not married") && age<25  ) {
			pbase=pbase+1500;
			return pbase;
		}
		else if(sex.equals("F") || marrial_Status.equals("married") && age<25  ) {
			pbase=pbase-200;
			return pbase;
		}
		
		else if(age>45 && age<65  ) {
			pbase=pbase-100;
			return pbase;
		}
		else if (age>80) {
			return -1;
		}
		else
			return -1;
		
	}
	
	
	
}
