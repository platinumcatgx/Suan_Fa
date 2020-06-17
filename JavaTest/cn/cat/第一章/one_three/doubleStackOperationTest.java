package cn.cat.第一章.one_three;

import junit.framework.TestCase;

public class doubleStackOperationTest extends TestCase {
    public DoubleStackOperation d = new DoubleStackOperation();

    public void testOperation() {
        d.Operation("3+5*12+(5/3)");
    }
}