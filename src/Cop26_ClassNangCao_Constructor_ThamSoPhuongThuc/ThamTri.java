/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cop26_ClassNangCao_Constructor_ThamSoPhuongThuc;

/**
 *
 * @author CỌP
 */
public class ThamTri {
	private static int number;	
	public void showNumber(){
		System.out.println(number);
	}	
	public void tinhNumber(int number){
		number = number+5;                
	}	
	public static void main(String[] args) {
		ThamTri ts1 = new ThamTri();
		ts1.number  = 3;// nhập vào bằng 3
		ts1.tinhNumber(number);//tính
		ts1.showNumber();//kq: 3
	}
}