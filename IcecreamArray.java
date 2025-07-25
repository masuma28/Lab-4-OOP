import java.util.*;
public class IcecreamArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Icecream[] arr = new Icecream[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter type, company, price:");
            String type = input.nextLine();
            String company = input.nextLine();
            double price = input.nextDouble();
            input.nextLine(); // to handle nextLine() after double
            arr[i] = new Icecream(type, company, price);
        }

        // Print all objects
        for (Icecream i : arr) {
            System.out.println(i);
        }

        // Search by company
        System.out.print("Enter company name to search: ");
        String searchCompany = input.nextLine();
        searchByCompany(arr, searchCompany);
    }

    public static void searchByCompany(Icecream[] arr, String company) {
        boolean found = false;
        for (Icecream i : arr) {
            if (i.getIcecreamCompany().equalsIgnoreCase(company)) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found)
            System.out.println("No ice cream found from this company.");
    }
}

