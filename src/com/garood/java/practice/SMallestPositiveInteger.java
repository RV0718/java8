package com.garood.java.practice;

public class SMallestPositiveInteger {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        /*HashSet<Integer> set = new HashSet<>();
        for(int a : A){
            if(a >= 0){
                set.add(a);
            }
        }

        TreeSet<Integer> set1 = new TreeSet<Integer>(set);
*/
        int shift = 0;
        for (int a : A) {
            if (a < 0) {
                shift++;
            }
        }

        int[] b = new int[A.length - shift];
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                b[i] = A[i];
            }
        }

        //Arrays.sort(b);

        int temp = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if (b[j - 1] > b[j]) {
                    temp = b[j - 1];
                    b[j - 1] = b[j];
                    b[j] = temp;
                }
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (b[j] != j) {
                return j;
            }
        }
        return b.length;

    }
}
