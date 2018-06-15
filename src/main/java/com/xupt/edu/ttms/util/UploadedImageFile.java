package com.xupt.edu.ttms.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: zhaowanyue
 * @date: 2018/6/4
 * @description:
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
