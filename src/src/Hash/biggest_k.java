package Hash;

// map vs set -> map은 중복 ok, set은 중복 no
// TreeSet -> 중복을 허용하지 않는 오름차순, 내림차순 형태의 이진 트리 형태
// 중복을 제거하면서 정렬을 하는 문제에 유용하다.

import java.io.*;
import java.util.*;

public class biggest_k {
    public static int solution(int n, int[] arr, int k){
        int answer = -1;
        // tset의 기본 형태는 내림차순, 오름차순을 위해서는 Collections.reverseOrder() 추가
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int l=j+1; l<n; l++) {
                    tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for(int x : tset) {
            cnt++;
            if(cnt == k) {
                answer = x;
                break;
            }
        }
        return answer;
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
        System.out.println(solution(n, arr, k));
    }
}

