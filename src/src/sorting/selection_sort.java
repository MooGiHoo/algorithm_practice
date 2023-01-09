package sorting;

import java.io.*;
import java.util.*;

public class selection_sort {
    public static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n-1; i++){
            int index = i;
            for(int j=i+1; j<n; j++) {
                if(arr[index]>arr[j]) index = j;
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            sb.append(arr[i]).append(" ");
        }
        sb.append(arr[n-1]);
        return sb.toString();
    }
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
