package study.inno.day3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class MathBox extends ObjectBox {

    public MathBox(Integer[] aValues) throws Exception {
        super(new TreeSet<>(Comparator.comparingDouble(value -> ((Number) value).doubleValue())));
        fValues.addAll(Arrays.asList(aValues));

        if (fValues.size() != aValues.length) throw new Exception("input array contains duplicates");
    }

    public double summator() {
        double vResult = 0.0d;

        for (Object i : fValues) {
            vResult += ((Number) i).doubleValue();
        }

        return vResult;
    }

    public ArrayList<Double> splitter(Integer aSplitter) {
        if (aSplitter == 0) throw new ArithmeticException("dont try divide by zero.");

        ArrayList<Double> vResult = new ArrayList<>();

        for (Object i : fValues) {
            vResult.add(((Number) i).doubleValue() / aSplitter);
        }

        return vResult;
    }

    @Override
    public int hashCode() {
        return fValues.hashCode();
    }

    @Override
    public boolean equals(Object aObj) {
        return (this == aObj) || (aObj instanceof MathBox && this.fValues.equals(((MathBox) aObj).fValues));
    }

    @Override
    public void addObject(Object aObj) throws Exception {
        if (aObj instanceof Number) super.addObject(aObj);
        else throw new Exception("Input item not instance of Number.");
    }

    @Override
    public void deleteObject(Object aObj) {
        if (aObj instanceof Number) {
            fValues.remove(aObj);
        }
    }
}
