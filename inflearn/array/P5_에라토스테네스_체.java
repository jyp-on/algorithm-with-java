package org.example.inflearn.array;

import java.util.Scanner;

public class P5_에라토스테네스_체 {

    // 에라토스테네스 체 : 소수 구하는 가장 빠른 법
    // n개의 배열을 초기화하고 2부터 n까지 각각의 배수를 1로 채우면 0으로 남는것들이 소수
    public static int solution(int n) {
        int answer = 0;
        int[] s = new int[n+1];
        s[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (s[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j+i) s[j] = 1; // i의 배수도 소수가 아니므로 1로 채움
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
