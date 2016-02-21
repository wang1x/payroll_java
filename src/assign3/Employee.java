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
public  class Employee {
    private String name;
    private String IDNumber;
    Employee(String name, String IDNumber){
        this.name = name;
        this.IDNumber = IDNumber;
        
    }   
   
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    } 
    
    public void setIDNumber(String IDNumber){
        this.IDNumber =IDNumber;
    }
   
    public String getIDNumber(){
    return IDNumber;
    }
    
    @Override
    public String toString(){
        return String.format("Employee:%s",getName());
    }
    
}
