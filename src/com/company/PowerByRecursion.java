package com.company;

public class PowerByRecursion extends PowerImp{
    PowerByRecursion(MultipleImp multipleImp) {
        super(multipleImp);
    }

    @Override
    public int implement(int x, int y) {
        if (y == 1){
            return x;
        }
        else{
            return this.multipleImp.implement(implement(x, y-1), x);
        }
    }
}

