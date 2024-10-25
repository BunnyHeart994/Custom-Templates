import java.util.*;
import java.lang.*;

public class ArrayControl
{
    /*public static void main(String[] args)//main method, for tests
    {
        Object[] arr = new Object[0];
        System.out.println("before: " + arr.length);

        arr = addArrSlotsWCopy(arr, 1);
        arr = toIntArr(arr);
        System.out.println("after: " + arr.length);
        arr[0] = 1;
        System.out.println("value at [0]: " + arr[0]);
    }*/

    public static Object[] manualAddArrSlot(Object[] mainArr)
    {
        Object[] tempArr = new Object[mainArr.length + 1];
        for (int i = 0; i < mainArr.length; i++)
        {
            tempArr[i] = mainArr[i];
        }
        mainArr = tempArr;
        return mainArr;
    }

    //ADDS times AMOUNTS OF SLOTS TO AN ARRAY
    public static Object[] addArrSlotsWCopy(Object[] mainArr, int times)
    {
        return Arrays.copyOf(mainArr, (mainArr.length + times));
    }
    public static Object[] toStringArr(Object[] target)
    {
        target = new String[target.length];
        return target;
    }

    //TRANSFORMS AN Object ARRAY (target) INTO AN Integer ARRAY (toIntArr)
    public static Object[] toIntArr(Object[] target)
    {
        return target = new Integer[target.length];
    }
    public static Object[] changeArrType(Object[] target)//NEW IMPORTANT
    {
        return target;
    }
}