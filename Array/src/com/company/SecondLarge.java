package com.company;

public class SecondLarge {
    public static void main(String[] args) {

        int a[] = {-14,-10,-25,-20,-12,-22,-14,-23};
        int max=a[0];
        int secondMax = a[0];

        int min=a[0];
        int secondMin=a[0];
        int thirdMin=a[0];

        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                secondMax = max;
                max =a[i];
            }else if(a[i]>secondMax){
                secondMax = a[i];
            }

            if(a[i]<min){
                secondMin = min;
                min= a[i];
            }else if (a[i]<secondMin){
                thirdMin = secondMin;
                secondMin = a[i];
            }else if(a[i]<thirdMin){
                thirdMin = a[i];
            }

        }
        System.out.println("Second Largest Number is "+secondMax);
        System.out.println("Third Minimum Number is "+thirdMin);

    }
}
