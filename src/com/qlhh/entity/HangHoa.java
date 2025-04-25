<<<<<<< HEAD

=======
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
package com.qlhh.entity;

import java.io.Serializable;

public abstract class HangHoa implements Serializable{
	private int maHang;
	private String tenHang;
	private int soLuong;
	private double donGia;
	
<<<<<<< HEAD
	public String gettenHang() {
		return this.tenHang;
	}
	
=======
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
	public int getmaHang() {
		return this.maHang;
	}
	
<<<<<<< HEAD
=======
	public String gettenHang() {
		return this.tenHang;
	}
	
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
	public int getsoLuong() {
		return this.soLuong;
	}
	
	public double getdonGia() {
		return this.donGia;
	}
	
	protected HangHoa() {
		
	}

<<<<<<< HEAD
	protected HangHoa(String tenHang, int maHang, int soLuong, double donGia) {
=======
	public HangHoa(int maHang, String tenHang, int soLuong, double donGia) {
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	
	
	public abstract double tinhVAT();
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
