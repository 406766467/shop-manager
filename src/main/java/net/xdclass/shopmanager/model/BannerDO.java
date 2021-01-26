package net.xdclass.shopmanager.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zfh
 * @since 2021-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("banner")
public class BannerDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 图片
     */
    private String img;

    /**
     * 跳转地址
     */
    private String url;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 0是未删除，1是已经删除
     */
    private Integer deleted;


}
