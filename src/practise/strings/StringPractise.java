package practise.strings;

public class StringPractise {

    public static void main(String[] args) {
//		System.out.println("hello");
//
//		String a="hello";
//		System.out.println(a);
//		System.out.println(a.length());

//		String a="ABCDEFG";
//		String b= a.substring(2);
//		System.out.println(b);
//		String c=a.substring(1,3);
//		System.out.println(c);
//		String d=a.substring(0,2);
//		System.out.println(d);

//		String a="hello";
//		if(a=="hello") {
//			//DON'T DO THIS. THIS IS A TRAP
//		}
//
//		if(a.equals("hello")) {
//			System.out.println("True");
//			//THIS IS THE RIGHT METHOD
//		}
//		if(a.equalsIgnoreCase("HELLO")) {
//			System.out.println("this is also true");
//		}
//		System.out.println(a.charAt(4));

        String str="Hello there yogi there";
        //indexof methodu, parantez icersiinde gecen kelimeyi ilk hangi indexte basladigini gosterir.
        int a=str.indexOf("there");  //String ornegi oldugu icin indexof(string)'i sectik
        System.out.println(a);
        int b=str.indexOf("there", 7);
        System.out.println(b);
    }
}
