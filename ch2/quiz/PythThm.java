package ch2.quiz;

class PythThm {
  public static void main(String[] args) {
    double a = 3;
    double b = 4;
    double c;

    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    StringBuilder out = new StringBuilder();

    out.append("`a` is equal to ");
    out.append(a);
    out.append(", `b` is equal to ");
    out.append(b);
    out.append(", and `c` is equal to ");
    out.append(c);
    out.append(".");

    System.out.println(out.toString());
  }
}
