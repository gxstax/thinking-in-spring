package com.ant.spring.bean.definition;

import com.ant.spring.bean.factory.DefaultUserFactory;
import com.ant.spring.bean.factory.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Bean 的初始化示例
 * </p>
 *
 * @author GaoXin
 * @since 2020/1/20 8:40 上午
 */
@ComponentScan("com.ant.spring.bean")
public class BeanInitializationDemo {
    public static void main(String[] args) {
        // 初始化Spring上下文环境
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册Configuration Class(配置类)
        context.register(BeanInitializationDemo.class);
        // 启动 Spring 应用上下文
        context.refresh();

        UserFactory bean = context.getBean(UserFactory.class);

        // 关闭 Spring 应用上下文
        context.close();
    }

    @Bean(initMethod = "initUserFactory")
    public UserFactory userFactory() {
        return new DefaultUserFactory();
    }
}
