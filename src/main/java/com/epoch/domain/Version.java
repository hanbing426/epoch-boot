package com.epoch.domain;

import lombok.Data;

@Data
public class Version {
    private String version;      // 版本号
    private String downloadUrl;  // 下载地址
    private String description; // 更新说明
    private boolean forceUpdate; // 是否强制更新
}
