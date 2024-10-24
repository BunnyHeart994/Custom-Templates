import java.util.*;
import java.lang.*;

public class ArrayControl
{
    public static Object[] addArrSlot(Object[] mainArr)
    {
        Object[] tempArr = new Object[mainArr.length + 1];
        for (int i = 0; i < mainArr.length; i++)
        {
            tempArr[i] = mainArr[i];
        }
        mainArr = tempArr;
        return mainArr;
    }
}