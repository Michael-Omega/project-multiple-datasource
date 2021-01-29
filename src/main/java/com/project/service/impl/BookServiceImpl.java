package com.project.service.impl;

import com.project.pojo.Book;
import com.project.mapper.BookMapper;
import com.project.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wx
 * @since 2021-01-27
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> get() {
        return bookMapper.selectList(null);
    }
}
