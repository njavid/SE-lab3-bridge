package com.company;

public abstract class PowerImp implements Imp{
    public MultipleImp multipleImp;

    PowerImp(MultipleImp multipleImp){
        this.multipleImp = multipleImp;
    }

    public void setMultipleImp(MultipleImp multipleImp) {
        this.multipleImp = multipleImp;
    }
}
