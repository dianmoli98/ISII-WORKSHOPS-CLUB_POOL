package ec.espol.edu.workshops.second;


public class CarInsurance {
	
	private int age;
	private String sex;
	private String marrial_Status;
	private int license;
	final int premium=500;
	
	public CarInsurance(String sex, int age, String marrial_Status) {
		super();
		this.sex = sex;
		this.age = age;
		this.marrial_Status = marrial_Status;
	}
	
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
	
	public int calculo() {
		int pbase=500;
		if(this.sex.equals("M") && this.marrial_Status.equals("not married") && this.age<25  ) {
			pbase=pbase+1500;
			return pbase;
		}
		else if(this.sex.equals("F") || this.marrial_Status.equals("married") && this.age<25  ) {
			pbase=pbase-200;
			return pbase;
		}
		
		else if(this.age>45 && this.age<65  ) {
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
