package isPalindrome;
//??????????????????????????????????????????????
public class isPalindrome{
    public static void main(String []args) {
        //System.out.println(isPalindrome(123454321));
        isPalindrome(123454321);
    }
    public static boolean isPalindrome(int x) {
        System.out.println("x:"+x);

        int temp=0;
        while(x!=0){
            temp=temp*10+x%10;
            x=x/10;
            System.out.println(temp);
        }
        System.out.println("temp："+temp);
        if(x!=temp){
            System.out.println("false");
            return false;
        }else {
            System.out.println("true");
            return false;
        }
    }
}