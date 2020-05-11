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
public class SysLog extends CommonModel implements Serializable {
    private String userName;
    private String operation;
    private String method;
    private String params;
    private Long time;
    private String ip;
    private String createBy;
    private Date createTime;
    private String lastUpdateBy;
    private Date lastUpdateTime;
    private String remarks;
    private static final long serialVersionUID = 8867441249493200916L;
}