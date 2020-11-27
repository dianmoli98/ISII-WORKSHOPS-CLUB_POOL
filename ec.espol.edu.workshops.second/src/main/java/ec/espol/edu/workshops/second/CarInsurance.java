package ec.espol.edu.workshops.second;


public class CarInsurance {
	private int age;  
	private String marrial_Status, sex;  
	private boolean license = false ;
	final int premium=500;
	private double d;
	public CarInsurance(String sex , double d , String marrial_Status , boolean license) {
		super();
		this.sex = sex;
		this.d = d;
		this.marrial_Status = limpiarEspacio(marrial_Status.toLowerCase());
		this.license = license ;
	}
	
	public CarInsurance(String sex , int age , String marrial_Status , boolean license) {
		super();
		this.sex = sex;
		this.age = age;
		this.marrial_Status = limpiarEspacio(marrial_Status.toLowerCase());
		this.license = license ;
	}
	
public String getSex(){
  return sex;}
	
	public String getMarrial_Status(){
            return marrial_Status;
    }
	
	public int getAge()
    {
            return age;
    }
	
	public void getLicense(boolean license) {
		this.license = license ;
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
	
	public void setLicense(boolean license) {
		this.license = license ;
	}
	
	public String limpiarEspacio(String palabra) {
		String estado_casado = palabra.replaceAll("\\s+", "");
		return estado_casado;

	}
	
	public  int ingresoInt(int x) { 
		
	        return x;
	    }
	public int calculo() {
		int pbase = 500;
		int e= ingresoInt(this.age);
	
		if(e==0) {
			return -1;
		}
		
		if(!(this.sex.equals("F"))&&(!this.sex.equals("M"))) {
			return -1;
		}
		if(!(this.marrial_Status.equals("married"))  && !(this.marrial_Status.equals("notmarried"))) {
			return -1;
		}
		
		if((this.age > 80) || !license) {
			
			return -1 ;
		}
		if(this.age < 18) {
			
			return -1 ;
		}
		if(this.sex.equals("M") && this.marrial_Status.equals("notmarried") && this.age < 25  ) {
			pbase=pbase + 1500;
			//System.out.println("condicion 1");
		}
		if(this.sex.equals("F") || this.marrial_Status.equals("married") ) {
			pbase=pbase-200;
			//System.out.println("condicion 2");
		}
		
		if(this.age >= 45 && this.age < 65  ) {
			pbase=pbase-100;
			//System.out.println("condicion 3");
			
		}
		
		return pbase;
		}
	
	
	
	
	
	
}
