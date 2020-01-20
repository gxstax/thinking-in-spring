package com.ant.spring.bean.factory;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p>
 * 默认 {@link UserFactory} 实现
 * </p>
 *
 * @Author Ant gxstax@163.com
 * @since 2020/1/18 11:10 下午
 **/
public class DefaultUserFactory implements UserFactory, InitializingBean {
    // 1. 基于 @PostConstruct 注解初始化Bean
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct : UserFactory 初始化中...");
    }

    public void initUserFactory() {
        System.out.println("自定义初始化方法 initUserFactory(): UserFactory 初始化中...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean#afterPropertiesSet: UserFactory 初始化中...");
    }
}
