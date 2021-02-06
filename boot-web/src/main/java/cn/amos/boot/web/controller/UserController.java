package cn.amos.boot.web.controller;

import cn.amos.boot.common.api.page.Page;
import cn.amos.boot.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author DaoyuanWang
 * @version V1.0.0
 * @apiNote 用户相关
 * @date 2018/1/15
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public String userManage(@RequestParam(value = "page", required = false) Integer page,
                             @RequestParam(value = "size", required = false) Integer size,
                             Model model) {
        if (page == null || size == null) {
            return "error";
        }

        Page pageModel = new Page();
        pageModel.setPage(page);
        pageModel.setSize(size);

        model.addAttribute("pageResult", userService.findByPage(pageModel));

        return "user";
    }
}
