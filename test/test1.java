import com.theoldzheng.jdbcTemplate.Service.BookService;
import com.theoldzheng.jdbcTemplate.entity.book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.25 21:26
 */
public class test1 {
    @Test
    public void test01() {
//        Class[] clazz = {com.theoldzheng.jdbcTemplate.ConfigClass.class};
        ApplicationContext context = new ClassPathXmlApplicationContext("hello1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        book book = new book("7", "张三", "空闲");

//        int result = bookService.add(book);
//        int result = bookService.updateBook(book);

//        int result = bookService.delete(5);
//        System.out.println(result + " 条数据被操作成功");

//        Integer integer = bookService.selectForCount();
//        System.out.println(integer);
//
//        com.theoldzheng.jdbcTemplate.entity.book book1 = bookService.selectForObject(7);
//        System.out.println(book1);
//
//        List<com.theoldzheng.jdbcTemplate.entity.book> books = bookService.selectForList();
//        System.out.println(books);

//        List<Object []> list = new ArrayList<>();
//        Object [] o1 = {"1","Tom","FREE"};
//        Object [] o2 = {"2","Jerry","FREE"};
//        Object [] o3 = {"3","David","BUSY"};
//        Object [] o4 = {"4","Amy","BUSY"};
//
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        list.add(o4);
//        bookService.batchAdd(list);
    }

    @Test
    public void test02(){



    }
}
