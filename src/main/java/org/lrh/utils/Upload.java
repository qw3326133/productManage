package org.lrh.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;

import java.io.InputStream;

public class Upload {
    //oss的http路径
    private static String endpoint = "oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    private static String accessKeyId = "LTAI4GHhVUyzqrCTA9RNKMTL";
    private static String accessKeySecret = "JTpqc092dagzWv3jEMODOYjnvoyDJQ";
    private static String bucket = "yunxaingce";

    public static String uploadFile(InputStream is, String fileName){
        // 下载jar包
        //创建工具类
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //调用上传方法
        PutObjectResult putObjectResult = ossClient.putObject(bucket, fileName, is);
        //释放资源
        ossClient.shutdown();
        //返回文件的存储路径
        return "https://"+bucket+"."+endpoint+"/"+fileName;
    }
}
