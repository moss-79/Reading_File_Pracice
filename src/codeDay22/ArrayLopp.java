package codeDay22;

public class ArrayLopp {
    public static void main(String[] args) {

        byte [] data = new byte[4];
        data[0]=12;
        data[1]=14;
        data[2]=16;
        data[3]=18;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        int elementCount = data.length;
        for (int i = 0; i < elementCount; i++) {
            System.out.println("i = " + i);
            System.out.println(data[i]);

        }

    }
}
