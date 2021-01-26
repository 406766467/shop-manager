package net.xdclass.shopmanager.service.impl;

import net.xdclass.shopmanager.model.ProductOrderDO;
import net.xdclass.shopmanager.mapper.ProductOrderMapper;
import net.xdclass.shopmanager.service.ProductOrderService;
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
public class ProductOrderServiceImpl extends ServiceImpl<ProductOrderMapper, ProductOrderDO> implements ProductOrderService {

}
