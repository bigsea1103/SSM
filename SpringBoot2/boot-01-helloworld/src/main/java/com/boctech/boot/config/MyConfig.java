package com.boctech.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.boctech.boot.bean.Car;
import com.boctech.boot.bean.Pet;
import com.boctech.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/30- 09:46
 * Description:
 */
//告诉springboot这是一个配置类 ==  配置文件
// 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
//2.配置类本身也是组件
//3.proxyBeanMethods 代理bean方法
/**
 *  Full(proxyBeanMethods = true)
 *  Full(proxyBeanMethods = false)
 *   应用场景：组件依赖问题
 * */
//@Import({User.class, DBHelper.class}) 给容器中自动创建出这两个，
// 类型的组件,默认组件的名字就是全类名
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true)
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom")
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
//1.开启Car配置绑定功能   2.把这个Car这个组件自动注册到容器中
public class MyConfig {

    // 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例
    @Bean
    /**  给容器中添加组件,以方法名作为组件的id,
     *   返回类型就是组件的类型，返回的值就是组件在容器中的实例
     * */
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        //User组件依赖Pet组件
        zhangsan.setPet(tomcat());
        return new User("zhangsan", 18);
    }

    @Bean("tom22")  //也可以自定义组件名
    public Pet tomcat() {
        return new Pet("tomcat");
    }
}
