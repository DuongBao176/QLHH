<<<<<<< HEAD

=======
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
package com.qlhh.entity;

public class HangDienMay extends HangHoa{
	private int thoiGianBH;
	private int congSuat;
<<<<<<< HEAD
=======
	private HangHoa hangHoa;
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
	public HangDienMay() {
		
	}

	public HangDienMay(int maHang, String tenHang, int soLuong, double donGia, int thoiGianBH, int congSuat) {
<<<<<<< HEAD
		super(tenHang, maHang, soLuong, donGia);
=======
		super(maHang, tenHang, soLuong, donGia);
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}
	
	@Override
	public double tinhVAT() {
<<<<<<< HEAD
		return getdonGia()*0.1;
	
	}
}
=======
		double VAT = 0;
		VAT = hangHoa.getdonGia()*0.1;
		return VAT;
	
	}
}
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
