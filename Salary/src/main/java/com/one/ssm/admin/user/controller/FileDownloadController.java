package com.one.ssm.admin.user.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;

@Controller
public class FileDownloadController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request,
                                               String filename) throws Exception {
        // 指定要下载的⽂件所在路径
        String path = request.getServletContext().getRealPath("/upload/");
        // 创建该⽂件对象
        File file = new File(path + File.separator + filename);
        // 对⽂件名编码，防⽌中⽂⽂件乱码
        filename = this.getFilename(request, filename);
        // 设置响应头
        HttpHeaders headers = new HttpHeaders();
        // 通知浏览器以下载的⽅式打开⽂件
        headers.setContentDispositionFormData("attachment", filename);
        // 定义以流的形式下载返回⽂件数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        // 使⽤Sring MVC框架的ResponseEntity对象封装返回下载数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
    }
    /*
     * 根据浏览器的不同进⾏编码设置，返回编码后的⽂件名
     */

    public String getFilename(HttpServletRequest request, String filename) throws Exception {
        // IE不同版本User-Agent中出现的关键词
        String[] IEBrowserKeyWords = {"MSIE", "Trident", "Edge"};
        // 获取请求头代理信息
        String userAgent = request.getHeader("User-Agent");
        for (String keyWord : IEBrowserKeyWords) {
            if (userAgent.contains(keyWord)) {
                //IE内核浏览器，统⼀为UTF-8编码显示
                return URLEncoder.encode(filename, "UTF-8");
            }
        }
        //⽕狐等其它浏览器统⼀为ISO-8859-1编码显示
        return new String(filename.getBytes("UTF-8"), "ISO-8859-1");
    }

}


