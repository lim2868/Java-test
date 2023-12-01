package sec01_accessmodifier.Ex01_AccesssModifierOfMember;

import sec01_accessmodifier.Ex01_AccesssModifierOfMember.pack1.A;
import sec01_accessmodifier.Ex01_AccesssModifierOfMember.pack1.B;
import sec01_accessmodifier.Ex01_AccesssModifierOfMember.pack2.C;
import sec01_accessmodifier.Ex01_AccesssModifierOfMember.pack2.D;

public class AccessModifierOfMember {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		a.print();
		b.print();
		c.print();
		d.print();
	}

}
