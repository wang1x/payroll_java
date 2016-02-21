/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

/**
 *
 * @author hang
 */
public  class HourlyWorker extends Employee implements Payroll{
    private double hours, hourPay;
    
    public HourlyWorker(String nameH, String numberH, double hourPay, double hours ){
        super(nameH,numberH);
        this.hours=hours;
        this.hourPay = hourPay;
    }
    
    public void setHourPay(double hourPay){
        this.hourPay = hourPay;
    }
    
    public double getHourPay(){
        return hourPay;
    }
    
      public void setHour(double hours){
        this.hours = hours;
    }
    
    public double getHours(){
        return hours;
    }
    
    @Override
    public void setPayDetails(double hours){
        this.hours = hours;
}
    
    @Override
    /*calculate monthly payment of hourly worker. It the worker works over 40 hours, the extra hours will get one and half payment*/ 
    public double calculatePay(){
        if (hours<=40)
            return hours*hourPay;
        else
            return 40*hourPay + (hours-40)*hourPay*1.5;
       
    }
    
    public String toString(){
        return String.format("HourlyWorker:%s\n",getName());
    }
    
}