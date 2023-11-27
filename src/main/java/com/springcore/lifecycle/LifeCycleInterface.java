package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleInterface implements InitializingBean, DisposableBean {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LifeCycleInterface(String price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initilize bean");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy bean");

    }
}
