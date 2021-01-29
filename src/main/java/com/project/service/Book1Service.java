package com.project.service;

import com.project.pojo.Book1;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wx
 * @since 2021-01-27
 */
public interface Book1Service extends IService<Book1> {

    List<Book1> get();
}
