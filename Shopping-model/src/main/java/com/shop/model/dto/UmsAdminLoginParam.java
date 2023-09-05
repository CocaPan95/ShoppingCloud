package com.shop.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录参数
 * Created by macro on 2018/4/26.
 */
//@ApiModel("用户登录信息类")
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsAdminLoginParam {
    //@ApiModelProperty("用户名")
    //@NotEmpty
    private String username;

    //@ApiModelProperty("密码")
    //@NotEmpty
    private String password;
}
