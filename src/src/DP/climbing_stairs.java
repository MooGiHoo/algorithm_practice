package DP;

import java.io.*;
import java.util.*;

public class climbing_stairs {
    static int[] dy;
    public static int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dy = new int[n+1];
        System.out.println(solution(n));
    }
}




/*
DP란 Bottom-Up 방식, 목표까지의 길을 쪼개어서 상향식으로 답을 구한다.
초반의 값은 직접 구한 상태에서 그 다음 값들을 유도한다.
 */







