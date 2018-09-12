package study.inno.day3.homework;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectBox {
    protected Collection<Object> fValues;

    public ObjectBox() {
        this.fValues = new ArrayList<Object>();
    }

    public ObjectBox(Collection<Object> aValues) {
        this.fValues = aValues;
    }

    public void addObject(Object aObj) throws Exception {
        fValues.add(aObj);
    }

    public void deleteObject(Object aObj) {
        fValues.remove(aObj);
    }

    public String dump() {
        return this.toString();
    }

    @Override
    public String toString() {
        return fValues.toString();
    }
}
