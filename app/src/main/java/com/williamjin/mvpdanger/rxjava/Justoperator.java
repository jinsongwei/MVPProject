package com.williamjin.mvpdanger.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by william on 12/19/17.
 */

public class Justoperator {

    public static void main(String[] args) {

        Observable<String> stringObservable = Observable.just(
                "First",
                "Second",
                "Third",
                "Fourth");

        Observer<String> stringObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext: " + s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };
        stringObservable.subscribe(stringObserver);
    }
}
