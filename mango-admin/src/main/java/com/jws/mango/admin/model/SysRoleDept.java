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
public class SysRoleDept extends CommonModel implements Serializable {
    private Long userId;
    private Long deptId;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private static final long serialVersionUID = -3653504881412041212L;
}