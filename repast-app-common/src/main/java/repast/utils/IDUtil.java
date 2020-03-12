package repast.utils;

import java.util.UUID;


/**
 * @author Administrator
 */
public class IDUtil {

    public static String getUUID(){
        // hfdjh321-fjk-32141312-43jf--->导致在mysql数据库中无法查询数据
        // 必须要把"-"去掉
        return UUID.randomUUID().toString().replace("-","");
    }

}
