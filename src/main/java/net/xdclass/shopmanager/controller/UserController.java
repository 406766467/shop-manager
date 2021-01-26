package net.xdclass.shopmanager.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import net.xdclass.shopmanager.model.User;
import net.xdclass.shopmanager.request.SaveUserRequest;
import net.xdclass.shopmanager.utils.JsonData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zfh
 * @since 2021-01-25
 */
@RestController
@RequestMapping("/api/v1/user")
@Api(tags = "用户模块",value = "用户UserController")
public class UserController {

    @ApiOperation("用户列表")
    @GetMapping("list")
    public JsonData list(){
        User user1 = User.builder().name("zfh1").id(1).address("中国").build();
        User user2 = User.builder().name("zfh2").id(1).address("美国").build();
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        return JsonData.buildSuccess(list);
    }

    @ApiOperation("登录")
    @PostMapping("login")
    @ApiResponses({
            @ApiResponse(responseCode = "302",description = "重定向，跳转登录！"),
            @ApiResponse(responseCode = "403",description = "用户权限不足！"),
            @ApiResponse(responseCode = "404",description = "页面无法访问！")
    })
    public JsonData login(@ApiParam(name = "name" , value = "用户名" , example = "user123") @RequestParam("name") String name,
    @ApiParam(name = "pwd" , value = "密码" ,example = "123456") @RequestParam("pwd") String pwd){
        return JsonData.buildSuccess(name+pwd);
    }

    @ApiOperation("删除用户")
    @DeleteMapping("delete/{id}")
    public JsonData  deleteById(@PathVariable int id) {
        return JsonData.buildSuccess();
    }

    @ApiOperation("新增用户")
    @PostMapping("add")
    public JsonData add(@RequestBody SaveUserRequest saveUserRequest){
        return JsonData.buildSuccess();
    }
}

