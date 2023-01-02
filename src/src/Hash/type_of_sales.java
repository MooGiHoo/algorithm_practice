package Hash;

import java.io.*;
import java.util.*;

public class type_of_sales {
    public static String solution(int k, int[] arr){
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for(int rt = 0; rt<arr.length; rt++) {
            if(rt-lt==k) {
                int count = map.size();
                sb.append(count).append(" ");
                map.put(arr[lt], map.get(arr[lt])-1);
                if(map.get(arr[lt])==0) map.remove(arr[lt]);
                lt++;
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
            }
            else {
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
            }
        }
        int count = map.size();
        sb.append(count);
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(k, arr));
    }
}


