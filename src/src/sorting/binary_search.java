package sorting;

import java.io.*;
import java.util.*;

public class binary_search {
    public static int solution(int m, int[] arr){
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length-1;
        int mid = (lt+rt)/2;
        while(true) {
            if(arr[mid] == m) return mid+1;
            else if (arr[mid]>m) {
                rt = mid;
                mid = (lt+rt)/2;
            }
            else {
                lt = mid;
                mid = (lt+rt)/2;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(m, arr));
    }
}



