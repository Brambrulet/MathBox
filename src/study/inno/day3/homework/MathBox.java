package study.inno.day3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class MathBox extends ObjectBox {

//    private int fHashCode;
//    private boolean fHashCodeCalculated;

//    private void calcHashCode(){
//        fHashCode = Objects.hash(fValues);
//        fHashCodeCalculated = true;
//    }
//
//    private void clearHashCode(){
//        fHashCodeCalculated = false;
//    }

    public MathBox(Integer[] aValues) throws Exception {
        super(new TreeSet<Object>((aFirst, aSecond) -> Double.compare(((Number) aFirst).doubleValue(), ((Number) aSecond).doubleValue())));
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
//        if(!fHashCodeCalculated)calcHashCode();

//        return fHashCode;
    }

    @Override
    public boolean equals(Object aObj) {
        if (this == aObj) return true;
        else if (!(aObj instanceof MathBox)) return false;
        else {
//            MathBox vObj = (MathBox) aObj;

//            if(fHashCodeCalculated && vObj.fHashCodeCalculated && fHashCode != vObj.fHashCode)return false;
//            else return this.fValues.equals(vObj.fValues);
            this.fValues.equals(((MathBox) aObj).fValues);
        }
    }

    @Override
    public void addObject(Object aObj) throws Exception {
        if (aObj instanceof Number) super.addObject(aObj);
        else throw new Exception("Input item not instance of Number.");
    }

    @Override
    public void deleteObject(Object aObj) {
        if (aObj instanceof Number) {
            fValues.remove((Number) aObj);
        }
    }
}
