class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int a[]=new int[m+n];
        int i = 0 , j=0, k=0;
        while(i<m && j<n)
        {
            if(num1[i]<num2[j])
            {
                a[k]=num1[i];
                i++;
            }
            else
            {
                a[k]=num2[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            a[k]=num1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            a[k]=num2[j];
            j++;
            k++;
        }
        if((m+n)%2!=0)
        {
            return a[(m+n)/2];
        }
        else 
        {
            int x= (m+n)/2;
            double p =a[x];
            double q=a[x+1];
            return p+q/2;
        }
    }
}

//Leet code 4 hard
