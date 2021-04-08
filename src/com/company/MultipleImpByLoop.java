package com.company;

public class MultipleImpByLoop extends MultipleImp {
    @Override
    public int implement(int x, int y) {
        int result = 0;
        for (int i = 0 ; i < y ; i++ ){
            result += x;
        }
        return result;
    }
}
