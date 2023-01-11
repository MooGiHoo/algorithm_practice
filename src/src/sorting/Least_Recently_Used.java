package sorting;

import java.io.*;
import java.util.*;

public class Least_Recently_Used {
    public static String solution(int size, int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<>();
        int i=0;
        while(i<n) {
            if(i<size) {
                if(deq.contains(arr[i])) {
                    deq.remove(arr[i]);
                    deq.addFirst(arr[i]);
                }
                else {
                    deq.addFirst(arr[i]);
                }
            }
            else {
                if(deq.contains(arr[i])) {
                    deq.remove(arr[i]);
                    deq.addFirst(arr[i]);
                }
                else {
                    deq.addFirst(arr[i]);
                }
                if(deq.size()>size) deq.removeLast();
            }
            i++;
        }
        for(int x : deq) {
            sb.append(x).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(size, n, arr));
    }
}
