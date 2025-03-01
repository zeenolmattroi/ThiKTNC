package com.example.ThiKiemThuNangCao;

public class TinhTong {
    public static void main(String[] args) {
        TinhTong tinhTong = new TinhTong();
        int sum =tinhTong.tinhTong();
        System.out.println(sum);
    }

    public int tinhTong(){
        int sum = 0;
        for(int i = 2;i<=5;i++){
            if(i%2==0 && i%8!=0){
                sum+=i;
            }
        }
        return sum;
    }

}
