package com.ant.spring.ioc.overview.dependency.lookup;

import com.ant.spring.ioc.overview.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * 依赖查找示例
 * </p>
 *
 * @author Ant
 * @since 2020-01-03 09:21
 */
public class DependencyLookupDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("/META-INF/dependency-lookup-context.xml");

        User bean = context.getBean(User.class);

        System.out.println(bean);
    }
}
