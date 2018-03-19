import interface_lab5.IHinh;

public class MatHang {
	interface IMatHang {
		void XemChiTiet();
	}
	abstract class MHang{
		protected String MaHang;
		protected String TenHang;
		protected float DonGia;
		protected int SoLuong;
		public String getMaHang() {
			return MaHang;
		}
		public void setMaHang(String maHang) {
			MaHang = maHang;
		}
		public String getTenHang() {
			return TenHang;
		}
		public void setTenHang(String tenHang) {
			TenHang = tenHang;
		}
		public float getDonGia() {
			return DonGia;
		}
		public void setDonGia(float donGia) {
			DonGia = donGia;
		}
		public int getSoLuong() {
			return SoLuong;
		}
		public void setSoLuong(int soLuong) {
			SoLuong = soLuong;
		}
		
		abstract float ThanhTien();
	}
	class Caphe extends MHang implements IMatHang{
		float ThanhTien() {
			float tien;
			tien=getDonGia()*getSoLuong();
			return tien;
		}
		 private String MauSac;
		 private String DonViTinh;
		 
		 
		 public Caphe() {}
		 public Caphe(String MS,String DVT) {
			 this.MauSac=MS;
			 this.DonViTinh=DVT;
		 }
		public String getMauSac() {
			return MauSac;
		}
		public void setMauSac(String mauSac) {
			MauSac = mauSac;
		}
		public String getDonViTinh() {
			return DonViTinh;
		}
		public void setDonViTinh(String donViTinh) {
			DonViTinh = donViTinh;
		}
		@Override
		public void XemChiTiet() {
			// TODO Auto-generated method stub
			
		}
	}
		
		 
			
			 

}
