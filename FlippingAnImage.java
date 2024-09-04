import java.util.*;
public class FlippingAnImage {
    public void flippingAnImage(int image[][]){
        int first=0;
        int last =0;
        int temp=0;
        for(int i=0;i<image.length;i++){
            first = 0;
            last = image[i].length-1;  
            while(first < last){
                temp=image[i][first];
                image[i][first]=image[i][last];
                image[i][last]=temp;
                first++;
                last--;
            }
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                    System.out.print(image[i][j]+" ");
                }
                else{
                    image[i][j]=1;
                    System.out.print(image[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        FlippingAnImage fai = new FlippingAnImage();
        System.out.println("Enter the dimension m :");
        int m= sc.nextInt();
        System.out.println("Enter the dimension n :");
        int n=sc.nextInt();
        System.out.println("Enter elments into the array 0 or 1:");
        int image[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                image[i][j] = sc.nextInt();
            }
        }
        System.out.println("The original array is :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The flipped array is :");
        fai.flippingAnImage(image);
    }
}
