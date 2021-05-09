package com.garood.java.practice.supplier;


import java.util.function.Supplier;

interface Test {
    void print();
}

class B implements Test {
    public void print() {
        System.out.println("Printing from Class B");
    }
}

class C implements Test {
    public void print() {
        System.out.println("Printing from Class C");
    }
}

class TestA {

    private Test test;


    public TestA(Supplier<Test> supp) {
        this.test = supp.get();
    }

    public Test getTest() {
        return test;
    }
}


public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Test> b = B::new;
        Supplier<Test> c = C::new;

        TestA testb = new TestA(b);
        TestA testc = new TestA(c);

        testb.getTest().print();
        testc.getTest().print();
    }


}
