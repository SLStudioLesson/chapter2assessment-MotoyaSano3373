import ui.RecipeUI;
import data.RecipeFileHandler;

public class App {
    public static void main(String[] args) {
        RecipeUI ui = new RecipeUI();
        ui.displayMenu();
        
    }
}


// `recipes.txt`ファイルからレシピデータを読み込み、コンソールに一覧表示する機能をステップに従い作成してください。



// ### ステップ1：プログラムの設計

// 以下のメソッドは、既に指定されたファイル内に、処理が実装されていない形で用意されています。  
// 各メソッドについて「説明」をもとに、メソッドが行う処理を読み解いてください。  
// 読み解いた処理は、既に用意されているメソッド内部に、コメントアウトを仕様して記述してください。

// `src/main/java/data/RecipeFileHandler.java` 

// | メソッド名    | 戻り値の型     | 引数 | 送信される例外 | 説明                                                         |
// | ------------- | -------------- | ---- | -------------- | ------------------------------------------------------------ |
// | `readRecipes` | `ArrayList<String>` | なし | なし | `recipes.txt`からレシピデータを読み込み、それをリスト形式で返します。 <br> IOExceptionが発生したときは`Error reading file: 例外のメッセージ`とコンソールに表示します。 |



// `src/main/java/ui/RecipeUI.java` 

// | メソッド名       | 戻り値の型 | 引数 | 送信される例外 | 説明                                                         |
// | ---------------- | ---------- | ---- | -------------- | ------------------------------------------------------------ |
// | `displayRecipes` | `void`     | なし | なし | `RecipeFileHandler`から読み込んだレシピデータを整形してコンソールに表示します。<br> 読み込んだレシピデータが空の場合は、 `No recipes available.` というメッセージを出力します。 |

// - 表示形式は以下の出力例を再現すること

// ```
// Main Menu:
// 1: Display Recipes
// 2: Add New Recipe
// 3: Search Recipe
// 4: Exit Application
// Please choose an option: 1

// Recipes:
// -----------------------------------
// Recipe Name: Tomato Soup
// Main Ingredients: Tomatoes, Onion, Garlic, Vegetable Stock
// -----------------------------------
// Recipe Name: Chicken Curry
// Main Ingredients: Chicken, Curry Powder, Onion, Garlic, Ginger
// -----------------------------------
// Recipe Name: Beef Stew
// Main Ingredients: Beef, Potatoes, Carrots, Onion, Beef Stock
// -----------------------------------

// 以下省略
// ```