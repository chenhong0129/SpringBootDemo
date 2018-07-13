package cn.ucmed.SpringBootDemo.httpTest;

import cn.ucmed.http.HttpClientPost;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.print.attribute.URISyntax;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by chenhong on 2018/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HttpClientTest {
    private static final Logger logger = Logger.getLogger(HttpClientTest.class);

    @Test
    public void getPost() throws URISyntaxException, IOException{
        String url = "http://test.wxmedpay.ucmed.cn/weixinmedpay/getmedinfo";
        String reqXml = "<xml>\n" +
                "<sub_openid>oweNkuJxtizSuvQxxR1gK-G1P8ws</sub_openid>\n" +
                "<name>鲍佳珍</name>\n" +
                "<idcard_md5>1abe31ad5ef369edb0342be6ec6419f3</idcard_md5>\n" +
                "<nonce_str>68264bdb65b97eeae6788aa3348e553c</nonce_str>\n" +
                "<sign>88BF8D3199F94B4A2D299158D7FB71C7</sign>\n" +
                "<biz_id>Xls5eb6O</biz_id>\n" +
                "</xml>";
        String res = HttpClientPost.sendPost(url, reqXml);
        logger.info("test http post: " + res);
    }
}
