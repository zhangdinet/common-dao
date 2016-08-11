package com.zhangdinet;

import com.zhangdinet.dao.UserDOMapper;
import com.zhangdinet.domain.UserDO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.util.List;

/**
 * Main测试类
 *
 * User: zhangdinet
 * Date: 2016-08-11 14:06
 */
public class MainTest {

    static Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args){
        try{
            Reader reader = Resources.getResourceAsReader("MapperCOnfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserDOMapper userDOMapper = sqlSession.getMapper(UserDOMapper.class);
            List<UserDO> userDOList = userDOMapper.selectAll();
            int a=10;
            a++;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
