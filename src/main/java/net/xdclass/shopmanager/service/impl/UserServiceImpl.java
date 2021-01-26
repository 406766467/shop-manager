package net.xdclass.shopmanager.service.impl;

import net.xdclass.shopmanager.model.UserDO;
import net.xdclass.shopmanager.mapper.UserMapper;
import net.xdclass.shopmanager.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
