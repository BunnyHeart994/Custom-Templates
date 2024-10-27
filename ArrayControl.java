import java.util.*;
import java.lang.*;

public class ArrayControl
{
    private static final Scanner scan = new Scanner(System.in);
    /*public static void main(String[] args) //main method, for tests
    {
        Object[] arr = new Object[1];
        //System.out.println("before: " + arr.length);

        //arr = addArrSlotsWCopy(arr, 1);
        //arr = toIntArr(arr);
        //System.out.println("after: " + arr.length);
        System.out.println("'arr' type: " + arr.getClass());
        arr = changeArrType(arr, "string");
        //arr[0] = 1;
        System.out.println("value at [0]: " + arr[0] + "\n" + "'arr' type: " + arr.getClass());
        arr = changeArrType(arr, scan.nextLine());
        System.out.println("'arr' type: " + arr.getClass());
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
    /*A BRIEF DEMO OF WHAT "changeArrType" DOES
    //TRANSFORMS AN Object ARRAY (target) INTO AN Integer ARRAY (toIntArr)
    public static Object[] toIntArr(Object[] target)
    {
        return target = new Integer[target.length];
    }*/
    public static Object[] changeArrType(Object[] target, String type) //NEW IMPORTANT
    {
        return switch (type)
        {
            case "short": yield target = new Short[target.length];
            case "int": yield target = new Integer[target.length];
            case "long": yield target = new Long[target.length];
            case "string": yield target = new String[target.length];
            case "char": yield target = new Character[target.length];
            case "bool": yield target = new Boolean[target.length];
            default: System.out.println("\nARRAY TYPE CONVERSION ERROR\nRETURNING null"); yield null;
        };
        /*do
        {
            if (type.equalsIgnoreCase("short"))
                return target = new Short[target.length];
            else if (type.equalsIgnoreCase("int"))
                return target = new Integer[target.length];
            else if (type.equalsIgnoreCase("long"))
                return target = new Long[target.length];
            else if (type.equalsIgnoreCase("string"))
                return target = new String[target.length];
            else if (type.equalsIgnoreCase("char"))
                return target = new Character[target.length];
            else if (type.equalsIgnoreCase("bool"))
                return target = new Boolean[target.length];
            else
            {
                System.out.println("\nARRAY TYPE CONVERSION ERROR\nRETURNING null");
                return null;
            }
        } while(true);*/
    }
}