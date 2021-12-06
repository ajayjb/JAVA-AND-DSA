package com.ajay;

public class BinaryProblemCeilNumber {
    public static void main(String[] args) {
         int[] arr = {2,5,6,9,18,25,50,59,65,99,114};
         System.out.println(cielBinary(arr, 75));
    }

    static int cielBruteForce(int[] arr, int target){
        for(int num: arr) {
            if (num == target){
                return target;
            }
            else if(num>target){
                return num;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int cielBinary(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;
        int m;
        while(r>=l){
            m = (r+l)/2;
            if (target<arr[m]){
                r = m-1;
            }
            else if(target>arr[m]){
                l = m+1;
            }
            else if(target == arr[m]){
                return arr[m];
            }
            if(r==l){
                if (arr[r]>target){
                    return arr[r];
                }else {
                    return arr[r+1];
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}
