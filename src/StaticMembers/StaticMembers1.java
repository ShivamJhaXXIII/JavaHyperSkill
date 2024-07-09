package StaticMembers;

public class StaticMembers1 {

    public static void main(String[] args) {
        // write your code using the existing class StaticMembers.ConstantsAndUtilities
        //StaticMembers.ConstantsAndUtilities constants = new StaticMembers.ConstantsAndUtilities();  // Static members can be accessed using class name therefore there is no need to create instance of the class

        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilities.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));

    }

}

// Don't change this class
class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}
