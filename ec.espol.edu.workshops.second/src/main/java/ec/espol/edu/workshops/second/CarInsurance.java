package ec.espol.edu.workshops.second;

public class CarInsurance {
  private int age;
  private String sex;
  private String marrialstatus;
  private int license;
  final int premium = 500;

  public String getSex() {
    return sex;
  }
  
  public String getMarrial_Status() {
    return marrialstatus;
  }
  
  public int getAge() {
    return age;
  }
  
  public int getLicense() {
    return license;
  }
  
  public void setSex(String sex) {
    this.sex = sex;
  }
  
  public void setMarrial_Status(String marrialstatus) {
    this.marrialstatus = marrialstatus;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public void setLicense(int license) {
    this.license = license;
  }
  
  
  /**
   * Saca el calculo.
   * @param age edad
   * @param sex el sexo
   * @param marrialstatus el estado 
   * @return int un numero
   */
  public int calculo(int age, String sex, String marrialstatus) {
    int pbase = 500;
    if (sex.equals("M") && marrialstatus.equals("not married") && age < 25) {
      pbase = pbase + 1500;
      return pbase;
    } else if (sex.equals("F") || marrialstatus.equals("married") && age < 25) {
      pbase = pbase - 200;
      return pbase;
    } else if (age > 45 && age < 65) {
      pbase = pbase - 100;
      return pbase;
    } else if (age > 80) {
      return -1;
    } else {
      return -1;
    }
  }
}
