package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * oss callback result of upload file
 * Created by macro on 2018/5/17.
 */
public class OssCallbackResult {
    @ApiModelProperty("File Name")
    private String filename;
    @ApiModelProperty("File Size")
    private String size;
    @ApiModelProperty("mimeType of file")
    private String mimeType;
    @ApiModelProperty("width of image file")
    private String width;
    @ApiModelProperty("High of image files")
    private String height;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
