import java.io.*;

public class Plan3dim{
	public static void main(String[] args){
		int t3[][][] = new int [3][4][5];//z y x
		int rand, cptx1=0, cptx2=0, cptx3=0, cpty1=0, cpty2=0, cpty3=0, i, j, k,l=0;
		boolean p1=true, p2=true, p3=true;
		
		while(p1 || p2 || p3){
			rand = (int)(Math.random()*300);
			System.out.println(rand);
			//methode 1 (by Merlet)
			if(p1)
				if(rand>=0 && rand <100)
				{
					t3[0][cpty1][cptx1] = rand;
					cptx1++;
					if(cptx1==5){
						cptx1=0;
						cpty1++;
						if(cpty1==4) p1=false;
					}
				}
			//methode 2 (by Ponelle, edit Merlet)
			if(p2)if(rand>=100 && rand <200){
				t3[1][cpty2][cptx2] = rand;
				if(cptx2==4){
					cptx2=0;
					cpty2++;
				}
				else cptx2++;
				if(cpty2==4) p2=false;
			}
			if(p3)				
				if(rand>=200 && rand <300)
				{
					t3[2][cpty3][cptx3] = rand;
					cptx3++;
					if(cptx3==5){
						cptx3=0;
						cpty3++;
						if(cpty3==4) p3=false;
					}
				}
			l++;
		}
		
		for(i=0; i<3; i++){
			for(j=0; j<4; j++){
				for(k=0; k<5; k++){
					System.out.println("Tab["+i+"]["+j+"]["+k+"] = "+t3[i][j][k]);
				}
			}
		}
		System.out.println("Nombre de tirages : "+l);
	}	
}

/*
			//methode 3 (by Ponelle, not working)
			if(p3)if(rand>=200 && rand <300){
				t3[2][cpty3][cptx3] = rand;
				if(cptx3==4){
					cptx3=0;
					cpty3++;
				}
				if(cptx3<4)  cptx3++;
				if(cpty3==4) p3=false;
			}
			
			*/

