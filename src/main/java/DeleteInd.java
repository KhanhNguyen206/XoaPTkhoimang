import java.util.Scanner;

public class DeleteInd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int[] arr1= new int[9];

        System.out.println("Nhập vào đây index muốn xóa: ");
        Scanner scanner= new Scanner(System.in);

        int ind=scanner.nextInt();

        for (int i=0; i<arr1.length; i++){
            if(i<ind) {
                arr1[i] = arr[i];
            }else {
                arr1[i]=arr[i+1];
            }
        }

        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
