package com.stackroute.junit;


public class Digit {
    public static class Result{
        boolean value;
        int total;
        String order="";

    }
    public static Result sum(int input){
        int temp=input;
        int sum=0,r,count=0,i;
        while(temp!=0){
            r=temp%10;
            if(r%2==0)
                sum=sum+r;
            temp=temp/10;
            count++;
        }
        temp=input;
        int[] arr=new int[count];
        for(i=0;count>i;i++){
            arr[i]=temp%10;
            temp=temp/10;
        }
    for(i=0;i<count;i++){
        for(int j=0;j<count;j++)
            if(arr[i]>arr[j]){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
    }
    Result result=new Result();
    for(i=0;i<count;i++)
        result.order=result.order+arr[i];
    result.total=sum;
    if(sum>15)
        result.value=true;
    else
        result.value=false;
    return result;

    }

}
