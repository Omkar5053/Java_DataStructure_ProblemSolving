package practice;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args)
    {
        int [] arr= {1,2,43,67,43};
        int target = 43;
        System.out.println(check(arr,target,0));
        System.out.println(checkIndex(arr,target,0));
        //checkAllIndex(arr,target,0);
        //System.out.println(checkAllIndex(arr,target,0,new ArrayList<Integer>()));
        System.out.println(checkAllIndex2(arr,target,0));
    }
    private static boolean check(int[] arr, int target, int index)
    {
        if(index == arr.length - 1)
            return false;
        return arr[index] == target || check(arr, target, index+1);
    }

    private static int checkIndex(int[] arr, int target, int index)
    {
        if(index == arr.length - 1)
            return -1;

        if(arr[index] == target)
        {
            return index;
        }
        return checkIndex(arr, target, index+1);
    }

/*   static ArrayList<Integer> a = new ArrayList<>();
    private static void checkAllIndex(int[] arr, int target, int index)
    {
        if(index == arr.length)
            return;

        if(arr[index] == target)
        {
            a.add(index);
        }
        checkAllIndex(arr, target, index+1);
    }*/

    private static ArrayList<Integer> checkAllIndex(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        if(index == arr.length)
            return list;

        if(arr[index] == target)
        {
            list.add(index);
        }
        return checkAllIndex(arr, target, index+1,list);
    }

    private static ArrayList<Integer> checkAllIndex2(int[] arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(index == arr.length)
            return list;

        if(arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  checkAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
