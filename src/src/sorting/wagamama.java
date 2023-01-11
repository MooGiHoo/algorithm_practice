package sorting;

import java.io.*;
import java.util.*;

public class wagamama {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        int[] narr = arr.clone();
        Arrays.sort(narr);
        for(int i=0; i<n; i++) {
            if(arr[i]!=narr[i]) sb.append(i+1).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, arr));
    }
}

