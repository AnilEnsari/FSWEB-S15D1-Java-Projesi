import java.util.*;

public class changeArray {
    public static void addItems(List<String> groceryList, String fruit) {
        if (fruit.contains(",")) {
            List<String> splitedFruits = new ArrayList<>(Arrays.asList(fruit.split(",")));
            for(String splitedFruit : splitedFruits){
                if(  checkItemsIsInList(groceryList,splitedFruit)) {
                    System.out.println("Bu meyve zaten eklenmiş!");
                }else {
                    groceryList.add(splitedFruit);
                    printSorted(groceryList);

                }


            }

        } else {
            if(  checkItemsIsInList(groceryList,fruit)) {
                System.out.println("Bu meyve zaten eklenmiş!");
            }else {
                groceryList.add(fruit);
                printSorted(groceryList);

            }

        }

    }


    public static void removeItems(List<String> groceryList, String fruit) {

        if (fruit.contains(",")) {
            List<String> splitedFruits = new ArrayList<>(Arrays.asList(fruit.split(",")));
            for(String splitedFruit : splitedFruits){
                if(  checkItemsIsInList(groceryList,fruit)) {
                    groceryList.remove(fruit);
                }else {

                    System.out.println("Böyle bir meyve zaten bulunamadı!");
                }


            }

        } else {
            if(  checkItemsIsInList(groceryList,fruit)) {
                groceryList.remove(fruit);
            }else {

                System.out.println("Böyle bir meyve zaten bulunamadı!");
            }
        }
        printSorted(groceryList);


    }
    public static boolean checkItemsIsInList(List<String> groceryList, String fruit){
        return groceryList.contains(fruit);


    }

    public static void printSorted(List<String> groceryList) {
        Collections.sort(groceryList);
        System.out.println("GroceryList : " + groceryList);
    }

    public static void changeArray() {
        List<String> groceryList = new LinkedList<>();
        boolean setChangeArray = true;
        while (setChangeArray) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen 0 ,1 veya 2 değeri giriniz");
            int input = scanner.nextInt();
            switch (input) {

                case 0:
                    System.out.println("Uygulama Sonlandırıldı.");
                    setChangeArray = false;
                    break;
                case 1:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Lütfen eklemek istediğiniz meyveleri giriniz.");
                    String fruit = scanner.next();
                    addItems(groceryList, fruit);
                    break;
                case 2:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Lütfen çıkarmak istediğiniz meyveleri giriniz.");
                    String fruit2 = scanner.next();
                    removeItems(groceryList, fruit2);
                    break;
                default:

                    System.out.println("Böyle bir değer bulunamadı.");


            }
        }
    }

}
