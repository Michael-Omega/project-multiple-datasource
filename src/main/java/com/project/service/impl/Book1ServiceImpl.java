package com.project.service.impl;

import com.project.pojo.Book1;
import com.project.mapper.Book1Mapper;
import com.project.service.Book1Service;
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
public class Book1ServiceImpl extends ServiceImpl<Book1Mapper, Book1> implements Book1Service {

    @Resource
    private Book1Mapper book1Mapper;

    @Override
    public List<Book1> get() {
        return book1Mapper.selectList(null);
    }
}
