package com.templates.source;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayControl
{
    private static final Scanner scan = new Scanner(System.in);

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
}