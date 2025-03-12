package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.App;

import data.RecipeFileHandler;

public class RecipeUI {
    private BufferedReader reader;
    private RecipeFileHandler fileHandler;

    public RecipeUI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        fileHandler = new RecipeFileHandler();
    }

    public RecipeUI(BufferedReader reader, RecipeFileHandler fileHandler) {
        this.reader = reader;
        this.fileHandler = fileHandler;
    }

    public void displayMenu() {
        while (true) {
            try {
                System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: Display Recipes");
                System.out.println("2: Add New Recipe");
                System.out.println("3: Search Recipe");
                System.out.println("4: Exit Application");
                System.out.print("Please choose an option: ");

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        // 設問1: 一覧表示機能
                        displayRecipes();
                        break;
                    case "2":
                        // 設問2: 新規登録機能
                        addNewRecipe();
                        break;
                    case "3":
                        // 設問3: 検索機能
                        break;
                    case "4":
                        System.out.println("Exit the application.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error reading input from user: " + e.getMessage());
            }
        }
    }

    /**
     * 設問1: 一覧表示機能
     * RecipeFileHandlerから読み込んだレシピデータを整形してコンソールに表示します。
     */
    private void displayRecipes() {
        recipe.readRecipes();
        for(Recipe recipes : recipe){
            System.out.println(recipes);
        }


    }

    /**
     * 設問2: 新規登録機能
     * ユーザーからレシピ名と主な材料を入力させ、RecipeFileHandlerを使用してrecipes.txtに新しいレシピを追加します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    private void addNewRecipe() throws IOException {
        ArrayList<String> cooking = readDataFromFile();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("レシピ名を入力してください: ");
        String recipe = reader.readLine();
        System.out.print("材料を入力してください: 終了するには 'end' と入力してください。");
        String ingredient = reader.readLine();
        // while (true) {
        //     System.out.print("材料を入力してください: 終了するには 'end' と入力してください。");
        //     ingredient = reader.readLine();
            if (ingredient.equalsIgnoreCase("end")) {
                break;
            }
            cooking.add(recipe + "," + ingredient);
        // }
        writeDataToFile(cooking);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("recipes.txt", true))) {
            writer.write(writeDataToFile());
            writer.newLine();
            System.out.println("Recipe added successfully.");
        } catch (IOException e) {
            System.out.println("ファイル操作エラー: " + e.getMessage());
        }
        readAndDisplayCustomerInfo("recipes.txt");

        System.out.println("レシピ名:");
        for (Recipes cookings : cooking) {
            System.out.println(recipe);
        }
    }


    /**
     * 設問3: 検索機能
     * ユーザーから検索クエリを入力させ、そのクエリに基づいてレシピを検索し、一致するレシピをコンソールに表示します。
     *
     * @throws java.io.IOException 入出力が受け付けられない
     */
    private void searchRecipe() throws IOException {

    }

}

