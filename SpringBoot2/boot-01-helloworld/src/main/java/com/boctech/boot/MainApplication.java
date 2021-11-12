package com.boctech.boot;

import ch.qos.logback.core.db.DBHelper;
import com.boctech.boot.bean.Pet;
import com.boctech.boot.bean.User;
import com.boctech.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.cache.interceptor.CacheAspectSupport;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/29- 20:13
 * Description:
 */
//声明这是一个springboot应用  主程序类  主配置类
//@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.boctech")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.boctech")
public class MainApplication {

    public static void main(String[] args) {
        //1. 返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2. 查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        //可以使用names.for然后快捷键enter
        for (String name : names) {
        //    System.out.println("系统所有的组件名称:" + name);
        }

//        //3.从容器中获取组件
//        Pet tom01 = run.getBean("tom", Pet.class);
//        Pet tom02 = run.getBean("tom", Pet.class);
//   //     System.out.println("组件：" +(tom01 == tom02));
//
//        MyConfig bean = run.getBean(MyConfig.class);
//   //     System.out.println(bean);
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法，springboot总会检查这个组件是否在容器中有
//        //保持组件单实例
//        User user = bean.user01();
//        User user1 = bean.user01();
//     //   System.out.println(user == user1);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//        //System.out.println("用户的宠物:" + (user01.getPet() == tom));
//
//        //5.获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("=======");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);

//        boolean tom = run.containsBean("tom");
//        System.out.println("容器中Tom组件：" +tom);
//
//        boolean user01 = run.containsBean("user01");
//        System.out.println("容器中user01组件：" +user01 );

//        boolean tom22 = run.containsBean("tom22");
//        System.out.println("容器中组件：" +tom22 );

//        boolean haha = run.containsBean("haha");
//        System.out.println("容器中组件：" +haha );
//
//        boolean hehe= run.containsBean("hehe");
//        System.out.println("容器中组件：" +hehe );

//        int count = run.getBeanDefinitionCount();
//        System.out.println("组件数量一共有："+count);

//        String[] beanNamesForType = run.getBeanNamesForType(CacheAspectSupport.class);
//        System.out.println("===="+beanNamesForType.length);

//        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
//        System.out.println("====="+beanNamesForType.length);


    }
}
