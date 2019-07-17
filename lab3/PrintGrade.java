public class PrintGrade {

    public static void main(String[] args){

    	int YourGrade = Integer.parseInt(args[0]);

        
        if (100 >= YourGrade && YourGrade >= 90){
	System.out.println("A");
        }
        else if (90 > YourGrade && YourGrade >= 80){
	System.out.println("B");
        }
        else if (80 > YourGrade && YourGrade >= 70){
	System.out.println("C");
        }
        else if (70 > YourGrade && YourGrade >= 60){
	System.out.println("D");
        }
        else 
        System.out.println("F");

    }
} 



    
