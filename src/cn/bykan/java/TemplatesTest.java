package cn.bykan.java;

import java.util.ArrayList;

/**
 * @author bykan
 * @create 2019-06-20 11:07
 */
public class TemplatesTest {
    public static void main(String[] args) {

        System.out.println("hello");

        System.out.println("args = [" + args + "]");

        System.out.println("TemplatesTest.main");

        int num=10;
        System.out.println("num = " + num);

        System.out.println(num);

        String[] arr = new String[]{"tom","jerry"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String ss : arr) {
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println();
        }

        ArrayList list = new ArrayList();
        list.add(12);

        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {

        }
        if (list != null) {

        }

        if (list == null) {

        }
        if (list != null) {

        }






    }



}
