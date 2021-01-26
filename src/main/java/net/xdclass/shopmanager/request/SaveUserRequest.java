package net.xdclass.shopmanager.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("新增用户请求模型")
@Data
public class SaveUserRequest {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "邮箱", required = true , example = "13888888888@qq.com")
    private String email;
    @ApiModelProperty(value = "手机号",required = false)
    private String phone;
    @ApiModelProperty(value = "姓名",required = false)
    private String name;
}
