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
public class CommissionWorker extends Employee implements Payroll {
    private double basePay, commRate, saleAmount;
    public CommissionWorker(String nameComm, String numComm, double basePay
            ,double commRate, double saleAmount){
        super(nameComm,numComm);
        this.basePay =basePay;
        this.commRate=commRate;
        this.saleAmount=saleAmount;
        
      
       
    }
    
    public void setBasePay(double basePay){
        this.basePay=basePay;
    }
    
    public double getBasePay(){
        return basePay;
    }
    
      public void setCommRate(double commRate){
        this.commRate=commRate;
    }
    
    public double getCommRate(){
        return commRate;
    }
    
      public void setSaleAmount(double saleAmount){
        this.saleAmount=saleAmount;
    }
    
    public double getSaleAmount(){
        return saleAmount;
    }
    
    
    @Override
    public void setPayDetails(double saleAmount){
        this.saleAmount = saleAmount;
        
    }
    
    @Override
    public double calculatePay(){
        return (basePay + commRate*saleAmount);
    }
    
   public String toString(){
        return String.format("CommissionWorker:%s\n",getName());
    }
    
    
}
