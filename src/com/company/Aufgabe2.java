package com.company;

public class Aufgabe2 {
    public static int getMax(int[] arr, int length)
    {
        int max;
        for(int i=0; i<length; i++)
        {
            for(int j=i+1; j<length; j++)
            {
                if(arr[i] > arr[j])
                {
                    max=arr[i];
                    arr[i] = arr[j];
                    arr[j]=max;

                }
            }
        }
        return arr[length-1];
    }

    public static int getMin(int[] arr, int length)
    {
        int min;
        for(int i=0; i<length; i++)
        {
            for(int j=i+1; j<length; j++)
            {
                if(arr[i] > arr[j])
                {
                 min=arr[i];
                    arr[i] = arr[j];
                    arr[j]=min;

                }
            }
        }
        return arr[0];
    }

    public static int maxSum(int [] arr, int length)
    {

        int maxSum=0, sum=0;
        for(int i=0; i<length; i++)
        {
            sum=sum+arr[i];
            if(sum<0)
            {
                sum=0;
            }
            else if(sum>maxSum)
            {
                maxSum=sum;
            }
        }
        int min = getMin(arr, length);
        return maxSum - min;
    }

    public static int minSum(int [] arr, int length) {

        int minSum = 0, sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            } else if (sum > minSum) {
                minSum = sum;
            }
        }
        int max = getMax(arr, length);
        return minSum - max;
    }
}
