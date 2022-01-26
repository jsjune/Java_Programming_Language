package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2587 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int[5];
		int sum=0;
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=Integer.parseInt(br.readLine());
			sum+=numbers[i];
		}
		Arrays.sort(numbers);
		System.out.println(sum/5);
		System.out.println(numbers[2]);
	}
}
