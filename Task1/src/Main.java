import java.util.Scanner;

public class Main {
    public static final String CORRECT = " -абвгдеёжзийклмнопрстуфхцшщчъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
//        for (int i =0 ; i < CORRECT.length(); i++){
//            System.out.println(CORRECT.charAt(i) + " - " + (int)CORRECT.charAt(i));
//        }
        System.out.println("Введите Вашу фамилию имя и отчество!");
        String input = new Scanner(System.in).nextLine().trim();
        boolean valid = true;
        int count = 0;
       for (int i = 0; i < input.length(); i++) {
           if (!CORRECT.contains(String.valueOf(input.charAt(i)))) {
               valid = false;
               break;
           }
           if (input.charAt(i) == ' ') {
               count ++;
           }
       }
       if (valid  && count == 2) {

           System.out.println("Фамилия: " + input.substring(0, input.indexOf(' ')).trim() + "\nИмя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')).trim() + "\nОтчество: " + input.substring(input.lastIndexOf(' ')).trim());
       } else {
           System.out.println("Введённая строка не является ФИО!");
       }
    }
}