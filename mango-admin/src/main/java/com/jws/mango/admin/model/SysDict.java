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
public class SysDict extends CommonModel implements Serializable {

    private static final long serialVersionUID = 8937823259564896797L;
    private String value;
    private String label;
    private String type;
    private String description;
    private Long sort;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private String remarks;
    private Byte delFlag;
}