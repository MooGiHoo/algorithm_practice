package two_pointers;

import java.io.*;
import java.util.*;

public class find_common_elements {
    public static String solution(int[] arr1, int[] arr2){
        StringBuilder sb = new StringBuilder();
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0;
        int p2 = 0;
        while (p1<n&& p2<n) {
            if(arr1[p1] == arr2[p2]) {
                sb.append(arr1[p1]).append(" ");
                p1++;
                p2++;
            }
            else if(arr1[p1]>arr2[p2]) {
                p2++;
            }
            else {
                p1++;
            }
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

