package com.surya.mycalculatorinmvp.model;

public class SumModel implements IModel {

    int firstNum;
    int secondNum;

    public SumModel(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int getFirstNum() {
        return firstNum;
    }

    @Override
    public int getSecondNum() {
        return secondNum;
    }
}
