package com.biz.arrays;

public class ScoreArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNumbers = 20;
		int[] intKor = new int[intNumbers];
		for(int i =0; i<intNumbers; i++) {
			intKor[i] = makeScore();
			intKor[i] = ConstMethod.makeScore();
			// System.out.println(intKor[i]);
		}
		for(int i =0; i <intNumbers; i++) {
			System.out.printf("%d 번 학생 국어점수 : %d\n", (i+1), intKor[i]);
		}
		System.out.println("======================");
		
		int intSum = 0;  // 꼭 '0'으로 초기화를 해줘야 한다!!!!
		for(int i = 0; i <intNumbers; i++) {
			intSum += intKor[i];
			
		}
		System.out.print("총점:");
		System.out.println(intSum);
		
		System.out.print("평균:");
		System.out.println(intSum/intNumbers);
		System.out.println("------------------------");
		
	}
	
	public static int makeScore() {
		return (int)(Math.random()*(100-50+1))+50;
	}
}
