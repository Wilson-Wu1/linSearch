import java.util.Scanner;
public class linSearch {

    public static int[] createArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("How big is your array?");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("What are your " + size+ " elements?");
        for(int i=0;i<size;i++){
            int element = input.nextInt();
            array[i] = element;
            System.out.println(array[i]);
        }
        return array;
    }

    public static boolean search(int find, int[] array){
        for(int j = 0; j<array.length; j++){
            if(array[j] == find ){
                System.out.println("Found the number at position " +j );
                System.out.println("It took " + (j+1) +" iterations to find your number!");
                return true;
            }

        }
        System.out.println("Your value does not exist in the array");
        return false;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        linSearch newSearch = new linSearch();
        int[] newArray = newSearch.createArray();
        System.out.println("What value do you want to search for?");
        int lookup = input.nextInt();
        boolean found = newSearch.search(lookup, newArray);
        while(found == false){
            System.out.println("Please Try Again!");
            System.out.println("What value do you want to search for?");
            lookup = input.nextInt();
            found = newSearch.search(lookup, newArray);

        }
    }
}