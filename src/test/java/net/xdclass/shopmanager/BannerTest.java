package net.xdclass.shopmanager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.writer.UpdaterMapper;
import net.xdclass.shopmanager.mapper.BannerMapper;
import net.xdclass.shopmanager.model.BannerDO;
import net.xdclass.shopmanager.service.BannerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
public class BannerTest {

    @Autowired
    private BannerService bannerService;

    @Autowired
    private BannerMapper bannerMapper;

   @Test
   public void testDeleteByMap(){
       Map<String,Object> map = new HashMap<>();
       map.put("img","aa");
       map.put("url","bb");
       int i = bannerMapper.deleteByMap(map);
       log.info("row:{}",i);
   }

    @Test
    public void testInsertBanner(){
        BannerDO bannerDO = new BannerDO();
//        bannerDO.setImgUrl("imgxxxxxxxxxx");
        bannerDO.setUrl("urlxxxxxxxxxx");
        bannerMapper.insert(bannerDO);
        log.info("bannerDO:{}",bannerDO);
    }

    @Test
    public void testSelectCount(){
        Integer integer = bannerMapper.selectCount(new QueryWrapper<BannerDO>());
        log.info("bannerDONumber:{}",integer);
    }

    @Test
    public void testSelectOne(){
        BannerDO bannerDO = bannerMapper.selectOne(new QueryWrapper<BannerDO>().eq("id", 1));
        log.info("bannerDO:{}",bannerDO);
    }

    @Test
    public void testSelectBatchIds(){
        List<BannerDO> bannerDOS = bannerMapper.selectBatchIds(Arrays.asList(1, 2));
        log.info("bannerDOs:{}",bannerDOS);
    }

    @Test
    public void testSelectBannerById(){
        BannerDO bannerDO = bannerMapper.selectById(1);
        log.info("bannerDO:{}",bannerDO);
    }

    @Test
    public void testBannerList(){
        List<BannerDO> list = bannerService.list();
        log.info("轮播图列表:{}",list);
    }

    @Test
    public void testUpdate(){
       BannerDO banner = new BannerDO();
       banner.setUrl("www.baidu.com");
        int id = bannerMapper.update(banner, new QueryWrapper<BannerDO>().eq("id", 6).eq("weight",8));
        log.info("更新{}条数据",id);
    }

    @Test
    public void testupdateWrapper(){

        UpdateWrapper<BannerDO> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("url","zfhvip.top");
        updateWrapper.set("weight",19);
        updateWrapper.eq("id",6).like("img","c");
        int id = bannerMapper.update(null,updateWrapper);
        log.info("更新{}条数据",id);
    }


    @Test
    public void testQueryWrapper(){
       QueryWrapper<BannerDO> queryWrapper = new QueryWrapper<>();
       queryWrapper.between("weight",18,20);
       BannerDO bannerDO = bannerMapper.selectOne(queryWrapper);
       log.info("banner:{}",bannerDO);
    }

    @Test
    public void testPage(){
       QueryWrapper<BannerDO> queryWrapper = new QueryWrapper<>();
        Page<BannerDO> page = new Page<>(1,3);
        IPage<BannerDO> iPage =  bannerMapper.selectPage(page, queryWrapper.select("id,img"));
        log.info("总条数：{}",iPage.getTotal());
        log.info("总页数：{}",iPage.getPages());
        log.info("总数据：{}",iPage.getRecords());
    }

    @Test
    public void testListByMySelf(){
//        List<BannerDO> bannerDOS = bannerMapper.listByMySelf();
//        log.info("数据：{}",bannerDOS);
    }

    @Test
    public void testActiveRecord(){
       BannerDO bannerDO = new BannerDO();
//        List<BannerDO> bannerDOS = bannerDO.selectList(new QueryWrapper<>());
//        log.info("数据：{}",bannerDOS);
    }

    @Test
    public void testOptimisticLocker(){
       BannerDO bannerDO = new BannerDO();
       bannerDO.setId(1);
       bannerDO.setUrl("test.com");
       bannerDO.setVersion(1);
       bannerMapper.updateById(bannerDO);
    }

    @Test
    public void testDeleteById(){
       bannerMapper.deleteById(6);
    }
}
