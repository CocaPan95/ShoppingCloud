package com.shop.portal.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前台商品管理Controller
 * Created by macro on 2020/4/6.
 */
@Controller
@Api(tags = "PmsPortalProductController", description = "前台商品管理")
@RequestMapping("/product")
public class PmsProductController {
}
