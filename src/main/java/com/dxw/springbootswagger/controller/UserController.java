package com.dxw.springbootswagger.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dxw.springbootswagger.entity.TUser;
import com.dxw.springbootswagger.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("user")
@Api(tags="接口文档")
public class UserController {

    private final UserMapper userMapper;


    @GetMapping("/all")
    @ApiOperation(value="查询全部")
    public List<TUser> getAllUser(){
        return userMapper.selectList(null);
    }

    @GetMapping("/id")
    @ApiOperation(value="根据id查询")
    @ApiImplicitParam(name="userId",value="用户id",required=true)
    public TUser getAllUserById(@RequestParam("userId") String userId){
        return userMapper.selectOne(new LambdaQueryWrapper<TUser>().eq(TUser::getUserId,userId));
    }


}
