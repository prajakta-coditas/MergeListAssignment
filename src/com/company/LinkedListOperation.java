package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Collection;

public class LinkedListOperation {
    List<Integer> list1 = new LinkedList<>();
    List<Integer> list2 = new LinkedList<>();
    List<Integer> list3 = new LinkedList<>();
   // List<Integer> list4 = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    private java.lang.Object Object;

    public void setvalue() {

        System.out.println("How many elements do you want in LinkedList 1 :: ");
        int x= sc.nextInt();
        System.out.println("enter elements of first arraylist ::  ");
        for (int i = 0; i < x; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println("How many elements do you want in LinkedList 2 :: ");
        int m= sc.nextInt();
        System.out.println("enter elements of second arraylist ::  ");
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        System.out.println("How many elements do you want in LinkedList 3 :: ");
        int n= sc.nextInt();
        System.out.println("enter elements of third arraylist ::  ");
        for (int i = 0; i < n; i++) {
            list3.add(sc.nextInt());
        }

        System.out.println("Linked list are as follows ::  ");
        System.out.print(list1 +"-->");
        System.out.print(list2 +"-->");
        System.out.println(list3);











        List<Object> list= new LinkedList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);

       Object[] obj = list.toArray();
     //   System.out.println(obj);
        System.out.println("Array is :: ");
        System.out.println(Arrays.toString(obj));


        Object[] obj1 = list1.toArray();
        Object[] obj2 = list2.toArray();
        Object[] obj3 = list3.toArray();

        int sum=x+m+n;//+o;
        Object[] arr= new Object[sum];

        System.arraycopy(obj1,0,arr,0,x);
        System.arraycopy(obj2,0,arr,x,m);
        Object[] arr1 = new Object[x+m];
        arr1= arr;

       System.arraycopy(obj3,0,arr1,x+m,n);
       Object[] arr2= new Object[x+m+n];
       arr2=arr1;

      //  System.arraycopy(obj4,0,arr2,x+m+n,o);
       //Object [] arr3= new Object[sum] ;
        //arr3= arr2;
       // for(int i=0;i<sum;i++)
        System.out.println(Arrays.toString(arr2));


     //  return arr2;
        System.out.println("Sorted Array is  ::  ");
Object temp;
       for (int i=0;i<arr2.length;i++){
           for (int j=i+1;j<arr2.length;j++){
               if((int)arr2[i] > (int)arr2[j]){
                  // arr2[j]= arr2[i];
                   temp= arr2[i];
                   arr2[i]=arr2[j];
                   arr2[j]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr2));

    }





}

