import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertEquals;

public class demo {
    SoftAssert softAssert = new SoftAssert();

    public static void sortListArrays(List<String> list1) {

        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    @Test
    public void TC_01() {
        System.out.println("Step1");
        String name = "huong";
        System.out.println("Step2");
        verifyEqual(name, "Huong");
        System.out.println("Step3");
        name = "API tessting";
        System.out.println("Step4");
        verifyEqual(name, "UI Testing");
    }

    public boolean verifyEqual(Object actual, Object expected) {
        boolean pass = true;
        try {
            assertEquals(actual, expected);

        } catch (Throwable e) {
            e.printStackTrace();
            pass = false;

        }
        return pass;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("M");
        list.add("F");
        list.add("K");

//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                System.out.println(list);
//                System.out.println(o1 + ":" + o2 + " = "  + o1.compareToIgnoreCase(o2));
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                System.out.println(list);
//                System.out.println(o1 + ":" + o2 + " = "  + o1.compareToIgnoreCase(o2));
//                return o2.compareToIgnoreCase(o1);
//            }
//        });

        list.sort(String::compareTo);
        System.out.println(list);
    }
//    public int compare(String o1, String o2){
//
//        return o2.compareToIgnoreCase(o1);
//    }}
}