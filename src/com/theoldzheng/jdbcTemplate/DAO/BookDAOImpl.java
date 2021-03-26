package com.theoldzheng.jdbcTemplate.DAO;

import com.theoldzheng.jdbcTemplate.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Description:实现类 实现DAO中的add方法
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.25 19:58
 */
@Repository(value = "bookDAOImpl")
public class BookDAOImpl implements DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 实现对数据库book表的增加操作
     * @param book 需要传入一个book对象实例
     * @return  返回影响的参数
     */
    @Override
    public int add(book book) {
        String id = book.getId();
        String name = book.getName();
        String bstatus = book.getBstatus();

        String sql = "insert into book value (?,?,?)";
        int update = jdbcTemplate.update(sql, id, name, bstatus);
        return update;
    }

    /**
     * 实现对数据库表book的修改操作
     * @return 返回影响的行数
     */
    @Override
    public int updateBook(book book) {
        String id = book.getId();
        String name = book.getName();
        String bstatus = book.getBstatus();
        String sql = "UPDATE book  SET name = ? , bstatus = ?  where id = ?";
        int result = jdbcTemplate.update(sql, name, bstatus, id);
        return result;
    }

    @Override
    public int delete(Integer id) {
        String sql = "DELETE FROM book WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public Integer selectCount() {
        String sql = "SELECT COUNT(*) FROM book ";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public book selectObject(Integer id) {
        String sql = "select * from book where id = ?";
        book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<book>(book.class),id);

        return book;
    }

    @Override
    public  List<book> selectList() {
        String sql = "select * from book";
        List <book> lists = jdbcTemplate.query(sql, new BeanPropertyRowMapper<book>(book.class));
        return lists;
    }

    @Override
    public void batchBookAdd(List<Object []> bookList) {
        String sql = "insert into book value (?,?,?)";
        jdbcTemplate.batchUpdate(sql, bookList);
    }
}
