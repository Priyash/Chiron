package base.foundation_types.interval;

public class Cardinality {
    private Multiplicity_interval interval;
    private Boolean is_ordered;
    private Boolean is_unique;

    public Cardinality(Integer low, Integer high){
        this.is_ordered = true;
        this.is_unique = false;
        interval = new Multiplicity_interval(low, high,false, false, true, true);
    }

    public Boolean get_ordered() {
        return is_ordered;
    }

    public void set_ordered(Boolean is_ordered) {
        this.is_ordered = is_ordered;
    }

    public Boolean get_unique() {
        return is_unique;
    }

    public void set_unique(Boolean is_unique) {
        this.is_unique = is_unique;
    }

    public Boolean is_Bag(){
        return !is_ordered && !is_unique;
    }

    public Boolean is_list(){
        return is_ordered && !is_unique;
    }

    public Boolean is_Set(){
        return !is_ordered && is_unique;
    }

}
