package org.javacourse.part3;

public class AsciiCharSequence implements CharSequence{

    private final byte[] bytes;

    public byte[] getBytes() {
        return bytes;
    }

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {

        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        byte[] subBytes = new byte[end - start + 1];

        for (int i = 0; i < subBytes.length; i++) {
            subBytes[i] = bytes[start + i];
        }

        return new AsciiCharSequence(subBytes);
    }

    @Override
    public String toString() {

        return new String(bytes);
    }
}
