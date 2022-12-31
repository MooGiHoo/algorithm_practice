package two_pointers;

import java.io.*;
import java.util.*;

public class merge_two_arrays {
    public static String solution(int[] arr1, int[] arr2){
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[arr1.length + arr2.length];
        int lt = 0, rt = 0;
        int index = 0;
        while(lt<arr1.length&&rt<arr2.length) {
            if(arr1[lt]>arr2[rt]) {
                arr[index] = arr2[rt];
                rt++;
                index++;
            }
            else {
                arr[index] = arr1[lt];
                lt++;
                index++;
            }
        }
        if(lt<arr1.length) {
            while(lt<arr1.length) {
                arr[index] = arr1[lt];
                lt++;
                index++;
            }
        }
        else {
            while(rt<arr2.length) {
                arr[index] = arr2[rt];
                rt++;
                index++;
            }
        }
        for(int x : arr) {
            sb.append(x).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr1, arr2));
    }
}

