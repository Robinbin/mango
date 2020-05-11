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
public class SysRole extends CommonModel implements Serializable {
    private String name;
    private String remark;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private Byte delFlag;
    private static final long serialVersionUID = -6305080865493188899L;
}