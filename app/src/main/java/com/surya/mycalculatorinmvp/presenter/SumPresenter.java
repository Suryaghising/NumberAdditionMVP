package com.surya.mycalculatorinmvp.presenter;

import com.surya.mycalculatorinmvp.model.SumModel;
import com.surya.mycalculatorinmvp.view.IView;

public class SumPresenter implements IPresenter {

    IView iView;

    public SumPresenter(IView iView) {
        this.iView = iView;
    }

    @Override
    public void addNumbers(SumModel model) {
        iView.onSumCalculated(model.getFirstNum() + model.getSecondNum());
    }
}
