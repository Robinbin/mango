package com.jws.mango.core.page;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class PageRequest {
    private int pageNum = 1;

    private int pageSize = 10;

    private Map<String, Object> params = new HashMap<String, Object>();
}
