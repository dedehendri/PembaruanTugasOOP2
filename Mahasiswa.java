/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author Dede Hendri
 */
public class Mahasiswa {
	public String nama="Rendy";
	
	public void kuliah () {
		System.out.println ("kuliah");
		}
		
		public static void main	(String[] args){
			Mahasiswa rendy= new Mahasiswa();
			
			System.out.println(rendy.nama);
			rendy.kuliah();
			
		}}