package com.mypro.srb.oss.service;

import java.io.InputStream;

/**
 * @ProjectName: srb
 * @Package: com.mypro.srb.oss.service
 * @ClassName: FileService
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/7 20:43
 * @Version: 1.0
 */
public interface FileService {
    /**
     * 文件上传至阿里云
     */
    String upload(InputStream inputStream, String module, String fileName);

    /**
     * 根据路径删除文件
     * @param url
     */
    void removeFile(String url);


}
