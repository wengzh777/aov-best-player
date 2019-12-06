package com.wzh.aovbputil.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 分页搜索参数
 * @author hzb
 * @version 2019-3-13 13:35
 */

public class PageSearchRequest extends PageRequest {

    
    private String keyWords;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    public String getKeyWords() {
        if(keyWords != null && keyWords.trim().length() > 0){
            return "%"+keyWords+"%";
        }
        return null;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "PageSearchRequest{" +
                "keyWords='" + keyWords + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                "} " + super.toString();
    }
}
