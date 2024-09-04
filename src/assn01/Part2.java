package assn01;

public class Part2  {
    public static void main(String[] args) {
        // Since a short is 2 bits, meaning 16 bytes. We calculate its max to be 2^15 - 1, with the first digit would imply negativity
        short sh = 32767;
        System.out.println(sh);
    }
}
