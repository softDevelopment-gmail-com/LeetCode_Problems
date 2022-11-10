package uz.leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleString {

    public static void main(String[] args) {

        //"codeleet"
        //[4,5,6,7,0,2,1,3]
        int [] indexes={4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",indexes));


    }

    public static String restoreString(String s, int[] indices) {
        List<String> list = new LinkedList<>(Arrays.asList(s.split("")));
        for (int i=1;i<=s.length();i++){
            list.set(indices[i-1],s.substring(i-1,i));
        }
        return String.join("", list);
    }
}
