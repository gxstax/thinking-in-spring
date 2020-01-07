package com.ant.spring.ioc.overview.dependency.injection;

import com.ant.spring.ioc.overview.annotation.Super;
import com.ant.spring.ioc.overview.dependency.repository.UserRepository;
import com.ant.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * <p>
 * 依赖查找示例
 * </p>
 *
 * @author Ant
 * @since 2020-01-03 09:21
 */
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        // 初始化spring容器上下文环境
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("META-INF/dependency-injection-context.xml");

        // 依赖来源一：自定义的bean
        UserRepository userPository = (UserRepository) context.getBean("userRepository");

        // 依赖来源二：内建的依赖
        System.out.println(userPository.getBeanFactory());

        // 依赖查找（错误）
//        System.out.println(context.getBean(BeanFactory.class));

        // 依赖来源三：容器内建 Bean
        Environment environment = context.getBean(Environment.class);
        System.out.println("获取 Environment 类型的 Bean" + environment);

    }


}
