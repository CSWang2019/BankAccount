import java.util.List;

public interface Measurable {
     float getMeasure();

     static <T extends  Measurable>float average(List<T> list){
         float sum = 0 ;
         for (int i = 0 ; i< list.size();i++) {
             sum+= list.get(i).getMeasure();
         }
         return sum/list.size();


     }
}