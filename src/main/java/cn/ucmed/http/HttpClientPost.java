package cn.ucmed.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by chenhong on 2018/5/7.
 */
public class HttpClientPost {
    private static final Logger logger = Logger.getLogger(HttpClientPost.class);

    public static String sendPost(String url, String reqXml) throws IOException,URISyntaxException{
        logger.info("send url = " + url + "&send param = " + reqXml);
        try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault()){
            URI uri = new URI(url);
            HttpPost httpPost = new HttpPost(uri);
            httpPost.addHeader("Content-Type", "text/html");
            httpPost.setEntity(new StringEntity(reqXml, "UTF-8"));
            ResponseHandler<String> responseHandler = httpResponse -> {
                StatusLine statusLine = httpResponse.getStatusLine();
                HttpEntity httpEntity = httpResponse.getEntity();
                if (statusLine.getStatusCode() >=300){
                    throw new HttpResponseException(
                            statusLine.getStatusCode(),
                            statusLine.getReasonPhrase());
                }
                if (httpEntity == null){
                    throw new ClientProtocolException("Response contains no content");
                }
                String ret = EntityUtils.toString(httpEntity, "UTF-8");
                logger.info("httppost response: " + ret);
                return ret;
            };
            String ret = closeableHttpClient.execute(httpPost, responseHandler);
            logger.info("httppost response: " + ret);
            return ret;
        }
    }
}
