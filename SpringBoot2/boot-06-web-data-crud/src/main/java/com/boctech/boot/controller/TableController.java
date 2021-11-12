package com.boctech.boot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boctech.boot.bean.User;
import com.boctech.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 12:24
 * Description:
 */
@Controller
public class TableController {
    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra) {

        userService.removeById(id);
        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model) {
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("zhangsan","123456"),
//                new User("lisi","123444"),
//                new User("haha","aaaaa"),
//                new User("hehe","aaddd"));
//        model.addAttribute("users",users);
        //从数据库中查出user表中用户进行展示

        List<User> list = userService.list();
        model.addAttribute("users",list);

        //分页查询数据
        Page<User> userPage = new Page<>(pn, 3);

        //分页查询的结果
        Page<User> users = userService.page(userPage, null);
        long current = users.getCurrent();
        long pages = users.getPages();
        long total = users.getTotal();
        List<User> records = users.getRecords();

        model.addAttribute("page",users);

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}

