/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package group2;

/**
 *
 * @author jarek
 */
public class GROUP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("GROUP2");
     for (int i=0; i<34; i++){
         for (int j=0; j<56; j++){
             if (
                //head     
                i==5 && (j>6 && j<10 ) ||     
                i==6 && (j>6 && j<10 ) || 
                i==7 && (j>6 && j<10 ) ||
                i==5 && (j>8 && j<12 ) ||     
                i==6 && (j>9 && j<12 ) ||
                //upper head     
                i==4 && (j>11 && j<23 ) ||     
                i==5 && (j>11 && j<26 ) ||
                //bottom  head
                i==6 && (j>23 && j<28 ) ||     
                i==7 && (j>25 && j<28 ) || 
                
                     //bottom
                     
                i==26 && (j>6 && j<10 ) ||
                i==27 && (j>6 && j<12 ) ||     
                i==28 && (j>6 && j<26 ) ||     
                i==29 && (j>11 && j<23 ) ||     
                i==27 && (j>21 && j<28 ) ||
                i==26 && (j>23 && j<27 ) || 
                     
                //2
                  i==4 && (j>34 && j<46 ) ||    
                  i==5 && (j>32 && j<49 ) ||   
                  i==6 && (j>30 && j<36 ) ||        
                  i==7 && (j>30 && j<34 ) ||
                  i==6 && (j>44 && j<52 ) ||
                  i==7 && (j>45 && j<52 ) ||
                  i==8 && (j>45 && j<52 ) ||
                  i==9 && (j>45 && j<52 ) ||
                  i==10 && (j>45 && j<52 ) || 
                  i==11 && (j>45 && j<52 ) || 
                  i==12 && (j>45 && j<52 ) || 
                  i==13 && (j>45 && j<52 ) || 
                  i==14 && (j>44 && j<51 ) ||    
                  i==15 && (j>43 && j<50 ) ||    
                  i==16 && (j>42 && j<49 ) || 
                  i==17 && (j>41 && j<48 ) || 
                  i==18 && (j>40 && j<47 ) ||
                  i==19 && (j>39 && j<46 ) ||
                  i==20 && (j>38 && j<45 ) ||
                  i==21 && (j>37 && j<44 ) ||
                  i==22 && (j>36 && j<43 ) ||
                  i==23 && (j>35 && j<42 ) ||   

                     
                     
                     
                     
                     

//bottom 2
                  i==24 && (j>34 && j<41 ) ||   
   
                  i==25 && (j>32 && j<40 ) ||   
                  i==26 && (j>30 && j<39 ) ||   
                  i==27 && (j>30 && j<40 ) ||
                  i==28 && (j>30 && j<51 ) ||   
                  i==29 && (j>30 && j<52 ) ||   
               
               //space      
                   
                     
                i==0 && (j>0 && j<55 ) ||
                i==33 && (j>0 && j<55 ) ||
                (j==0 && (i>0 && i<33) ||
                (j==55 && (i>0 && i<33)) ||
                     
                   //body  
                (j==4 && (i>5 && i<28)) ||
                (j==5 && (i>5 && i<28)) ||
                (j==6 && (i>5 && i<28)) ||
                (j==27 && (i>17 && i<28)) ||
                (j==26 && (i>17 && i<28)) || 
                 (j==25 && (i>17 && i<28)) ||
                
//middle                     
                 i==17 && (j>15 && j<27 ) ||
                 i==16 && (j>15 && j<27 )    
                     
                     
                     
                     ))
             //option 
             
             
             
             
             
             {
                 System.out.print("*");
                 
             }else{
                 System.out.print(" ");
                 
             }
                 
         }
         System.out.println();
                 
                 }
             
     }
	
	
    
    
}
