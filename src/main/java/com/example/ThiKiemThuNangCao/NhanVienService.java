package com.example.ThiKiemThuNangCao;

public class NhanVienService {
    public String SuaNhanVien(NhanVien nv,NhanVienRequest request){

        System.out.println("Nhân viên cũ là "+nv);
        if(request.getTenNV().isEmpty()||request.getTenNV()==null){
            throw new IllegalArgumentException("Tên không được trống");
        }else if(request.getTuoi()<=0||request.getTuoi()>120||String.valueOf(request.getTuoi())==null){
            throw new IllegalArgumentException("Tuổi không hợp lệ");
        }else if(request.getLuong()<0f||String.valueOf(request.getLuong())==null) {
            throw new IllegalArgumentException("Lương không hợp lệ");
        } else if(request.getSoNamLamViec()<0||String.valueOf(request.getSoNamLamViec())==null) {
            throw new IllegalArgumentException("Số năm làm việc không hợp lệ");
        }else if(request.getPhongBan().isEmpty()||request.getPhongBan()==null) {
            throw new IllegalArgumentException("Phòng ban không hợp lệ");
        }

        nv.setTenNV(request.getTenNV());
        nv.setTuoi(request.getTuoi());
        nv.setLuong(request.getLuong());
        nv.setSoNamLamViec(request.getSoNamLamViec());
        nv.setPhongBan(request.getPhongBan());
        System.out.println("Nhân viên mưới là" +nv);
        return "Cập nhật thành công";
    }
}
