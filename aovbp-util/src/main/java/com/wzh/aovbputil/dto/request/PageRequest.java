package com.wzh.aovbputil.dto.request;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 分页请求参数类
 *
 * @author hzb
 * @version 2018年5月16日 下午4:35:09
 */

public class PageRequest {


    @NotNull(message = "页码不能为空")
    @Min(message = "页码必须大于等于1", value = 1)
    private Integer pageNo;
    @NotNull(message = "页大小不能为空")
    @Min(message = "页大小必须大于等于1", value = 1)
    @Max(message = "页大小必须小于等于200", value = 200)
    private Integer pageSize;
    @Pattern(regexp = "^(\\w| |,)*$", message = "排序：'字段 asc/desc',只允许字母数字下划线空格")
    private String order;

    public Integer getPageNo() {
        if (pageNo == null || pageNo <= 1) {
            return 1;
        }
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        if (pageSize == null) {
            return 10;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "PageRequest [pageNo=" + pageNo + ", pageSize=" + pageSize
                + ", order=" + order + "]";
    }
}
