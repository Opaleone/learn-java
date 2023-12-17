class DataType {
  public static void main(String[] args) {
    char letter = 'a';
    String name = "Leone";
    byte age = 26;
    int num = 1_983_939;
    Long bigNum = 4_985_383_394L;
    double big = 0.9883839920303;
    float small = 0.98F;
    boolean oldEnough = age > 18;

    System.out.printf("Char: %s\nName: %s\nAge: %s\nNumber: %s\nBig Number: %s\nBig Decimal: %s\nSmall Decimal: %s\nBoolean: %s\n", letter, name, age, num, bigNum, big, small, oldEnough);

    return;
  }
}