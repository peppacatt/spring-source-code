package com.peppacatt.spring.springboot3.beanDefinition;

import org.junit.jupiter.api.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;

public class BeanDefinitionTest {
    @Test
    public void registry() {
        SimpleBeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClassName("com.peppacatt.spring.springboot3.entity.Dog");
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("name", "jinMao");
        propertyValues.addPropertyValue("age",30);
        rootBeanDefinition.setPropertyValues(propertyValues);
        registry.registerBeanDefinition("jinMaoBean",rootBeanDefinition);

        ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("parentJinMao");
        childBeanDefinition.setBeanClassName("com.peppacatt.spring.springboot3.entity.TeddyDog");
        MutablePropertyValues childPropertyValues = new MutablePropertyValues();
        childPropertyValues.addPropertyValue("name","jinMao1");
        childPropertyValues.addPropertyValue("gender","男");
        registry.registerBeanDefinition("jinMao1Bean",childBeanDefinition);

    }
}