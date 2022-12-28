package Array;

import java.io.*;
import java.util.*;

public class fibonacci_numbers {
    public static String solution(int n){
        String answer = "";
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i=1; i<=n; i++) answer += arr[i] + " ";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
}
