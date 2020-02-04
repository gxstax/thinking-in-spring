package com.ant.spring.dependency.lookup;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 *  通过 {@link org.springframework.beans.factory.ObjectProvider} 进行依赖查找
 * </p>
 *
 * @author Ant
 * @since 2020/2/4 3:25 下午
 */
public class ObjectProviderDemo {
    public static void main(String[] args) {
        // 初始化Spring上下文环境
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册 ObjectProviderDemo Class(配置类)
        context.register(ObjectProviderDemo.class);
        // 启动 Spring 应用上下文
        context.refresh();

        lookupByObjectProvider(context);

        // 关闭 Spring 应用上下文
        context.close();
        System.gc();
    }

    @Bean
    public String helloWorld() {
        return "Hello,World";
    }

    private static void lookupByObjectProvider(AnnotationConfigApplicationContext context) {
        ObjectProvider<String> beanProvider = context.getBeanProvider(String.class);
        System.out.println(beanProvider.getObject());
    }
}
