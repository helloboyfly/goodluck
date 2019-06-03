package algorithm;

public class CompareVersionNumbers {

    public static int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\."); //通过\\将.进行转义
        String[] s2 = version2.split("\\.");
        int len1 = s1.length;
        int len2 = s2.length;
        int i, j;
        for (i = 0, j = 0; i < len1 && j < len2; i++, j++) {
            if (Integer.parseInt(s1[i]) > Integer.parseInt(s2[j])) {
                return 1;
            } else if (Integer.parseInt(s1[i]) < Integer.parseInt(s2[j])) {
                return -1;
            }
        }
        while (i < len1) {
            if (Integer.parseInt(s1[i]) != 0) {
                return 1;
            }
            i++;
        }
        while (j < len2) {
            if (Integer.parseInt(s2[j]) != 0) {
                return -1;
            }
            j++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int ret = compareVersion("1.2.0", "1.2.001");
        System.out.println(ret);
    }
}