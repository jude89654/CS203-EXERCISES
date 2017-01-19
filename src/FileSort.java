/*
 *   JUDE ARDYN C. BISMONTE
 *   2CSC-4
 *   LEB EXERCISE 4
 */


import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class FileSort 
{
        public static void main(String args[])
        {
            int input= Integer.parseInt(JOptionPane.showInputDialog("INPUT NO. OF MAX ITEMS"));
           
            String list[]= new String[input];
            try
            {
                  BufferedReader br = new BufferedReader(new FileReader("ioc.txt"));
                  
                  //paglagay ng laman ng notepad sa array
                  for(int w=0; w<input;w++)
                  {
                      String nabasa= br.readLine();
                      if(nabasa==null)
                      {
                          break;
                      }
                      list[w]=nabasa;
                  }

                  int x=1;
                  //printing
                  for(String w:list)
                  {
                      
                      if(w!=null)
                      {
                          System.out.println(x+" "+w);
                      }
                      else
                      {
                          break;
                      } 
                      x++;
                  }  
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
            //pagpili ng sort
            String order =JOptionPane.showInputDialog("ORDER: (A)SCENDING, (D)ESCENDING OR By (T)LENGTH").toUpperCase();
            String pagpiliNgPagsort =JOptionPane.showInputDialog("INPUT SORT TYPE: (M)ERGE SORT OR (B)UBBLE SORT").toUpperCase();
            
            if(pagpiliNgPagsort.equals("B")&&order.equals("A"))
            {
                BubbleSortAsc(list,0,list.length);
            }
            else if(pagpiliNgPagsort.equals("B")&&order.equals("D"))
            {
                BubbleSortDesc(list,0,list.length);
            }
            else if(pagpiliNgPagsort.equals("M")&&order.equals("A"))
            {
                //may -1 kasi index 
                MergeSortAsc(list,0,list.length-1);
            }
            else if(pagpiliNgPagsort.equals("M")&&order.equals("D"))
            {
                //may -1 kasi index pinaguusapan
                MergeSortDesc(list,0,list.length-1);
            }
            else if(pagpiliNgPagsort.equals("B")&&order.equals("T"))
            {
                //may -1 kasi index pinaguusapan
                
                BubbleSortDesc(list,0,list.length);
                BubbleSortLength(list,0,list.length);
            }
            else
            {
                System.out.println("Invalid input, please try again");
            }
            
            //printing
            
            System.out.println("SORTED LIST");
            int x=1;
            for(String w:list)
            {          
                if(w!=null)
                {
                   System.out.println(x+" "+w);
                }
                else
                {
                    break;
                } 
                x++;
            }  
        }
    
        public static void BubbleSortAsc(String list[],int una, int huli)
        {
             String temp="";
             for(int i=0; i < huli; i++)
             {
                for(int j=1; j < huli-i; j++)
                {
                    if(list[j-1].compareTo( list[j])>0)
                    {
                        temp=list[j-1];
                        list[j-1] = list[j];
                        list[j] = temp;
                    }
                }
             }     
        }
        
        public static void BubbleSortDesc(String list[],int una, int huli)
        {
             String temp="";
             for(int i=0; i < huli; i++)
             {
                for(int j=1; j < huli-i; j++)
                {
                    if(list[j-1].compareTo(list[j])<0)
                    {
                        temp=list[j-1];
                        list[j-1] = list[j];
                        list[j] = temp;
                    }
                }
             }     
        }
        
        public static void BubbleSortLength(String list[],int una, int huli)
        {
             String temp="";
             for(int i=0; i < huli; i++)
             {
                for(int j=1; j < huli-i; j++)
                {
                    if(list[j-1].length()>list[j].length())
                    {
                        temp=list[j-1];
                        list[j-1] = list[j];
                        list[j] = temp;
                    }
                }
             }     
        }

    private static void MergeSortAsc(String list[], int una , int huli)
	{   
            String muna[]=new String[list.length];
		
                if( una < huli )
		{
			int hati = (una + huli) / 2;
			MergeSortAsc(list, una, hati);
			MergeSortAsc(list, hati + 1, huli);
			mergeAsc(list, muna, una, hati + 1, huli);
		}
	}
    private static void mergeAsc(String list[], String muna[], int una, int hati, int huli )
    {
        int leftEnd = hati - 1;
        int k = una;
        int num = huli - una + 1;

        while(una <= leftEnd && hati <= huli)
            if(list[una].compareTo(list[hati]) < 0)
            {
                muna[k++] = list[una++];
            }
            else
            {
                muna[k++] = list[hati++];
            }

        while(una <= leftEnd)
        {
            muna[k++] = list[una++];
        }
        while(hati <= huli)
        {
            muna[k++] = list[hati++];
        }
        for(int i = 0; i < num; i++, huli--)
        {
            list[huli] = muna[huli];
        }
    }
    public static void MergeSortDesc(String list[], int una , int huli)
	{   
            String muna[]=new String[list.length];
		
                if( una < huli )
		{
			int hati = (una + huli) / 2;
			MergeSortDesc(list, una, hati);
			MergeSortDesc(list, hati + 1, huli);
			mergeDesc(list, muna, una, hati + 1, huli);
		}
	}
    
    public static void mergeDesc(String list[], String muna[], int una, int hati, int hulinghuli )
    {
        int unanghuli = hati - 1;
        int k = una;
        int num = hulinghuli - una + 1;

        while(una <= unanghuli && hati <= hulinghuli)
            if(list[una].compareTo(list[hati]) > 0)
            {
                muna[k++] = list[una++];
            }
            else
            {
                muna[k++] = list[hati++];
            }

        while(una <= unanghuli)
        {
            muna[k++] = list[una++];
        }
        while(hati <= hulinghuli)
        {
            muna[k++] = list[hati++];
        }
        for(int i = 0; i < num; i++, hulinghuli--)
        {
            list[hulinghuli] = muna[hulinghuli];
        }
    }
}
