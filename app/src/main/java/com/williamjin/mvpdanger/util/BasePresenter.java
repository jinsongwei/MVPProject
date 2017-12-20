package com.williamjin.mvpdanger.util;

/**
 * Created by william on 12/19/17.
 */

public interface BasePresenter <V extends BaseView>{
    void attachView(V view);
    void detachView();
}
