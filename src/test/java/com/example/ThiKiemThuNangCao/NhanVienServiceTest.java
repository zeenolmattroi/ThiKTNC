package com.example.ThiKiemThuNangCao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    NhanVienService nhanVienService= new NhanVienService();


    NhanVien nv1 = new NhanVien("nv1","Nguyễn Văn Hoàn",20,30f,3,"It");



    NhanVienRequest request1 = new NhanVienRequest("Nguyễn ",23,30f,3,"It");
    NhanVienRequest request2 = new NhanVienRequest("Nguyễn ",1,30f,3,"Itttttttttttttttttttttttttt");
    NhanVienRequest request3 = new NhanVienRequest("Nguyễn ",2,Float.MAX_VALUE,3,"It");
    NhanVienRequest request4 = new NhanVienRequest("Nguyễn ",23,30f,3,"It");
    NhanVienRequest request5 = new NhanVienRequest("Nguyễn ",5,5f,5,"It");
    NhanVienRequest request6 = new NhanVienRequest("",5,5f,5,"It");



    @Test
    public void test1(){
        assertEquals("Cập nhật thành công",nhanVienService.SuaNhanVien(nv1,request1));
    }
    @Test
    public void test2(){
        assertEquals("Cập nhật thành công",nhanVienService.SuaNhanVien(nv1,request2));
    }
    @Test
    public void test3(){
        assertEquals("Cập nhật thành công",nhanVienService.SuaNhanVien(nv1,request3));
    }
    @Test
    public void test4(){
        assertEquals("Cập nhật thành công",nhanVienService.SuaNhanVien(nv1,request4));
    }
    @Test
    public void test5(){
        assertEquals("Cập nhật thành công",nhanVienService.SuaNhanVien(nv1,request5));
    }

    @Test
    public void test6(){
        assertThrows(IllegalArgumentException.class,()->{nhanVienService.SuaNhanVien(nv1,request6);});
    }



}