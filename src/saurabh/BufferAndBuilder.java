package saurabh;

public class BufferAndBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Velocity");
		sb.append("Katraj");
		System.out.println(sb);
        String a = "WakeUp";
        String b = "Saurabh kshirsagar patil";
        
        StringBuilder s =new StringBuilder(a);
        s.reverse();
        System.out.println(s);
        StringBuilder sk =new StringBuilder(b);
sk.indexOf(b, 6);
        System.out.println(sk);

	}

}
