
package com.qlhh.entity;

import java.io.Serializable;

public abstract class HangHoa implements Serializable{
	private int maHang;
	private String tenHang;
	private int soLuong;
	private double donGia;
	
	public String gettenHang() {
		return this.tenHang;
	}
	
	public int getmaHang() {
		return this.maHang;
	}
	
	public int getsoLuong() {
		return this.soLuong;
	}
	
	public double getdonGia() {
		return this.donGia;
	}
	
	protected HangHoa() {
		
	}

	protected HangHoa(String tenHang, int maHang, int soLuong, double donGia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	
	
	public abstract double tinhVAT();
	
	
}
