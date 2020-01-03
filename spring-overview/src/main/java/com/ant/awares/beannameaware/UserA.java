package com.ant.awares.beannameaware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2019-12-27 09:48
 */
@Component("userA")
public class UserA implements BeanNameAware {

    public void setBeanName(String name) {
        System.out.println("UserA#beanName->" + name);
    }

}
