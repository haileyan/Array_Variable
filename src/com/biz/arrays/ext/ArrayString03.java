package com.biz.arrays.ext;

public class ArrayString03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrG = {
				"001:홍길동:90:88:70:60:60",
				"002:이몽룡:75:89:80:85:90",
				"003:성춘향:90:88:88:93:95",
				"004:장보고:76:84:100:90:95",
				"005:임꺽정:90:100:87:90:98",
		};
		for(int i = 0; i<arrG.length; i++) {
			String[] arrS = arrG[i].split(":");
			
			System.out.print(arrS[0] + "\t");
			System.out.print(arrS[1] + "\t");
			System.out.print(arrS[2] + "\t");
			System.out.print(arrS[3] + "\t");
			System.out.print(arrS[4] + "\t");
			System.out.print(arrS[5] + "\t");
			System.out.print(arrS[6] + "\t");
		
			int intSum = 0;
			for(int j = 2; j<6; j++) {
				intSum += Integer.valueOf(arrS[j]);
			}
			System.out.print(intSum + "\t");
			
			float floatAvg = (float)intSum / 4;
			
			System.out.print("평균: ");
			System.out.println(floatAvg);
			System.out.println("------------------------------------------------------------");
			
			
			
		}
	}

}
