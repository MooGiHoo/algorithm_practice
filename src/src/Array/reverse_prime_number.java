package Array;

import java.io.*;
import java.util.*;

public class reverse_prime_number {
    public static boolean isPrime(int n) {
        boolean flag = true;
        if(n==1) return false;
        for(int i=2; i<n; i++) {
            if(n%i==0) return false;
        }
        return flag;
    }
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            int target = arr[i];
            int num = 0;
            while(target>0) {
                int temp = target%10;
                num = num*10 + temp;
                target /= 10;
            }
            arr[i] = num;
            if(isPrime(arr[i])) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();
    }
    //4301 200
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, arr));
    }
}


