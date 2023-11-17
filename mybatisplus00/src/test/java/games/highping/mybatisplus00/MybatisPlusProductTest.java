package games.highping.mybatisplus00;

import games.highping.mybatisplus00.bean.Product;
import games.highping.mybatisplus00.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisPlusProductTest {

    @Autowired
    private ProductMapper productMapper;

    @Test
    void testProduct() {
        Product productx = productMapper.selectById(1L);
        System.out.println("x查询的价格为" + productx.getPrice());
        Product producty = productMapper.selectById(1L);
        System.out.println("y查询的价格为" + producty.getPrice());
        productx.setPrice(productx.getPrice() + 60);
        productMapper.updateById(productx);
        producty.setPrice(producty.getPrice() - 40);
        int result = productMapper.updateById(producty);
        if (result == 0) {
            Product product = productMapper.selectById(1L);
            product.setPrice(product.getPrice() - 40);
            productMapper.updateById(product);
        }
        Product productz = productMapper.selectById(1L);
        System.out.println("z查询的价格为" + productz.getPrice());
    }

}
