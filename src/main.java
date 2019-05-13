import pojo.FBI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 TAG1：");
        String tag1 = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入TAG2：");
        String tag2 = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("请输入TAG3：");
        String tag3 = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("请输入TAG4：");
        String tag4 = scanner4.nextLine();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("请输入TAG5：");
        String tag5 = scanner.nextLine();

        List<String> inputTag = new ArrayList<>();
        //1 2 3 4 5
        //1
        inputTag.add(tag1);
        inputTag.add(tag2);
        inputTag.add(tag3);
        inputTag.add(tag4);
        inputTag.add(tag5);
        //2
        inputTag.add(tag1+tag2);
        inputTag.add(tag1+tag3);
        inputTag.add(tag1+tag4);
        inputTag.add(tag1+tag5);
        inputTag.add(tag2+tag3);
        inputTag.add(tag2+tag4);
        inputTag.add(tag2+tag5);
        inputTag.add(tag3+tag4);
        inputTag.add(tag3+tag5);
        inputTag.add(tag4+tag5);
        //4
        inputTag.add(tag1+tag2+tag3+tag4);
        inputTag.add(tag1+tag2+tag3+tag5);
        inputTag.add(tag1+tag2+tag4+tag5);
        inputTag.add(tag1+tag3+tag4+tag5);
        inputTag.add(tag2+tag3+tag4+tag5);
        //5
        inputTag.add(tag1+tag2+tag3+tag4+tag5);







        FBI fbiInit = new FBI();
        Map<String,Object> map= fbiInit.FBI();
        for (String key : map.keySet()){
            List<String> initFBI2 = new ArrayList<>();
            if (key.equals(tag1)) {
                initFBI2 = (List<String>) map.get(key);
                for (String a : initFBI2) {
                    for(String tagBuffer:inputTag){
                        Boolean flag = newEquals(tagBuffer,a);
                        if (flag==true){
                            System.out.println("符合条件:"+tagBuffer);
                        }
                    }
                }
            }
            else if (key.equals(tag2)) {
                initFBI2 = (List<String>) map.get(key);
                for (String a : initFBI2) {
                    for(String tagBuffer:inputTag){
                        Boolean flag = newEquals(tagBuffer,a);
                        if (flag==true){
                            System.out.println("符合条件:"+tagBuffer);
                        }
                    }
                }
            }
            else if (key.equals(tag3)) {
                initFBI2 = (List<String>) map.get(key);
                for (String a : initFBI2) {
                    for(String tagBuffer:inputTag){
                        Boolean flag = newEquals(tagBuffer,a);
                        if (flag==true){
                            System.out.println("符合条件:"+tagBuffer);
                        }
                    }
                }
            }
            else if (key.equals(tag4)) {
                initFBI2 = (List<String>) map.get(key);
                for (String a : initFBI2) {
                    for(String tagBuffer:inputTag){
                        Boolean flag = newEquals(tagBuffer,a);
                        if (flag==true){
                            System.out.println("符合条件:"+tagBuffer);
                        }
                    }
                }
            }
            else if (key.equals(tag5)) {
                initFBI2 = (List<String>) map.get(key);
                for (String a : initFBI2) {
                    for(String tagBuffer:inputTag){
                        Boolean flag = newEquals(tagBuffer,a);
                        if (flag==true){
                            System.out.println("符合条件:"+tagBuffer);
                        }
                    }
                }
            }
            else
                System.out.println("没有符合条件的");

        }
    }
    public static boolean newEquals(String str1,String str2) {

        if(str1.length()!=str2.length()) {

            return false;

        }//首先判断两个串的长度

        while(str1.length()!=0) {

            char c=str1.charAt(0);

            str1=str1.replaceAll(String.valueOf(c),"");

            str2=str2.replaceAll(String.valueOf(c),"");//始终删除第一个串的第一个字符

            if(str1.length()!=str2.length()) {//比较删除后的串长度，不同则return false；

                return false;

            }

        }

        return true;

    }
}
