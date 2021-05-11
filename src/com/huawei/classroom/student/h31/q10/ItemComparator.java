package com.huawei.classroom.student.h31.q10;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {

private final int order;
    
public ItemComparator(int order) 
{
        super();
        this.order = order;
}

    @Override
    public int compare(Item i1, Item i2) 
{
        int result = -i1.compareTo(i2);
        int resultM=-i1.compareMTo(i2);
        if (this.order == -1) {
            return result;
        } else {
            return resultM;
        }
    }
}

