package com.company;

public class MultipleImpRecursive extends MultipleImp{
    @Override
    public int implement(int x, int y) {
        if (y == 1){
            return x;
        }
        else {
            return x + implement(x, y-1);
        }
    }

    public void setMultipleImp(Imp imp) {
    }
}
