/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author s0455688
 */
public class OOAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*instantiate all the subclasses, use toString() output the object and calculate the monthly payment of the employees */
       Manager mg = new Manager("Tom", "0000001", 6000.0);
       CommissionWorker cw = new CommissionWorker("Sam","0000002",2000,0.5,6000);
       HourlyWorker hw=new HourlyWorker("Kim","0000003",30,50);
       PieceWorker pworker= new PieceWorker("Tad","0000004",200,20);
       mg.setName("Tommy");
       System.out.print(mg);
       System.out.print(cw);
       System.out.print(hw);
       System.out.print(pworker);
       System.out.printf("%s is monthly paid with:",mg.getName());
       System.out.printf("%.2f\n", mg.calculatePay());
       System.out.printf("%s is monthly paid with:",cw.getName());
       System.out.printf("%.2f\n",cw.calculatePay());
       System.out.printf("%s is monthly paid with:",hw.getName());
       System.out.printf("%.2f\n",hw.calculatePay());
       System.out.printf("%s is monthly paid with:",pworker.getName());
       System.out.printf("%.2f\n",pworker.calculatePay());
       
       /*user input all fields that all type of employees need to present their payment information*/
       Scanner sc= new Scanner(System.in);
       System.out.println("the name of the manager is: ");
       String nameM=sc.nextLine();
       System.out.println("the ID of the manager is: ");
       String IDNumberM=sc.nextLine();
       System.out.println("the manger's salary is: ");
       double amountM = sc.nextDouble();
       Manager one=new Manager(nameM,IDNumberM,amountM);
       double payment1=one.calculatePay();
       
       
       System.out.println("the name of the commission worker is: ");
       sc.nextLine(); //consume "\n"
       String nameComm=sc.nextLine();
       System.out.println("the ID of the commission worker is: ");
       String IDNumberComm=sc.nextLine();
       System.out.println("the commission worker's base pay is: ");
       double baseComm=sc.nextDouble();
       System.out.println("the commission worker's commission rate is: ");
       double rateComm=sc.nextDouble();
       System.out.println("the commission worker's sale is: ");
       double saleComm=sc.nextDouble();
       CommissionWorker two=new CommissionWorker(nameComm, IDNumberComm, baseComm, rateComm, saleComm);
       double payment2=two.calculatePay();
       
       System.out.println("the name of the hourly worker is: ");
       sc.nextLine();  //consume "\n"
       String nameHWorker=sc.nextLine();
       System.out.println("the ID of the hourly worker is: ");
       String IDNumberHWorker=sc.nextLine();
       System.out.println("the worker's hourly pay is: ");
       double hourPay=sc.nextDouble();
       System.out.println("the worker's working hours are: ");
       double hours=sc.nextDouble();
       HourlyWorker three = new HourlyWorker(nameHWorker, IDNumberHWorker, hourPay, hours);
       double payment3=three.calculatePay();
       
       System.out.println("the name of the piece worker is: ");
       sc.nextLine();     //consume "\n"
       String namePWorker=sc.nextLine();
       System.out.println("the ID of the piece worker is: ");
       String IDNumberPWorker=sc.nextLine();
       System.out.println("the piece pay of the piece worker is: ");
       double piecePay=sc.nextDouble();
       System.out.println("the pieces of the piece worker are: ");
       double pieces=sc.nextDouble();
       PieceWorker four= new PieceWorker(namePWorker, IDNumberPWorker, piecePay,pieces );
       double payment4=four.calculatePay();
       
       /*output the employees' payment information to the file */
       PrintWriter pw=null; // write sth in a file (deletes the lines if exist)
       File myfile=new File("payroll.txt");
       try{
       FileWriter fw=new FileWriter(myfile);
       pw=new PrintWriter(fw);
       pw.printf("Manager:%s, ID:%s, Salary:%.2f\n\n",one.getName(),one.getIDNumber(),payment1);
       pw.printf("Commission worker:%s, ID:%s, basepay:%.2f, commission rate:%.2f, commission sale:%.2f, Payment:%.2f\n\n", two.getName(),two.getIDNumber()
              ,two.getBasePay(),two.getCommRate(),two.getSaleAmount(),payment2);
       pw.printf("Hourly worker:%s, ID:%s, hourly pay:%.2f, working hours:%.1f Payment:%.2f,\n\n", three.getName(),three.getIDNumber(),three.getHourPay(), three.getHours(),payment3);
       pw.printf("Piece worker:%s, ID:%s, piece price:%.2f, pieces:%f, Payment:%.2f\n\n", four.getName(),four.getIDNumber(),four.getPiecesPay(),four.getPieces(),payment4);
      
      
    } catch(IOException ex){
        System.out.println("there is error");
        
    } 
    pw.close();  
}
}
