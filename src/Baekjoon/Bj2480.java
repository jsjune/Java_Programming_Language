package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2480 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if(a==b&&b==c) {
			System.out.println(10000+a*1000);
		}
		else if(a==b||a==c){
			System.out.println(1000+a*100);
		}
		else if(b==c) {
			System.out.println(1000+b*100);
		}
		else {
			if(a>b && a>c) {
				System.out.println(a*100);
			}
			else if (b>a && b>c) {
				System.out.println(b*100);
			}
			else {
				System.out.println(c*100);
			}
		}
	}
}
