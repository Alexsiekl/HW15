import java.util.Scanner;

public class Main {
    public static final String CORRECT = " абвгдеёжзийклмнопрстуфхцшщчъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        for (int i =0 ; i < CORRECT.length(); i++){
            System.out.println(CORRECT.charAt(i) + " - " + (int)CORRECT.charAt(i));
        }
//        String input = new Scanner(System.in).nextLine().trim();
//        boolean valid = true;
//       for (int i = 0; i < input.length(); i++) {
//           if (!CORRECT.contains(String.valueOf(input.charAt(i)))) {
//               valid = false;
//               break;
//           }//todo код писать тут
//       }
//       if (valid) {
//           System.out.println(input);
//       } else {
//           System.out.println("Введённая строка не корректна!");
//       }
    }
}