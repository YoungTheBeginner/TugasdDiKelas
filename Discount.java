import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
    
    Double totalBayar;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan total belanja: ");
    totalBayar = sc.nextDouble();

    if (totalBayar > 50000) {
        totalBayar -=10000;
    }
    else 
    totalBayar -=3000;
        
    }


System.out.print("Total yang harus dibayar: "+totalBayar);
sc.close();
        }    
