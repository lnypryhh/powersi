package com.study.powersi.use.Array;

import com.study.powersi.BaseDateType.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Two {

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void print(Object[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public void Sort(){
        int arr[] = {12,45,75,4,56,2,3,43};
        Arrays.sort(arr);
        for(int x = 0,y=arr.length-1; x < arr.length/2; x++,y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        print(arr);

        int i1 = Arrays.binarySearch(arr, 4);
        System.out.println("第4个位置的值是："+i1);
    }

    public void insertElement(){
        int arr[] = {12,45,12,75,4,56,2,3,43};
        Arrays.sort(arr);
        int t = 12;
        int temp[] = new int[arr.length+1];
        for(int x =0 ; x < arr.length; x++) {
            temp[x+1]=arr[x];
        }

        for(int x =1 ; x <temp.length ; x++) {
            if(temp[x]<t){
                temp[x-1] = temp[x];
            }else {
                temp[x-1] = t;
                break;
            }
        }

        print(arr);
        print(temp);
    }

    public void len(){
        int[][] a = new int[3][4];
        System.out.println("一维数组长度："+a.length);
        System.out.println("二维数组长度："+a[1].length);
    }

    public void reverse(){
        int arr[] = {12,45,75,4,56,2,3,43};
        Arrays.sort(arr);
        for(int x =0 ; x <arr.length/2+1 ; x++) {
            int temp = arr[arr.length-1-x];
            arr[arr.length-1-x]=arr[x];
            arr[x]=temp;
        }
        print(arr);
    }

    public void MaxMin(){
        Integer arr[] = {12,45,75,4,56,2,3,43};
        int min=arr[0],max=arr[0];
        for(int x =1 ; x <arr.length ; x++) {
            if(arr[x]>max){
                max=arr[x];
            }
            if(arr[x]<min){
                min = arr[x];
            }
        }
        //max = (int)Collections.max(Arrays.asList(arr));
        //min = (int)Collections.min(Arrays.asList(arr));
        print(arr);
        System.out.println("max="+max+",min="+min);
    }

    public void add(){
        String [] a = {"sda","sda","sad"};
        String [] b = {"sda1","sda1","sad1"};
        ArrayList<String> array = new ArrayList<String>(Arrays.asList(a));
        array.addAll(Arrays.asList(b));
        for(String e: array) {
            System.out.println(e);
        }

    }

    public void fill(){
        String[] str = new String[5];
        str[1]="sdad";
        str[2]="222";
        //填充全部
        Arrays.fill(str,"100");
        str[1] = "qwertyu";
        //左开右闭
        Arrays.fill(str,2,4,"yhh");
        for(String e: str) {
            System.out.println(e);
        }
    }

    public void expa(){
        String[] a = new String[]{"A","B","C"};
        String[] b = new String[5];
        b[3]="E";
        b[4]="F";
        //a 的 0 位开始复制到 b ,从 0 开始，复制位数
        System.arraycopy(a,1,b,1,a.length-1);
        for(String e: b) {
            System.out.println(e);
        }
    }

    public void findDupicateInArray(){
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x = 0; x < arr.length; x++) {
            if(map.get(arr[x])!=null){
                map.put(arr[x],map.get(arr[x])+1);
            }else{
                map.put(arr[x],1);
            }
        }
        for(Integer e: map.keySet()) {
            if(map.get(e)>1){
                System.out.println("数组重复元素是"+e+",重复次数是："+map.get(e));
            }
        }
    }
}
