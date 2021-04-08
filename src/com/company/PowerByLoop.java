package com.company;

public class PowerByLoop extends PowerImp{
    PowerByLoop(MultipleImp multipleImp) {
        super(multipleImp);
    }

    @Override
    public int implement(int x, int y) {
        int result = 1;
        for (int i = 0 ; i < y ; i++) {
            result = this.multipleImp.implement(result, x);
        }
        return result;
    }
}

