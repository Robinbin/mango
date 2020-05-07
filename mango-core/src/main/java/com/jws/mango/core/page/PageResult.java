package com.jws.mango.core.page;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PageResult {
    private int pageNum;

    private int pageSize;

    private long totalSize;

    private int totalPages;

    private List<?> contents;

}
