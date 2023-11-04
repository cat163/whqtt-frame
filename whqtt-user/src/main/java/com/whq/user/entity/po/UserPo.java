package com.whq.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author: whq
 * @description:
 * @time: 2023/11/4 19:37
 */
@TableName("user")
@Data
public class UserPo {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @Version
    private Integer version;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
