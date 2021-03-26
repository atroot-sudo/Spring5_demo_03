package com.theoldzheng.jdbcTemplate.Service;

import com.theoldzheng.jdbcTemplate.DAO.DAO;
import com.theoldzheng.jdbcTemplate.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: BookService  Service层 调用DAO层对数据库进行操作
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.25 20:23
 */
@Service(value = "bookService")
public class BookService {
    @Autowired
    private DAO bookDAO;

    /**
     * 实现对book数据库的增加操作
     *
     * @param book 需要传入一个book实例
     * @return 返回一个整型参数 表示影响到的数据库的记录条数
     */
    public int add(book book) {
        int result = bookDAO.add(book);
        return result;
    }

    /**
     * 修改信息
     *
     * @param book 传入要更改的信息的book对象
     * @return 返回操作结果(影响的记录数)
     */
    public int updateBook(book book) {
        int result = bookDAO.updateBook(book);
        return result;

    }

    /**
     * 删除操作
     *
     * @param id 指定要删除的id
     * @return 返回操作的结果(影响的行数)
     */
    public int delete(Integer id) {
        int result = bookDAO.delete(id);
        return result;
    }

    /**
     * 查询记录数
     *
     * @return 返回记录数
     */
    public Integer selectForCount() {
        Integer integer = bookDAO.selectCount();
        return integer;
    }

    /**
     * 查询指定id的book对象
     *
     * @param id 需要指定的id
     * @return 返回一个book对象
     */
    public book selectForObject(Integer id) {
        book book = bookDAO.selectObject(id);
        return book;
    }

    /**
     * 查询所有的数据库信息
     *
     * @return 返回所有信息的list集合
     */
    public List<book> selectForList() {
        List<book> books = bookDAO.selectList();
        return books;
    }

    /**
     * 批量增加操作
     * @param bookList
     */
    public void batchAdd(List<Object []>  bookList){
        bookDAO.batchBookAdd(bookList);

    }

}
