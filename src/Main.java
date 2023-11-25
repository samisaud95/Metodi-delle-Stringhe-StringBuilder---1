public class Main {
public static void main(String[] args) {

    String stringa1 = "Le due stringhe sono uguali";
    String stringa2 = "Le due stringue sono differenti";

    StringBuilder stringa3 = new StringBuilder();
    stringa3.append(stringa1).append(stringa2);

    System.out.println(stringa3.toString());
}

}