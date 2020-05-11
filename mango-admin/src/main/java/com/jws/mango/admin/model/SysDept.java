package com.jws.mango.admin.model;

import com.jws.mango.core.model.CommonModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
public class SysDept extends CommonModel implements Serializable {
    private String name;
    private Long parentId;
    private Integer orderNum;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private Byte delFlag;
    private static final long serialVersionUID = -349052237923604120L;
}