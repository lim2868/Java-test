package sec01_accessmodifier.Ex01_AccesssModifierOfMember.pack2;

import sec01_accessmodifier.Ex01_AccesssModifierOfMember.pack1.A;

public class D extends A {
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
//		System.out.print(a.c + " ");
//		System.out.print(a.d + " ");
		System.out.println();

  }
}