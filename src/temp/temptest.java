package temp;

public class temptest {
    public static void main(String[] args) {
        String str1=Integer.toBinaryString(4);
        System.out.println(str1);
        StringBuffer sb = new StringBuffer();
        sb.append("asdfg");
        // 打印当前的容量(理论值)
        System.out.println(sb.capacity());// 16
        // 打印长度(实际值)
        System.out.println(sb.length());// 0
        // 打印内容

        System.out.println(sb.toString());

        StringBuffer str=new StringBuffer();
        str.append("hello world");
        int spacenum=0;
        int length=str.toString().length();
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' '){
                spacenum++;
            }
        }
        int oldindex=length-1;
        int newindex=length+spacenum*2-1;
        str.setLength(newindex+1);
        while(oldindex>=0){
            char c=str.charAt(oldindex);
            if(c==' '){
                str.setCharAt(newindex--,'0');
                str.setCharAt(newindex--,'2');
                str.setCharAt(newindex--,'%');
            }else{
                str.setCharAt(newindex,c);
                if(newindex>0){
                    newindex--;
                }
            }
            oldindex--;
        }
        System.out.println(str.toString());
        //return str.toString();


    }
}
