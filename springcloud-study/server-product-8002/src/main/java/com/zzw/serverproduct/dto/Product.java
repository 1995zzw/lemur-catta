package com.zzw.serverproduct.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@TableName("product")
public class Product extends Model<Product> implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Integer count;
    private Date lastUpdateTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
