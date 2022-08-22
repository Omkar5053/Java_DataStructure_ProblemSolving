package Arrays;

public class TippingWater {
    public static void main(String[] args)
    {
        int[] arr = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(totalTrappedWater(arr));
    }

    private static int totalTrappedWater(int[] arr)
    {
        int tw = 0;
        int wl;
        int size = arr.length;
        int leftMax[] = new int[size];
        int rightMax[] = new int[size];

        //calculating left maximum into leftMax helping array
        //calculating left max boundary - array
        leftMax[0] = arr[0];
        for(int i = 1; i<size; i++)
        {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //calculating right maximum into rightMax helping array
        //calculating right max boundary - array
        rightMax[size-1] = arr[size-1];
        for(int i = size-2; i>=0; i--)
        {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        //now we have the both array who keep record of left max and right max of any particular element
        for(int i = 0; i<size; i++)
        {
            //waterlevel = min(leftmax bound, rightmax bound)
            wl = Math.min(leftMax[i],rightMax[i]);
            //trapped water = waterlevel - height[i]
            tw += wl - arr[i];
        }
        return tw;
    }
}
