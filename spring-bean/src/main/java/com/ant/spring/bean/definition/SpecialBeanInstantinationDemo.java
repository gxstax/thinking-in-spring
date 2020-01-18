package com.ant.spring.bean.definition;

import com.ant.spring.bean.factory.UserFactory;
import com.ant.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * <p>
 *  Bean 实例化示例
 * </p>
 *
 * @Author Ant
 * @since 2020/1/18 10:59 下午
 **/
public class SpecialBeanInstantinationDemo {
    public static void main(String[] args) {
        // 配置 XML 文件
        // 启动 Spring 应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/bean-creation-context.xml");

        serviceLoaderDemo();
    }

    public static void serviceLoaderDemo() {
        ServiceLoader<UserFactory> userFactories = ServiceLoader.load(UserFactory.class, Thread.currentThread().getContextClassLoader());

        Iterator<UserFactory> iterator = userFactories.iterator();
        while (iterator.hasNext()) {
            UserFactory next = iterator.next();
            System.out.println(next.createUser());
        }
    }
}
