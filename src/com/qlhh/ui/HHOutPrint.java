package com.qlhh.ui;

import java.io.PrintWriter;

import java.util.ArrayList;


import com.qlhh.database.MemoryHHDB;
<<<<<<< HEAD
import com.qlhh.entity.HangHoa;

=======

import com.qlhh.entity.HangHoa;


>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
public class HHOutPrint {
	
	private PrintWriter out;
	
	public HHOutPrint(PrintWriter out) {
		this.out  = out;
	}
	
	public void showDSHH(ArrayList<HangHoa> dsHH) {
<<<<<<< HEAD
	    out.printf("%-10s %-20s %-10s %-10s\n","Mã Hàng", "Tên Hàng", "Số Lượng", "Đơn Giá");
	    out.flush();
	    for (HangHoa hangHoa : dsHH) {
	        out.printf("%-10d %-20s %-10d %-10.2f\n",
	                hangHoa.getmaHang(),
	                hangHoa.gettenHang(),
	                hangHoa.getsoLuong(),
	                hangHoa.getdonGia());
	        out.flush();
	    }
	}
	
	
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		HHOutPrint svOutPrint = new HHOutPrint(out);
		svOutPrint.showDSHH(MemoryHHDB.getDSHH());
=======
		out.printf("%-10s %-20s %-10s %-10s\n","Tên Hàng",
				"Mã Hàng", "Số Lượng" , "Đơn Giá");
		out.flush();
		for (HangHoa hangHoa : dsHH) {
			out.printf("%-10d %-20s %-10s %-10s\n",
					hangHoa.gettenHang(),
					hangHoa.getmaHang(), 
					hangHoa.getsoLuong(),
					hangHoa.getdonGia()
					); //java.util.Date
			out.flush();
		}
	}
	

	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		HHOutPrint hhOutPrint = new HHOutPrint(out);
		hhOutPrint.showDSHH(MemoryHHDB.getDSHH());
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
	}

}
