package com.zhangdinet;

import com.zhangdinet.dao.UserDOMapper;
import com.zhangdinet.domain.UserDO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
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

    public static void testMybatis(){
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

    public static void testXpath(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("D:/zhangdi/project/common-dao/src/test/resources/books.xml");

            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();
            XPathExpression xPathExpression = xPath.compile("//book[author='Neal Stephenson']/title/text()");

            Object object = xPathExpression.evaluate(document, XPathConstants.NODESET);
            NodeList nodeList = (NodeList)object;
            for(int i=0;i<nodeList.getLength();i++){
                System.out.println(nodeList.item(i).getNodeValue());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        testMybatis();
        //testXpath();
    }
}
