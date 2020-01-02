package com.ant.test;

import com.ant.awares.beannameaware.UserA;
import com.ant.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2019-12-27 09:53
 */
public class ApplicationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        UserA userA = context.getBean(UserA.class);

        userA.setBeanName("ss");
    }
}
