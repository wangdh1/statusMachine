package com.github.wangdh.eventbus;

import com.google.common.eventbus.EventBus;

import java.util.HashMap;

public class MainTest1 {
    public static void main(String[] args) {
        EventBus mainTest1 = new EventBus("MainTest1");
        mainTest1.register(new OrderListener());
        mainTest1.post(new OrderMessage("hello dh..."));
    }
}
