package entity;

public class StatusCode {
    public static final int OK = 20000;//成功
    private static final int LOGINERROR = 20002;//用户名或密码错误
    private static final int ERROR = 20001;//失败
    private static final int ACCESSERROR = 20003;//权限不足
    private static final int REMOTEERROR = 20004;//远程调用失败
    private static final int REPERROR = 20005;//重复操作
    private static final int TEST_CODE= 0000;
}
