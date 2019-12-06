package com.wzh.aovbputil.dto.result;


import com.github.pagehelper.Page;

import java.io.Serializable;

/**
 * 通用分页结果VO
 *
 * @author hzb
 * @version 2018年5月16日 下午4:35:09
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Integer total;   
    private Integer totalPage;
    private T rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageResult [total=" + total + ", totalPage=" + totalPage + ", rows=" + rows + "]";
    }
    
    public PageResult() {
    }

	public PageResult(Page<T> page) {
		this.total = (int)page.getTotal();
		this.totalPage = page.getPages();
		this.rows = (T) page.getResult();
	}
}
