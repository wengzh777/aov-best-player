package com.wzh.aovbputil.dto.result;

/**
 * @author hzb
 * @version 0.1.0
 * @date 2018年5月15日 上午10:29:44
 */
public enum ResultCodeEnum {


    /**
     * 000000I_成功
     */
    SUCCESS("000000I", "成功"),
    /**
     * "999999E", "系统异常"
     */
    ERROR("999999E", "系统异常"),
    /**
     * "888888E","用户未登陆"
     */
    NO_LOGIN("888888E", "用户未登陆"),
    /**
     * 接口已过期
     */
    DEPRECATED("999999D", "接口已过期"),

    /**
     * 参数传入异常
     */
    PARAM_ERROR("E00400", "参数传入异常：400"),
    /**
     * 请求类型错误
     */
    METHOD_TYPE_ERROR("E00405", "请求方式错误：405"),
    /**
     * 请求类型错误,spring 415
     */
    MEDIA_TYPE_ERROR("E00415", "请求类型错误：415"),

    SMS_CODE_CANNOT_SEND("E00901", "1分钟内只能发送1次验证码"),
    SMS_CODE_NOT_EXIST("E00902", "验证码不存在"),
    SMS_CODE_CHECK_COUNT_EXCEED("E00903", "验证码超过校验次数"),
    SMS_CODE_TIMEOUT("E00904", "验证码超过有效时间"),
    SMS_CODE_ERROR("E00905", "验证码错误"),
    SMS_CODE_SEND_COUNT_EXCEED("E00906", "超过发送次数，请隔天再试"),
    /**
     * "E20001","文件不存在"
     */
    FILE_NOT_EXIST("E20001", "文件不存在"),
    /**
     * "E20002", "文件类型错误"
     */
    FILE_TYPE_ERROR("E20002", "文件类型错误"),
    /**
     * "E20003", "excel数据错误"
     */
    EXCEL_DATA_ERROR("E20003", "excel数据错误"),

    /**
     * "E10001","用户不存在"
     */
    USERNAME_NOT_FOUND("E10001", "用户不存在"),
    /**
     * "E10002","权限错误"
     */
    ACCESS_DENIED("E10002", "权限错误"),
    /**
     * "E10003", "用户名密码错误"
     */
    USERNAME_PASSWORD_INVALID("E10003", "用户名或密码错误"),
    /**
     * "E10004","网点不存在"
     */
    WD_NOT_FOUND("E10004", "网点不存在"),
    /**
     * "E10005","你已绑定改网点，请使用切换功能"
     */
    HAS_BIND_THIS_STORE("E10005", "你已绑定该网点，请到首页使用切换功能"),
    /**
     * "E10006","绑定信息不存在"
     */
    BIND_HISTORY_NOT_FOUND("E10006", "绑定信息不存在"),
    /**
     * "E10007","网点已存在"
     */
    STORE_CODE_EXIST("E10007", "网点已存在"),

    /**
     * "300001E", "查无举报信息"
     */
    NONE_OF_REPORT_QUERY("300001E", "查无举报信息"),
    /**
     * "E000001","用户不存在"
     */
    USER_NOT_FOUND("E000001", "用户不存在"),
    /**
     * "E000005","管理员不存在"
     */
    ADMIN_NOT_FOUND("E000005", "管理员不存在"),

    /**
     * "E200001","项目已有相同网点工单"
     */
    PROJECT_EXIST_STORE_CODE("E100011", "项目已有相同网点工单"),

    /**
     * "E10012","批量处理内勤工单只能操作存在的网点"
     */
    CANT_OPERATE_WD_NOT_FOUND("E100012", "批量处理内勤工单只能操作存在的网点"),
    REPLY_DENY("E40003", "您不是该消息的接收者"),
    LINK_INVALID("E404", "链接已失效"),

    NO_REPORT_DATA("E50001","钉钉日志数据为空"),
    /**
     * "S50001","存在已经创建工单的网点号，跟进结果会自动合并"
     */
    WORK_ORDER_EXIST("S50001", "存在已经创建工单的网点号，跟进结果会自动合并"), ONAME_NOT_FOUND("E400404", "专管员不存在");;

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private ResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private ResultCodeEnum() {
    }

}
