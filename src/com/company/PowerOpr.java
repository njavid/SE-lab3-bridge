package com.company;

public class PowerOpr extends Operation{

    PowerOpr(PowerImp powerImp) {
        super(powerImp);
    }
    public PowerImp getPowerImp(){
        return (PowerImp) imp;
    }

}
