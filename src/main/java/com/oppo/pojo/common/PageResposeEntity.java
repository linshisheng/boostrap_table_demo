package com.oppo.pojo.common;

import lombok.Data;

import java.util.List;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 16:06
 */
@Data
public class PageResposeEntity<T> {
    private List<T> resultList;
    private Long totalCount;

}
