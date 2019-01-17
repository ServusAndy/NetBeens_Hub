/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davidstar;

/**
 *
 * @author andi
 */
public class DavidStar {

 
    public static void main(String[] args) {
        
        magD(19);
        System.out.println();
        magenD(70);
    }
    
    public static void magD(int s){

	int i,j;
	float f = s/2.6f;
	int k = (int)f;


	for (i = 1; i <= s ; i++){
		for(j = 1; j<= s;j++) {
			if (/*j == i || j + i == s + 1 ||*/
				(i == j + k -1 && j <= s/2) || (j + i == (s + 1)+ k-1 && j> s/2) || i == k ||
				(i == j - k + 1 && j > s/2)|| (j + i == (s + 1)- k+1 && j<=s/2) || i == s - k + 1)
			                     System.out.print("*");

		else System.out.print(" ");
		}

	System.out.print("\n");
}
System.out.print("\n\n");
}
    
    public static void magenD(int s){

	int i,j;

	int h = (int) ((int)s/2.5), d = (s - h) /2;
	float f = h/2.6f;
	int k = (int)f;

if (s >= 34){
	for (i = 1; i <= h ; i++){

		for(j = 1; j<= s;j++) {


			if (j == 1 || j  == s
				|| (i == j + k - d && i >= k && j <= (s-2)/2)
				|| (j + i == (h+ d + k ) && j>(s - 2)/2 && j <= h + d)
				|| (i == k && j < h+d && j>=d)
				|| (i == j - k - d + 1 && i <= (h-k) && j > (s-2)/2)
				|| (j + i == (h + d- k + 1) && j<=(s - 2)/2 && i <= (h - k))
				|| (i == h - k + 1  && j <= h+d && j>=d))


			System.out.print("*");
			else if ( i < k/2.6+1)
				System.out.print("*");

			else if ( i > h-k/2.6)
				System.out.print("*");
		else System.out.print(" ");
		}

	System.out.print("\n");
	}
}
else System.out.print("To low resolution!!!");
}
    
}
