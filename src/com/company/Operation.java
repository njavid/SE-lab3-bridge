package com.company;

public abstract class Operation {
    Imp imp;

    Operation(Imp imp){
        this.imp = imp;
    }
    int operate(int x, int y){
        return imp.implement(x,y);
    }
}
