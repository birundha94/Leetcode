class Solution {
    public void sortColors(int[] nums) {
        /* nums = [2,0,2,1,1,0]  
        a=2
        b=2
        c=2
        for(int i=0;i<a;i++)
        {
        arr[0]=0;
        arr[1]=0;
        }
        for(int i=2;i<a+b;i++)
        {
        arr[2]=1;
        arr[3]=1;
        }
        for(int i=a+b;i<a+b+c;i++)
        {
        arr[4]=2;
        arr[5]=2;
        }
        
        ans=[0,0,1,1,2,2]
        */
        int a=0;
        int b=0; 
        int c=0;
      
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                a++;}
            else  if(nums[i]==1){
                b++;}
            else if(nums[i]==2){
                c++;  
        }
        }   
        for(int i=0;i<a;i++)
        {
        nums[i]=0;
       
        }
        for(int i=a;i<a+b;i++)
        {
        nums[i]=1;
       
        }
        for(int i=a+b;i<n;i++)
        {
        nums[i]=2;
        
        }
        
    }
   }
