package com.betterjr.modules.wechat.data.api;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 关注者列表
 *
 * @author zhoucy
 */
public class FollowList {
    /**
     * 关注该公众账号的总用户数
     */
    private int total;
    /**
     * 拉取的OPENID个数,最大值为10000
     */
    private int count;
    /**
     * 列表数据,OPENID的列表
     */
    private List<String> openIds = new ArrayList<String>();
    /**
     * 拉取列表的后一个用户的OPENID
     */
    @JsonProperty(value = "next_openid")
    private String nextOpenId;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getOpenIds() {
        return openIds;
    }

    public void setOpenIds(List<String> openIds) {
        this.openIds = openIds;
    }

    public String getNextOpenId() {
        return nextOpenId;
    }

    public void setNextOpenId(String nextOpenId) {
        this.nextOpenId = nextOpenId;
    }

    @Override
    public String toString() {
        return "FollowList [total=" + total + ", count=" + count + ", openIds=" + openIds + ", nextOpenId=" + nextOpenId
                + "]";
    }

}
