package com.example.rxeventbus.rxjava;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class RxEventBus {
    public RxEventBus() {
    }

    private PublishSubject<Object> bus = PublishSubject.create();

    public void send(Object o) {
        bus.onNext(o);
    }

    public Observable<Object> toObserverable() {
        return bus;
    }

    public boolean hasObservers() {
        return bus.hasObservers();
    }
}