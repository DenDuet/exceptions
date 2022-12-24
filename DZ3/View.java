
import java.util.Scanner;

public class View {
    public static String[] inputData() {

                String dataLine = prompt("Введите данные в строку через пробел " +
                        "(Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона(1234567890) пол(m или f)): ");
                System.out.println("Введена строка: " + dataLine);
                String[] data = dataLine.split(" ");
                if (data.length != 6) {
                    System.out.println("Данные введены неверно!");
                    String dataErr = "_ _ _ _ _ _";
                    data = dataErr.split(" ");
                } else {
                    System.out.println("Введенные данные: ");
                }

                data[0] = name(data[0], "Введите фамилию: ");
                System.out.println("Фамилия: " + data[0]);

                data[1] = name(data[1], "Введите имя: ");
                System.out.println("Имя: " + data[1]);

                data[2] = name(data[2], "Введите отчество: ");
                System.out.println("Отчество: " + data[2]);

                data[3] = dateFormat(data[3]);
                System.out.println("Дата рождения: " + data[3]);

                data[4] = tlfNumber(data[4]);
                System.out.println("Номер телефона: " + data[4]);

                data[5] = gender(data[5]);
                System.out.println("Пол: " + data[5]);

                return data;
    }

    public static String name(String name, String message) {
        int exit=0;
        while (exit==0) {
            char[] charArray = name.toCharArray();
            for (int i = 0; i < name.length(); i++) {
                if (!(charArray[i] == '-' || (charArray[i] >= 'A' && charArray[i] <= 'Z') || (charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'А' && charArray[i] <= 'Я') || (charArray[i] >= 'а' && charArray[i] <= 'я'))) {
                    name = prompt(message);
                    exit=0;
                    break;
                } else {
                    exit=1;
                }
            }
            if (exit==1) return String.format("%s%s", name.substring(0, 1).toUpperCase(), name.substring(1));

        }
        return name;
    }
    public static String gender(String gender) {
        while (true) {
            if (gender.equals("f") || gender.equals("m")) {
                return gender;
            } else {
                gender=prompt("Введите пол (f или m): ");
            }
        }
    }
    public static String tlfNumber(String tlfNumber) {
        while (true) {
            try {
                Integer tlf = Integer.parseInt(tlfNumber);
                if ((tlf>0) && (tlf < 99999999)) {
                    return String.format("%d", tlf);
                } else {
                    tlfNumber = prompt("Введите номер телефона (только цифры не более 8): ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный номер телефона введен!");
                tlfNumber = prompt("Введите номер телефона (только цифры не более 8): ");
            }
        }
//        return "0";
    }
    public static String dateFormat(String date) {
            String[] dateParse = date.split("\\.");
            while (dateParse.length!=3) {
                System.out.println("Неверный формат даты! ");
                date = prompt("Введите дату в формате dd.mm.yyyy: ");
                dateParse = date.split("\\.");
            }
            int dd = promptInt(dateParse[0],"Введите день рождения (1-31): ", 1, 31);
            int mm = promptInt(dateParse[1],"Введите месяц рождения (1-12): ", 1, 12);
            int yyyy = promptInt(dateParse[2],"Введите год рождения (1900-2050): ", 1900, 2050);

            return String.format("%d.%d.%d", dd, mm, yyyy);
        }


    private static int promptInt(String date, String message, int start, int end) {

            try {
                Integer dateParse = Integer.parseInt(date);
                while (true) {
                    if ((dateParse < start) || (dateParse > end)) {
                        dateParse = Integer.parseInt(prompt(message));
                    } else {
                        return dateParse;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильные данные введены!");
            }
            return 0;
       }

    public static String prompt(String message) {
        System.out.println(message);
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine();
        return str;

    }
}
