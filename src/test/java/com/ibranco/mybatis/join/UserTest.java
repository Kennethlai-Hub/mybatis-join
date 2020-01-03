package com.ibranco.mybatis.join;

import com.ibranco.mybatis.join.domain.Role;
import com.ibranco.mybatis.join.domain.User;
import com.ibranco.mybatis.join.mapper.UserMapper;
import com.ibranco.mybatis.join.mapper.RoleMapper;
import com.ibranco.mybatis.join.vo.UserRole;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {
    private Logger logger = Logger.getLogger(UserTest.class);
    private InputStream inputStream;
    private SqlSession sqlSession;
    private UserMapper userDao;
    private RoleMapper roleDao;

    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession(true);
        userDao = sqlSession.getMapper(UserMapper.class);
        roleDao = sqlSession.getMapper(RoleMapper.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.close();
        inputStream.close();

    }
    @Test
    public void testFindAll() {
        List<User> userList = userDao.findAll();
        for (User user :userList){
            System.out.println(user);
            logger.info(user);
        }
    }
    @Test
    public void testFindAllRole() {
        List<Role> userList = roleDao.findAll();
        for (Role item :userList){
            logger.info(item);
        }
    }
    @Test
    public void testFindAllUserRole() {
        List<UserRole> userList = userDao.findAllUserRole();
        for (UserRole item :userList){
            logger.info(item);
        }
    }

}
