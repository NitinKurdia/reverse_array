public class ReverseArrayDemo {
        int j;
        int [] reverse(int [] nums)
        {
                int [] array=new int[nums.length];
                int j=0;
                int i;
                for(i=nums.length-1;i>=0;i--){
                array[j]=nums[i];
                 j++;}
                return array;

//                for(int j=0;j=nums.length;j++);
        }


        public static void main(String[] args) {
                ReverseArrayDemo obj = new ReverseArrayDemo();
                int []number={23,34,43,56,67,78,43,35};
                int []reverseNumber = obj.reverse(number);
                int i;
                for(i=0;i<reverseNumber.length;i++)
                System.out.println("reverse is " +reverseNumber[i]);


        }
}


