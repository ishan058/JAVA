public class Main {
    public static void main(String[] args) {
        //String only [Inmutable]
        String str = "Hello";
        String str2 = new String("Hello");
        str.toUpperCase();
        System.out.println(str == str2);  //check through address

        System.out.println(str.equals(str2)); //check the values

        System.out.println(str);
        
        //String buffer [Mutable]
        StringBuffer name = new StringBuffer("Noice");
        name.append("noice");  //this woll modify the Stringbuffer
        System.out.println(name);
    }
}