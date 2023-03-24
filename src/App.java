import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Lesson> lessonList = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da " + i + "a aula: ");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Título: ");
            String title = sc.nextLine();
            if (type == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.next();
                System.out.print("Duração em segundos: ");
                int secs = sc.nextInt();
                lessonList.add(new Video(title, url, secs));
            }
            if (type == 't') {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int quant = sc.nextInt();
                lessonList.add(new Task(title, description, quant));
            }
        }

        System.out.println();
        int sum = 0;
        for (Lesson lesson : lessonList) {
            sum += lesson.duration();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");

        sc.close();
    }
}