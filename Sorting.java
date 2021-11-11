 public class Sorting 
{
 public static void main(String[] args) 
	{2
	 int r=0,c=0,temp=0,ar0=0;
	 int ar[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	 for(r=0;r<15;r++)
		{
		    
		  for(c=r+1;c<15;c++)
			  {
			  
			   if(ar[r]>ar[c])
				{
				  temp=ar[r];
				  ar[r]=ar[c];
				  ar[c]=temp;
				}

			}
		}
		for(r=0;r<15;r++)
		{
          System.out.println(ar[r]);
		}
	}
}
