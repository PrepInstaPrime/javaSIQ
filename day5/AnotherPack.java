package pack2;

import pack1.AccessModifier;

public class AnotherPack extends AccessModifier {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        AnotherPack obj1= new AnotherPack();
        obj.publicData();
        obj1.protectedData();
        // obj1.defaultData();
        obj.privateData();
    }
}
