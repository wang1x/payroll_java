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
public class PieceWorker extends Employee implements Payroll{
    private double piecesPay;
    private double pieces;
    public PieceWorker(String namePiece, String numPiece, double piecesPay, double pieces ){
        super(namePiece, numPiece);
        this.piecesPay = piecesPay;
        this.pieces = pieces;
    }
    
    public void setPiecesPay(double piecesPay){
        this.piecesPay=piecesPay;
    }
    
    public double getPiecesPay(){
        return piecesPay;
    }
    
     public void setPieces(double pieces){
        this.pieces=pieces;
    }
    
    public double getPieces(){
        return pieces;
    }
    
    @Override
    public void setPayDetails(double pieces){
        this.pieces=pieces;
    }
    
    @Override
    public double calculatePay(){
        return pieces*piecesPay; 
    }
    
    public String toString(){
        return String.format("PieceWorker:%s\n",getName());
    }
    
}
