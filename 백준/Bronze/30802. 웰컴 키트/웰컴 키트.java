import java.io.*;
import java.util.*;

// 웰컴키트
public class Main {

	public static void main(String[] args) throws IOException {
		// 참가자 수 N
		// 사이즈 별 신청자 수 S, M, L, XL, XXL, XXXL
		// 정수 티셔츠, 펜의 묶음 수 T, P
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int S, M, L, XL, XXL, XXXL, T, P;
		StringTokenizer st = new StringTokenizer(br.readLine());
		S = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		XL = Integer.parseInt(st.nextToken());
		XXL = Integer.parseInt(st.nextToken());
		XXXL = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		
		int tShirtSum = 0, penSum = 0, pens = 0;
		if(S != 0) {
			if(S % T == 0) {
				tShirtSum += S / T;
			} else
			tShirtSum += S / T + 1;
		}
		
		if(M != 0) {
			if(M % T == 0) {
				tShirtSum += M / T;
			} else
			tShirtSum += M / T + 1;
		}
		
		if(L != 0) {
			if(L % T == 0) {
				tShirtSum += L / T;
			} else
			tShirtSum += L / T + 1;
		}
		
		if(XL != 0) {
			if(XL % T == 0) {
				tShirtSum += XL / T;
			} else
			tShirtSum += XL / T + 1;
		}
		
		if(XXL != 0) {
			if(XXL % T == 0) {
				tShirtSum += XXL / T;
			} else
			tShirtSum += XXL / T + 1;
		}
		
		if(XXXL != 0) {
			if(XXXL % T == 0) {
				tShirtSum += XXXL / T;
			} else
			tShirtSum += XXXL / T + 1;
		}
		
		penSum = N/P;
		pens = N%P;
		
		System.out.println(tShirtSum);
		System.out.println(penSum + " " + pens);
		
	}
}