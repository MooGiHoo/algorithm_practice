package Array;

import java.io.*;
import java.util.*;

public class print_large_number {
    public static String solution(int n, int[] arr){
        String answer = "";
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int rt = 1;
        while(rt<n) {
            if(arr[rt-1]<arr[rt]) list.add(arr[rt]);
            rt++;
        }
        for(int x : list) answer += x + " ";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n ,arr));
    }
}

