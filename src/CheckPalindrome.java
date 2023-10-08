final class CheckPalindrome {


    boolean solution(String inputString) {


        String invertString = new StringBuilder(inputString).reverse().toString();
        System.out.println(invertString);

        if(invertString.equals(inputString)) {
            return true;
        }else {
            return false;
        }
    }
}
