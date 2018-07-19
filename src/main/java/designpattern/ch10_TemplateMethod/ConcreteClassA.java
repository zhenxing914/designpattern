package designpattern.ch10_TemplateMethod;

/**
 * Created by song on 2018/7/19.
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("concreteClassA operation1 is run .");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("concreteClassA opereation2 is run .");

    }
}
