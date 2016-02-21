/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

/**
 *
 * @author s0455688
 */
public  class Manager extends Employee implements Payroll {
    private double salary;
   
    public Manager(String nameM, String numberM, double salary){
      super(nameM, numberM); 
      this.salary = salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    
    
   @Override
    public double calculatePay(){
        
       return salary; 
   }
    @Override     
    /*force Manager class to define the setPayDetails()method in payroll interface.
     if it is not be defined, the manager will be an abstract class, which can not be instantiated.
	 even the function body is empty.
    */
    public void setPayDetails(double amount){
        
    }
    
    public String toString(){
        return String.format("Manager:%s\n",getName());
    }
    
    
}
