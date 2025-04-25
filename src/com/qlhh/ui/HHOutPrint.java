package com.qlhh.ui;

import java.io.PrintWriter;

import java.util.ArrayList;


import com.qlhh.database.MemoryHHDB;
import com.qlhh.entity.HangHoa;

public class HHOutPrint {
	
	private PrintWriter out;
	
	public HHOutPrint(PrintWriter out) {
		this.out  = out;
	}
	
	public void showDSHH(ArrayList<HangHoa> dsHH) {
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
	}

}
