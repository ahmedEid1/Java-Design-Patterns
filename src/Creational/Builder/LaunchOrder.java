package Creational.Builder;
// implementing the Builder Pattern
public class LaunchOrder {

    public static class Builder {
        private String meat, bread, dressing, condiments;

        public Builder(){

        }

        public LaunchOrder build() {
            return new LaunchOrder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

    private final String meat, bread, dressing, condiments;

    private LaunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.dressing = builder.dressing;
        this.condiments = builder.condiments;

    }

    public String getMeat() {
        return meat;
    }

    public String getBreed() {
        return bread;
    }

    public String getDressing() {
        return dressing;
    }

    public String getCondiments() {
        return condiments;
    }

}
