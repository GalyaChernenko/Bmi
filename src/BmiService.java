public class BmiService {
    public float calculate (float weight, float growth) {
        float growthMetr = growth / 100;
        float calBmi = weight / (growthMetr * growthMetr);


        return calBmi;
    }}
