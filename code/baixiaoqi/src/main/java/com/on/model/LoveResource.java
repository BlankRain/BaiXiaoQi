package com.on.model;

/**
 * 爱心资源
 */
public interface LoveResource {
    /**
     * 奉献者
     */
    User getContributor();

    /**
     * 创建时间
     *
     * @return
     */
    long getCreatedTimestamp();

    /**
     * status
     */
    String status();
}
