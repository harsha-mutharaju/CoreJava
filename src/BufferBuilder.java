public class BufferBuilder {

    public static void main(String[] args) {
        // buffer - thread safe

        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb);


        // builder - not thread safe

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello World");
        System.out.println(sb1);


    }
}
