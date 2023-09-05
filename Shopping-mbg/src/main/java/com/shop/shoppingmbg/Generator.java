package com.shop.shoppingmbg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class Generator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://10.1.8.34:3306/shopping?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&useSSL=false","root","123456")
                .globalConfig(builder -> {
                    builder.author("coca")
                            .fileOverride()
                            .outputDir("C:\\Users\\25304\\IdeaProjects\\Shopping\\Shopping-mbg\\src\\main\\java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.shop")
                            .moduleName("model");

                })
                .execute();
    }
}
