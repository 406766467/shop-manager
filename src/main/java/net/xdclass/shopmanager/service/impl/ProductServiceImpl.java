package net.xdclass.shopmanager.service.impl;

import net.xdclass.shopmanager.model.ProductDO;
import net.xdclass.shopmanager.mapper.ProductMapper;
import net.xdclass.shopmanager.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zfh
 * @since 2021-01-25
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, ProductDO> implements ProductService {

}
