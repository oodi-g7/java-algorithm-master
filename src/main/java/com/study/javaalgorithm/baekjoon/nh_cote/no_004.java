package com.study.javaalgorithm.baekjoon.nh_cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_004 {
    public static void main(String[] args) throws IOException {
        // 구간합 공식 => S[i] = S[i-1] + S[i]
        // i ~ j까지 부분합 공식 => S[j] - S[i-i]

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] t = new int[n+1][n+1];
        int[][] S = new int[n+1][n+1];
        for(int i=1; i<n+1; i++){

        }


    }
}
