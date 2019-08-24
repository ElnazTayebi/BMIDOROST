package ir.greencode.bmi;

public class bmi {
    float weight;
    float height;
double calculate_bmi = 0;
    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public bmi(float weight, float height) {
        this.weight = weight;
        this.height = height;

    }
    public String bmi_result(){
        calculate_bmi = weight / (Math.pow(height,2));
        if(calculate_bmi < 1){
            calculate_bmi *= 10000;
        }
      return  String.format("%.2f", calculate_bmi);

    }

}
