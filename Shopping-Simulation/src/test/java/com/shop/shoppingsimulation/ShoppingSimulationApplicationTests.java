package com.shop.shoppingsimulation;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.model.dto.PmsProductCategoryNode;
import com.shop.model.entity.PmsProduct;
import com.shop.shoppingsimulation.Product.ProductTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShoppingSimulationApplicationTests {

    @Test
    void contextLoads() {
        ProductTest test=new ProductTest();
        List<PmsProductCategoryNode> pmsProductCategoryNodes = test.categoryTreeList();
        Page<PmsProduct> search = test.search("","","",1,20,1);
    }

}
