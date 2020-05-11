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
public class SysMenu extends CommonModel implements Serializable {
    private String name;
    private Long parentId;
    private String url;
    private String perms;
    private Integer type;
    private String icon;
    private Integer orderNum;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private Byte delFlag;
    private static final long serialVersionUID = 1343385060135826842L;
}