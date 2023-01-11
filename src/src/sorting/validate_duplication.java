package sorting;

import java.io.*;
import java.util.*;

public class validate_duplication {
    public static Character solution(int n, int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key)>=2) return 'D';
        }
        return 'U';
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

