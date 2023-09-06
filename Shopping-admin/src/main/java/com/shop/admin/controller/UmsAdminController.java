package com.shop.admin.controller;


import com.shop.admin.service.IUmsAdminService;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.UmsAdminLoginParam;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsAdmin;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
@Controller
@RequestMapping("/admin")
@Api(tags = "UmsAdminController", description = "Oss管理")
public class UmsAdminController {
    @Autowired
    private IUmsAdminService adminService;


    @ApiOperation("登录接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@Validated @RequestBody UmsAdminLoginParam umsAdminLoginParam) {
        return adminService.login(umsAdminLoginParam.getUsername(),umsAdminLoginParam.getPassword());
    }

    @ApiOperation("加载用户信息")
    @RequestMapping(value = "/loadByUsername", method = RequestMethod.GET)
    @ResponseBody
    public UserDto loadUserByUsername(@RequestParam String username) {
        UserDto userDTO = adminService.loadUserByUsername(username);
        return userDTO;
    }


}

