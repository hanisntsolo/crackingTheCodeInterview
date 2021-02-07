package dhirendra.february08;
//Very important question
// 72 to 77 are left to cover and are
// part of IO/NIO

public class ByteArrayToHex {
    public static void main(String[] args) {
        byte[] bytes = {10, 15, 3, 5,16,85};
        for(byte b:bytes) {
            System.out.format("%02x",b);
            System.out.print(',');
        }
    }
}
