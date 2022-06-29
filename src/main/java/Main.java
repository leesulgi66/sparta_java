import pkg.ModifierTest;

class Child extends ModifierTest{
    void callParentProtected() {
        System.out.println("call my parent's protected method");
        super.messageProtected();
    }
}

public class Main {
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
        Child child = new Child();
        child.callParentProtected();
    }
}