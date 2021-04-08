package com.company;

public abstract class PowerImp implements Imp{
    public MultipleImp multipleImp;

    PowerImp(MultipleImp multipleImp){
        this.multipleImp = multipleImp;
    }
    public abstract void setMultipleImp(MultipleImp imp);

}
