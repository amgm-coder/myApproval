package com.xixi.approval.myapproval.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


/**
 * @author xixi
 */
@Data
@TableName("TEST")
public class TestEntity extends BaseEntity implements Serializable {

    @TableId(value = "ID", type = IdType.ID_WORKER_STR)
    @TableField("ID")
    private String id;


    /**
     * 版本
     */
    @TableField("VERSION")
    private Integer version;
}
