<<<<<<< HEAD

=======
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
package com.qlhh.entity;

public class HangThucPham extends HangHoa{
	private int ngaySanXuat;
	private int ngayHetHan;
	private String nhaCungCap;
<<<<<<< HEAD
=======
	private HangHoa hangHoa;
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
	public HangThucPham() {
		
	}

	public HangThucPham(int maHang, String tenHang, int soLuong, double donGia, int ngaySanXuat, int ngayHetHan, String nhaCungCap) {
<<<<<<< HEAD
		super(tenHang, maHang, soLuong, donGia);
=======
		super(maHang, tenHang, soLuong, donGia);
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}
	
	@Override
	public double tinhVAT() {
<<<<<<< HEAD
		return getdonGia()*0.05;
	}
}
=======
		double VAT = 0;
		VAT = hangHoa.getdonGia()*0.05;
		return VAT;
	}
}
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
