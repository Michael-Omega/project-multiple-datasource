package com.project.service;

import com.project.pojo.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import com.project.pojo.Book1;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wx
 * @since 2021-01-27
 */
public interface BookService extends IService<Book> {

    List<Book> get();
}
