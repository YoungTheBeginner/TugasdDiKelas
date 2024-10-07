import java.util.Scanner;

public class Discount2 {
    
public static void main(String[] args) {
    double totalBayar, totalBelanja,discount;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Total belanja: ");
    totalBayar = sc.nextDouble();

    if (totalBayar > 200000) {
        discount = totalBayar * 0.14;
    }
    else if (totalBayar >100000) {
        discount = totalBayar * 0.10; 
    }
    else if (totalBayar >50000) {
        discount = totalBayar * 0.05;
    }
    else {
        discount = 0.0;
    }

    totalBayar = totalBayar - discount;
    System.out.print("Total bayar: "+totalBayar);
    System.out.print("Discount: "+discount);
    System.out.print("Total bayar: "+totalBayar);

    sc.close();
}}


//     System.out.print("Total yang harus dibayar adalah: "+totalBayar);
//     sc.close();
// }
// }
