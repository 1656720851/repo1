package com.bean;

import java.util.List;
import java.util.Map;

/**
 * @Date 2022/3/5 - 上午 10:06
 */
public class QueryVo {

    /**
     *    普通封装、user指定封装、list集合封装。map集合封装
     */
    private String keyword;
    private User user;
    private List<User> userList;
    private Map<String, User> userMap;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "keyword='" + keyword + '\'' +
                ", user=" + user +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }
}
