public class stringbuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("My name is Antima");
        sb.append(" Pareek");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.toString()); // convert back the stringbuffer into string
    }
}
