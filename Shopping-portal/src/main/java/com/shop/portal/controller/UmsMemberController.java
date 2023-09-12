package com.shop.portal.controller;


import com.shop.model.api.CommonResult;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsAdmin;
import com.shop.model.entity.UmsMember;
import com.shop.portal.service.IUmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
@Controller
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private IUmsMemberService memberService;

    @ApiOperation("会员注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestParam String username,
                                 @RequestParam String password,
                                 @RequestParam String telephone,
                                 @RequestParam String authCode) {
        memberService.register(username, password, telephone, authCode);
        return CommonResult.success(null,"注册成功");
    }

    @ApiOperation("会员登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestParam String username,
                              @RequestParam String password) {
        return memberService.login(username, password);
    }
    @ApiOperation("获取会员信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult info() {
        UmsMember member = memberService.getCurrentMember();
        return CommonResult.success(member);
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        String authCode = memberService.generateAuthCode(telephone);
        return CommonResult.success(authCode,"获取验证码成功");
    }

    @ApiOperation("修改密码")
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String password,
                                       @RequestParam String authCode) {
        memberService.updatePassword(telephone,password,authCode);
        return CommonResult.success(null,"密码修改成功");
    }

    @ApiOperation("获取会员信息")
    @RequestMapping(value = "/loadByUsername", method = RequestMethod.GET)
    @ResponseBody
    public UserDto loadUserByUsername(@RequestParam String username) {
        return memberService.loadUserByUsername(username);
    }


}

