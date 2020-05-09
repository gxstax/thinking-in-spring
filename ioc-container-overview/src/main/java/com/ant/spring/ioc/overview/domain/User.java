package com.ant.spring.ioc.overview.domain;

import com.ant.spring.ioc.overview.enums.City;
import org.springframework.core.io.Resource;


/**
 * <p>
 * 用户类
 * </p>
 *
 * @author Ant gxstax@163.com
 * @since 2020-01-03 09:24
 */
public class User {

    private Long id;

    private String name;

    private City city;

    private Resource configFileLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Resource getConfigFileLocation() {
        return configFileLocation;
    }

    public void setConfigFileLocation(Resource configFileLocation) {
        this.configFileLocation = configFileLocation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", configFileLocation=" + configFileLocation +
                '}';
    }

    public static User createUser() {
        User user = new User();
        user.setId(1L);
        user.setName("马以");
        return user;
    }
}
