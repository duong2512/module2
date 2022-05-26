import java.lang.reflect.Array;

public class CaiDatThuatToanSapXepNoiBot {
   static int[]list = {2,3,5,4,7,6};
   public static void sapXepNoiBot(int[]list){
      boolean check = true;

      for (int i = 1; i < list.length && check; i++) {
         check = false ;
         for (int j = 0; j < list.length-1; j++) {
            if (list[j]>list[j+1]){
               int temp = list[j];
               list[j]=list[j+1];
               list[j+1]=temp;
               check = true;
            }
         }
      }
      for (int x:list
           ) {
         System.out.println(x);
      }
   }

   public static void main(String[] args) {
      sapXepNoiBot(list);
   }

}
