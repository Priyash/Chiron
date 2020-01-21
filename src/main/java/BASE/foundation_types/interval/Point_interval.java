package BASE.foundation_types.interval;

public class Point_interval<T extends Comparable> extends Interval {
   public Point_interval(){
       super();
   }

   public Point_interval(T lower, T upper){
       super(lower, upper, false, false, true, true );
   }
}
