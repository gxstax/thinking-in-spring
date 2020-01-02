package com.ant.java.beans;

import org.omg.PortableInterceptor.Interceptor;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.stream.Stream;

/**
 * <p>
 * {@link java.beans.BeanInfo} 示例
 *
 *
 *
 * </p>
 *
 * @author GaoXin
 * @since 2020-01-02 08:26
 */
public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);

        Stream.of(beanInfo.getPropertyDescriptors()).forEach(
                propertyDescriptor -> {
                    System.out.println(propertyDescriptor);
                });
    }

}
