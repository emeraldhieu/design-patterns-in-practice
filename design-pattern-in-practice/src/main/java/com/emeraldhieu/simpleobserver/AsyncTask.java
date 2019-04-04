package com.emeraldhieu.simpleobserver;

import java.util.ArrayList;
import java.util.List;

public class AsyncTask {

    private List<OnCompleteListener> listeners = new ArrayList<>();

    public void execute() {
        System.out.println("Executing...");
        System.out.println("Completed...");
        listeners.stream().forEach(c -> c.onComplete());
    }

    public void addOnCompleteListener(OnCompleteListener onCompleteListener) {
        listeners.add(onCompleteListener);
    }

    public interface OnCompleteListener {
        void onComplete();
    }
}
