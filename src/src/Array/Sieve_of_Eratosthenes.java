package Array;

import java.io.*;
import java.util.*;

public class Sieve_of_Eratosthenes {
    public static int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++) {
            arr[i] = i;
        }
        for(int i=2; i<=n; i++) {
            if(arr[i]==i){
                answer++;
                for(int j=i; j<=n; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
}


