package repast.base;

import org.springframework.stereotype.Controller;

import static repast.status.LoginStatus.*;


/**
 * @author Administrator
 */
@Controller
public class BaseController {

    /**
     *      登陆成功，使用系统消息
    **/
    protected ResultData success() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }

    /**
     *      登陆成功，自定义返回消息
    **/
    protected ResultData success(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     *      登陆成功，自定义解释说明
    **/
    protected ResultData success(String msg, String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     *      登陆成功，使用系统消息，自定义返回值
    **/
    protected ResultData success(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登陆成功，自定义消息，自定义返回值
    **/
    protected ResultData success(String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登陆成功，自定义解释说明，返回数据
    **/
    protected ResultData success(String msg, String detail, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setDetail(detail);
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登陆失败，使用系统消息
    **/
    protected ResultData failed() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return resultData;
    }

    /**
     *        登录失败，使用自定义返回消息
     ***/
    protected ResultData failed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     *      登录失败，自定义解释说明
     ***/
    protected ResultData failed(String msg , String detail){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(msg);
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     *      登录失败，使用系统信息，自定义返回值
     ***/
    protected ResultData failed(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登录失败，自定义消息，自定义返回值
     ***/
    protected ResultData failed(String msg , Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登录失败，自定义解释说明，返回数据
     ***/
    protected ResultData failed(String msg , String detail , Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(msg);
        resultData.setDetail(detail);
        resultData.setData(data);
        return resultData;
    }


}
