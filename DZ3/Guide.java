
public class Guide {
    public static void main(String[] args) {

        int exit = 0;
        while (exit == 0) {
            
            String choice = View.prompt("Сделайте выбор (0 - создать новую запись, 1 - прочитать запись из файла, 2 - выход): ");
            switch (choice) {
                case "0":
                    String[] data = View.inputData();
                    String writeString = String.format("<%s><%s><%s><%s><%s><%s>\n", data[0], data[1], data[2], data[3], data[4], data[5]);
                    IOGuide.writeFile(data[0]+".txt", writeString);
                    break;
                case "1":
                    String name = View.name("11", "Введите фамилию для поиска: ");
                    System.out.println(name);
                    IOGuide.readFile(name+".txt");
                    break;
                case "2":
                    exit = 1;
                    break;
                default:
                    break;
            }

        }
    }
}
