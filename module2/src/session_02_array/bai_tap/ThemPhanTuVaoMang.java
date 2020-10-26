package session_02_array.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Hãy nhập độ dài của mảng mà bạn muốn: ");
            size = scanner.nextInt();
            if(size > 20)
                System.out.println("Mảng không được lớn hơn 20");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Hãy nhập phần tử " + i + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách mảng bạn đã nhập là: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử muốn thêm vào mảng");
        int num = scanner.nextInt();
        //Nhập vị trí index cần chèn vào mảng
        System.out.println("Nhập vị trí muốn chèn vào mảng");
        int numIndex = scanner.nextInt();
        for ( int j = 0; j < array.length; j++){
            //Nếu index <= 1 và index >= array.length thì hiển thị không chèn vào mảng được
            if ( numIndex <= 1 && numIndex >= array.length-1 ){
                System.out.println("Không chèn được phần tử vào mảng");
            }
            //Tạo mảng mới, copy mảng cũ vào mảng mới, dịch chuyển mảng từ vị trí numIndex lùi về sau, gán num vào vị trí numIndex
            else {
                //Tạo mảng mới
                int[] arrayNew = new int[size + 1];
                //copy mảng cũ vào mảng mới
                for ( int k = 0; k < array.length; k++){
                    arrayNew[k] = array[k];
                }
                //Dịch chuyển từ vị trí numIndex lùi dần đén cuối mảng
                for ( int k = arrayNew.length -1  ; k >numIndex ; k--){
                    arrayNew[k] = arrayNew[k-1];
                }
                //Gán giá trị num vào vị trí numIndex
                arrayNew[numIndex] = num ;
                System.out.println(Arrays.toString(arrayNew));
                break;
            }
        }
    }
}
