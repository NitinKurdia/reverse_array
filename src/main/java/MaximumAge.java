public class MaximumAge {
    void getMaxAge(int [] age)
    {
        int i;
        int max=age[0];//age[0]=23
        for( i=1;i<age.length;i++)
           if(age[i]>max)//age[1]>23
               max=age[i];
        System.out.println("Maximum age is" +max);
    }


    public static void main(String[] args) {
        MaximumAge obj = new MaximumAge();
        int []age= {23, 34, 33, 24, 25, 26, 31};
        obj.getMaxAge(age);


    }
}

