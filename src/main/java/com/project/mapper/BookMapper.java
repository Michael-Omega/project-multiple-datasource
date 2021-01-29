package com.project.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.project.pojo.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wx
 * @since 2021-01-27
 */
@DS("db1")
public interface BookMapper extends BaseMapper<Book> {

}
