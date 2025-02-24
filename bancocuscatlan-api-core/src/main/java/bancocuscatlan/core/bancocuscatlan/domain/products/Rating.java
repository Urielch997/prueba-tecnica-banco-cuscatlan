package bancocuscatlan.core.bancocuscatlan.domain.products;

import java.math.BigDecimal;

public class Rating {
    private BigDecimal rate;
    private Long count;

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Rating(Long count, BigDecimal rate) {
        this.count = count;
        this.rate = rate;
    }

    public Rating() {
    }

    private Rating(RatingBuilder builder){
        this.rate = builder.rate;
        this.count = builder.count;
    }


    public static class RatingBuilder{
        private BigDecimal rate;
        private Long count;

        public RatingBuilder rate(BigDecimal rate){
            this.rate = rate;
            return this;
        }

        public RatingBuilder count(Long count){
            this.count = count;
            return this;
        }

        public Rating build(){
            return new Rating(this);
        }
    }

    public static RatingBuilder builder(){
        return new RatingBuilder();
    }


}
