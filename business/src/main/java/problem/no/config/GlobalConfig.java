package problem.no.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by chengfj on 2017/10/23.
 * @author chengfj
 */
@Component
public class GlobalConfig {

    @Value("${aliyun.oss.displayUrl}")
    public String aliyunOssDisplayUrl;

    @Value("${aliyun.oss.accessKey}")
    public String ossAccessKey;

    @Value("${aliyun.oss.secret}")
    public String ossAccessSecret;

    @Value("${aliyun.oss.endPoint}")
    public String ossEndPoint;

    @Value("${config.openRegister}")
    public Boolean openRegister;

}
