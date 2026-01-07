public class FractionalKnapsack {
    public static  double fractionalKnapsack(int w,int[] value ,int[] weight){
        int n=value.length;
        double[][] items=new double[n][3];
        //items[i][0] = value
        //items[i][1] = weight
        //items[i][2] = ratio(value/weight)

        for(int i=0;i<n;i++){
            items[i][0]=value[i];
            items[i][1]=weight[i];
            items[i][2]=value[i]/(double)weight[i];
        }

        java.util.Arrays.sort(items,(a,b)->Double.compare(b[0],a[0]));

        double totalValue=0.0;

        for(int i = 0;i<n&&w>0;i++){
            if(items[i][1]<=w){
                //take full item
                totalValue += items[i][0];
            }else{
                //take fractional item
                totalValue += items[i][2]*w;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int[] value={60,100,120};
        int[] weight={10,20,30};
        int w=50;
        double maxValue=fractionalKnapsack(w,value,weight);
        System.out.println("Maximum value in Knapsack = "+maxValue);
        
    }
}
