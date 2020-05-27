package com.github.wangdh.eventbus;

import com.google.common.eventbus.Subscribe;

/**
 * @author wdh
 */
public class OrderListener {

    @Subscribe
    public void do1(OrderMessage orderMessage){
        System.out.println("do1===>>>" + orderMessage);
    }

    @Subscribe
    public void do2(OrderMessage orderMessage){
        System.out.println("do2===>>>" + orderMessage);
    }
}
