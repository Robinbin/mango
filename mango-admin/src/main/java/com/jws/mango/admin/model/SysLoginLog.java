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
public class SysLoginLog extends CommonModel implements Serializable {
    private String userName;
    private String status;
    private String ip;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private String remarks;
    private static final long serialVersionUID = -8681628871441425179L;
}