package com.theoldzheng.jdbcTemplate.DAO;

import com.theoldzheng.jdbcTemplate.entity.book;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.25 19:58
 */
public interface DAO {
    /**
     * 接口定义增加操作供实现类实现
     *
     * @param book
     * @return
     */
    int add(book book);

    int updateBook(book book);

    int delete(Integer id);

    Integer selectCount();

    book selectObject(Integer id);

    List<book> selectList();

    void batchBookAdd(List<Object []> bookList);
}