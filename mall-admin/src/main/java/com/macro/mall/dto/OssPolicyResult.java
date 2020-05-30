package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Get OSS Upload File Authorization Return Result
 * Created by macro on 2018/5/17.
 */
public class OssPolicyResult {
    @ApiModelProperty("User identity used in access authentication")
    private String accessKeyId;
    @ApiModelProperty("User Form Uploaded Policy, Base64 Encoded String")
    private String policy;
    @ApiModelProperty("String after signing policy")
    private String signature;
    @ApiModelProperty("Upload Folder Path Forward")
    private String dir;
    @ApiModelProperty("oss Access Domain")
    private String host;
    @ApiModelProperty("callback settings after upload success")
    private String callback;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
