package cn.amos.web.controller;

import cn.amos.common.page.PageModel;
import cn.amos.common.response.PageResult;
import cn.amos.dao.entity.UserEntity;
import cn.amos.dao.mappers.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

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
    private UserMapper userMapper;

    @RequestMapping("page")
    public String pageApply(@RequestParam(value = "page", required = false) Integer page,
                            @RequestParam(value = "size", required = false) Integer size,
                            Model model) {
        if (page == null || size == null) {
            return "parameterError";
        }
        PageModel pageModel = new PageModel();
        pageModel.setPage(page);
        pageModel.setRows(size);
        List<UserEntity> applyEntities = userMapper.selectByPage(pageModel);
        List<UserEntity> applyEntitiesAll = userMapper.selectAll();
        PageResult<UserEntity> pageResult = new PageResult<>();
        // 总记录数量 || 当前页记录数量 || 记录数据列表
        pageResult.setTotal(applyEntitiesAll.size());
        pageResult.setNumber(applyEntities.size());
        pageResult.setRows(applyEntities);
        pageResult.finish(page, size);

        model.addAttribute("pageResult", pageResult);
        return "user";
    }
}
