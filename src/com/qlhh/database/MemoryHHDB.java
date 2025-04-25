<<<<<<< HEAD

=======
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
package com.qlhh.database;

import java.util.ArrayList;

<<<<<<< HEAD
import com.qlhh.entity.HangDienMay;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangThucPham;
=======
import com.qlhh.entity.HangHoa;
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b

public class MemoryHHDB {
	private static ArrayList<HangHoa> dbHH;
	
	static {
 		dbHH = new ArrayList<HangHoa>();
 		//tạo dữ liệu sẵn có cho DB
<<<<<<< HEAD
 		HangDienMay hDM = new HangDienMay(0, "a", 0, 0, 0, 0);
 				
 		HangSanhSu hSS = new  HangSanhSu(0, "a", 0, 0, null, 0);
 				
 		HangThucPham hTP = new HangThucPham(0, "a", 0, 0, 0, 0, null);
 				
 		
 		dbHH.add(hDM);
 		dbHH.add(hSS);
 		dbHH.add(hTP);
 		
=======
// 		SinhVienPM svPM1 = new SinhVienPM(111, "Le Van Teo", 
// 				"PM", null, 4, 4, 4);
// 		SinhVienPM svPM2 = new SinhVienPM(222, "Le Van Tu", 
// 				"PM", null, 9, 9, 1);
// 		SinhVienKT svKT1 = new SinhVienKT(333, "Nguyen Thi Meo", 
// 				"KT", null, 7, 8);
// 		SinhVienKT svKT2 = new SinhVienKT(444, "Nguyen Thi Suu", 
// 				"KT", null, 2, 2);
// 		dbSV.add(svPM1);
// 		dbSV.add(svPM2);
// 		dbSV.add(svKT1);
// 		dbSV.add(svKT2);
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
 
 
 	}
	
	public static void insert(HangHoa hh) {
		dbHH.add(hh);
	}
	
	public static ArrayList<HangHoa> getDSHH(){
		return dbHH;
	}
	
	
 	
 	
 
<<<<<<< HEAD
}
=======
}
>>>>>>> c23dab3a227b6dc96c5cd7c0c12fa3547c4a116b
