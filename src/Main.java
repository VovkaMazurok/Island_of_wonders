import Organism.Characteristics;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) throws JsonProcessingException, FileNotFoundException {
        System.out.println("Hello world!");
        readJsonFile();

    }

    public static void readJsonFile() throws JsonProcessingException, FileNotFoundException {
        String path = "src/Parameters/Characteristics_of_animals.json";

//        Gson gson = new Gson();
//        try (FileReader reader = new FileReader(path)) {
//            Map<Type, ?> map = gson.fromJson(reader, Map.class);
//            for (Map.Entry<Type, ?> entry : map.entrySet()) {
//                System.out.println(entry.getKey() + ": " + entry.getValue());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Gson gson = new Gson();
        ExecutorService executor = Executors.newFixedThreadPool(5); // створюємо пул з 5 потоків

        try (FileReader reader = new FileReader(path)) {
            Map<String, Characteristics> map = gson.fromJson(reader, new TypeToken<Map<String, Characteristics>>(){}.getType());

            for (Map.Entry<String, Characteristics> entry : map.entrySet()) {
                executor.submit(() -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // завершуємо роботу пулу потоків
        }
    }

}

