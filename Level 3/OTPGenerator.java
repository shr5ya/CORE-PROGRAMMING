import java.util.*;

public class OTPGenerator {

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));
        System.out.println("Are OTPs Unique: " + areOTPsUnique(otpArray));
    }

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) return false;
        }
        return true;
    }
}
