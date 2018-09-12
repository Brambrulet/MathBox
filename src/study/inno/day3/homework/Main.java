package study.inno.day3.homework;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        try {
            ObjectBox vObjs = new ObjectBox();

            vObjs.addObject("asdf");
            vObjs.addObject("sdfg");
            vObjs.addObject(1.3f);
            vObjs.addObject(1.3d);
            vObjs.addObject(new Double(1.3d));
            vObjs.addObject(new BigDecimal("1.3"));
            vObjs.addObject(12);
            vObjs.addObject(new Integer(20));

            System.out.println("ObjectBox:");
            System.out.println(vObjs.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            MathBox vMaths = new MathBox(new Integer[]{1, 3, 7, 0});

            vMaths.addObject(1.3f);
            vMaths.addObject(1.3d);
            vMaths.addObject(new Double(1.3d));
            vMaths.addObject(new BigDecimal("1.3"));
            vMaths.addObject(12);
            vMaths.addObject(new Integer(20));

            System.out.println("MathBox:");
            System.out.println(vMaths.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
