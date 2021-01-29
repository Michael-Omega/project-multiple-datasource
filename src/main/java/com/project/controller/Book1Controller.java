package com.project.controller;


import com.project.service.Book1Service;
import com.project.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wx
 * @since 2021-01-27
 */
@RestController
@RequestMapping("/book1")
public class Book1Controller {

    @Resource
    private Book1Service book1Service;

    @RequestMapping("/get")
    public void get(){
        System.out.println(book1Service.get());
    }

}

