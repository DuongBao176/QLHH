<<<<<<< HEAD

=======
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
package com.qlhh.entity;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private int ngayNhapKho;
<<<<<<< HEAD
=======
	private HangHoa hangHoa;
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
	public HangSanhSu() {
		
	}

	public HangSanhSu(int maHang, String tenHang, int soLuong, double donGia, String nhaSanXuat, int ngayNhapKho) {
<<<<<<< HEAD
		super(tenHang, maHang, soLuong, donGia);
=======
		super(maHang, tenHang, soLuong, donGia);
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
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
