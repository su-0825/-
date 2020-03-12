package repast.base;

import lombok.Data;

import java.io.Serializable;

/**
 *    实际开发工作中所有的项目实现的都是ajax
 *      Java代码需要返回给前端ajax的时候--->code(状态码)，msg(返回状态消息)，detail(对返回状态消息的解释)，
 *      data(所要返回的数据:有可能返回List，Map，User，Integer，Long，Boolean)
 *
 * @author Administrator*/
@Data
public class ResultData<T> implements Serializable {

    private String code;
    private String msg;
    private String detail;
    private T data;

}
