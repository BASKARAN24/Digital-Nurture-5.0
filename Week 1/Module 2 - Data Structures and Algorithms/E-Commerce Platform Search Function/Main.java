import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Product[] products = {new Product(101,"Laptop","Electronics"),
                new Product(102,"Mobile","Electronics"),
                new Product(103,"Shoe","Fashion"),
                new Product(104,"Watch","Accessories")};
        Product result1 = linearSearch(products,104);
        Product result2 = binarySearch(products,104);
        System.out.println("Linear Search Result:");
        if (result1 != null) {
            System.out.println("ID: " + result1.productId);
            System.out.println("Name: " + result1.productName);
            System.out.println("Category: " + result1.category);
        } else {
            System.out.println("Product Not Found");
        }
        System.out.println("\nBinary Search Result:");
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.productId, p2.productId));
        if (result2 != null) {
            System.out.println("ID: " + result2.productId);
            System.out.println("Name: " + result2.productName);
            System.out.println("Category: " + result2.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
    public static Product linearSearch(Product[] products,int targetId){
        for(Product p : products){
            if(p.productId==targetId) return p;
        }
        return null;
    }
    public static Product binarySearch(Product[] products,int targetId){
        int left = 0;
        int right = products.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(products[mid].productId == targetId){
                return  products[mid];
            }
            else if(products[mid].productId > targetId){
                right = mid - 1;
            }
            else{
                left = mid +1;
            }
        }
        return null;
    }
}
class Product{
    int productId;
    String productName;
    String category;
    Product(int productId,String productName,String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}