import cn.hutool.crypto.digest.otp.TOTP;
public class FunctionUse8601 {
public void funcUse() {
TOTP totp = new TOTP();
totp.generateGoogleSecretKey(null,null);
}
}