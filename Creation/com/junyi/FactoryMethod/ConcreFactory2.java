package com.junyi.FactoryMethod;

/**
 * @time: 2020/9/10 12:07
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class ConcreFactory2 extends FactoryMy {
    @Override
    public Product factoryMethod() {
        return new ConcreProduct2();
    }
}
