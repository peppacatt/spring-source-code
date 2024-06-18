package com.peppacatt.spring.springboot3.entity;

import cn.hutool.extra.spring.SpringUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    public void t() {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClassName("com.peppacatt.spring.springboot3.entity.Demo");
        beanDefinition.setScope(ConfigurableBeanFactory.SCOPE_PROTOTYPE);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("name", "peppacatt");
        propertyValues.addPropertyValue("age", 18);
        beanDefinition.setPropertyValues(propertyValues);
    }
}