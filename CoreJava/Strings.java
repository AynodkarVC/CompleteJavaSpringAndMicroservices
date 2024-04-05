package clases.CoreJava;
public class Strings {
    public static void main(String[] args){
        String name = "Vishal";
        String surname = "Aynodkar";
        System.out.println(name);

// StringBuffer
        
        StringBuffer sb = new StringBuffer("Vishal");
        int cap = sb.capacity();
        System.out.println(cap);
        sb.append(" Aynodkar");
        sb.insert(0, " Mr.");
        sb.setLength(30);
    }
}