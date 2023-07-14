import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Animal> animalsList = new ArrayList<>();
        Counter counter = new Counter();
        try (Scanner scanner = new Scanner(System.in)){
            while (true){
                System.out.println("1. Добавить животное");
                System.out.println("2. Учить новыую команду");
                System.out.println("3. Получить список команд");
                System.out.println("4. Выход");
                System.out.print("Введите номер команды: ");
                int choice = scanner.nextInt();
                String lineForWriting ="";
                switch (choice) {
                    case 1:
                        counter.add();
                        System.out.println("Введите тип животного: ");
                        String type = scanner.next();
                        System.out.println("Введите имя животного: ");
                        String name = scanner.next();
                        System.out.println("Введите дату рождения (дд.мм.гггг): ");
                        SimpleDateFormat birthDay = new SimpleDateFormat(scanner.next());
                        // Animal animal;
                        switch (type) {
                            case "Dog":
                                animalsList.add(new Dog(name, type, birthDay));
                                break;
                            case "Cat":
                                animalsList.add(new Cat(name, type, birthDay));
                                break;
                        
                            default:
                                System.out.println("Таких животных мы не обслуживаем");
                                break;
                        }
                        try (FileWriter fw = new FileWriter("base.txt", true); 
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter out = new PrintWriter(bw)) { 
                            out.print(counter.getCount());
                            out.print(birthDay);
                            lineForWriting = " " + type + " " + name + " " + birthDay; 
                            out.print(lineForWriting);
                            bw.newLine();
                        }
                        break;
                
                    case 2:
                        break;    
                    default:
                        break;
                }

                


            }
            }
        }


  



    }



   



    

//             private String getAnimalType(Animal animal) {
//         if (animal instanceof Dog) {
//             return "Dog";
//         } else if (animal instanceof Cat) {
//             return "Cat";
//         // } else if (animal instanceof Hamster) {
//         //     return "Hamster";
//         // } else if (animal instanceof Horse) {
//         //     return "Horse";
//         // } else if (animal instanceof Camel) {
//         //     return "Camel";
//         // } else if (animal instanceof Donkey) {
//         //     return "Donkey";
//         }
//         return "";
//     }
    
//         public List<String> getCommands(Animal animal) {
//         List<String> commands = new ArrayList<>();
//         commands.add(animal.getCommand());
//         return commands;
// }

