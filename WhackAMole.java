
import java.util.*;

import java.io.Console;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Scanner;

import java.util.InputMismatchException;

import java.util.Random; // class in order to randomly place the moles. 

import java.io.IOException;

public class WhackAMole
{
	
	//
	
	 int scope; // integer instance variable
	
	 int molesLeft; // integer instance variable
	
	 int attemptsLeft; // integer instance variable
	
	 char [][] moleGrid ; // 2-dimensional array of chars. 
						    // " Begin by creating a 10 by 10 grid where you randomly place the moles ".  
	
	//
	
	 int x=0;
	
	 int y=0;
	
	 char [][] GamEmoleGrid ; 
	
	//
	
	
	
	//
	
	WhackAMole(int numAttempts, int gridDimension) 
	// Constructor for the game, specifies total number of whacks allowed, and the grid dimension.
	{
		
		// Scanner sc = new Scanner(System.in); //  public scanner class 
		
		Random random = new Random(); // make a new instance of the random class 
		
		int [] molesPositions=new int[gridDimension]; // carries the moles positions in the Grid Table
		
		for(int i=0;i<molesPositions.length;i++) // add the zero value to each element of the molesPositions array
		{
			
			molesPositions[i]=0;
			
		//	System.out.print(molesPositions[i]);
			
		}
		
				System.out.println("\n\n");
		
		//
		// Random generate the moles positions on the grid table and add them to the molesPositions array
		
		for(int i=0;i<molesPositions.length;i++)
		{
			
			molesPositions[i]=(int)(Math.random()*99 + 1); 
			
		//	System.out.print(molesPositions[i]+" ");
			
		}
		
				System.out.println("\n\n");
		
		//
		// look if two or more cells in the molesPositions array
		// have stored the same number ,  and replace it with a new one. 
				
		for(int i=0;i<molesPositions.length;i++)
		{
			
		for(int j=0;j<molesPositions.length;j++)
		{
			 if( ( molesPositions[i] == molesPositions[j] ) && ( j != i ) )
			{
			molesPositions[i]=(int)(Math.random()*99 + 1); 
			}
		         else
			 {
				 // do nothing .........
			 }
		}
			
		}
		
		//
		
		System.out.println("\n\n");
		
		for(int i=0;i<molesPositions.length;i++)
		{
			
		//	System.out.print(molesPositions[i]+" ");
			
		}
		
		//
		
		moleGrid= new char[gridDimension][gridDimension];
		
		//
		
		GamEmoleGrid= new char[gridDimension][gridDimension];
		
		//
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
	for(int j=0;j<moleGrid.length;j++)
	{
		
	moleGrid[i][j]='-';
		
		GamEmoleGrid[i][j]='-';
		
	}
		
	}
		
		//
		// place to the moleGrid array, the placements of the moles, according to the values of the molesPositions array ... 
		
		for(int i=0;i<moleGrid.length;i++)
		{
			
			if(molesPositions[i] >=0 && molesPositions[i]<10)
			{
				
				moleGrid[i][molesPositions[i]]='M';
				
			}
		        else if(molesPositions[i] >=10 && molesPositions[i]<20)
			{
				
				moleGrid[i][molesPositions[i]-10]='M';
				
			}
			else if(molesPositions[i] >=20 && molesPositions[i]<30)
			{
				
				moleGrid[i][molesPositions[i]-20]='M';
				
			}
			else if(molesPositions[i] >=30 && molesPositions[i]<40)
			{
				
				moleGrid[i][molesPositions[i]-30]='M';
				
			}
			else if(molesPositions[i] >=40 && molesPositions[i]<50)
			{
				
				moleGrid[i][molesPositions[i]-40]='M';
				
			}
			else if(molesPositions[i] >=50 && molesPositions[i]<60)
			{
				
				moleGrid[i][molesPositions[i]-50]='M';
				
			}
			else if(molesPositions[i] >=60 && molesPositions[i]<70)
			{
				
				moleGrid[i][molesPositions[i]-60]='M';
				
			}
			else if(molesPositions[i] >=70 && molesPositions[i]<80)
			{

				moleGrid[i][molesPositions[i]-70]='M';
				
			}
			else if(molesPositions[i] >=80 && molesPositions[i]<90)
			{
				
				moleGrid[i][molesPositions[i]-80]='M';
				
			}
			else if(molesPositions[i] >=90 && molesPositions[i]<99)
			{
				
				moleGrid[i][molesPositions[i]-90]='M';
				
			}
			else
			{
				
				// do nothing ...... 
				
			}
			
		}
		
		//
		
		System.out.println("\n\n");
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
	for(int j=0;j<moleGrid.length;j++)
	{
		
	  //         System.out.print(moleGrid[i][j]);
		
	}
	
	System.out.println("");
		
	}
	
	System.out.println("\n\n");
		
		//
		
		gameInstructions(); // call gameInstructions method 
	
	//
	
	//
	// the game engine ....
	// the place of the program where the game calulations will take place ....... 
	
		molesLeft=10; // integer instance variable
	
	attemptsLeft=numAttempts;
	
	//
	
	while(attemptsLeft>0)
	{
		
		//
		
		whack(x,y);
		
		//
		
	}
	
	//
	
	 x=0;
	
	 y=0;
	
	//
		
	}
	
	//
	// olean place(int x, int y) not used by the program .......     
	
	boolean place(int x, int y) 
	// Given a location, place a mole at that location. Return true if you can. (Also update number of moles left.)            
	{
		
		return false || true;
		
	}
	
	//

void whack(int x, int y)
// Given a location, take a whack at that location. 
//If that location contains a mole, the score, number of attemptsLeft, and molesLeft is updated. 
//If that location does not contain a mole, only attemptsLeft is updated.
{

	//
	
	 Scanner sc = new Scanner(System.in); //  public scanner class
	
	//
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	do{		
	
		try
		{
		
			System.out.print("please choose an integer between : -1 and 9 , as an x coordinate : ");
			
                             x=sc.nextInt();
			
			System.out.println("\n\n");
			
		}
				catch(InputMismatchException ime)
				{
					
					ime.printStackTrace();
					
				}
		
	}while(x<-1 || x>9);
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	do{		
	
		try
		{
		
			System.out.print("please choose an integer between : -1 and 9 , as an y coordinate : ");
			
                        y=sc.nextInt();
		
			System.out.println("\n\n");
				
		}
				catch(InputMismatchException ime2)
				{
					
					ime2.printStackTrace();
					
				}
		
	}while(y<-1 || y>9);
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// x=-1 and y=-1 case ; termiantion of the game case .....
	
	if( x==-1 && y==-1 )
	{
			
	System.out.println("Player is giving up !!!");
		
		System.out.println(" \n  The player  have lost the game  \n Moles Left on the game : "+molesLeft+" ::: Attempts Left : "+attemptsLeft+"  \n ");
			
	System.out.println("\n\n *** Whack A Mole Game Grid Table *** \n\n");
	
                  printGrid();
		
	System.out.println("\n\n");
			
			System.exit(1);
			
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	if( x!=-1 && y==-1 )
	{
		
			do{		
	
		try
		{
		
			System.out.print("please choose an integer between : -1 and 9 , as an x coordinate : ");
			
                             y=sc.nextInt();
			
			System.out.println("\n\n");
			
		}
				catch(InputMismatchException ime)
				{
					
					ime.printStackTrace();
					
				}
		
	}while(y<0 || y>9);
	
		
	}
	else if( x==-1 && y!=-1 )
	{
		
			do{		
	
		try
		{
		
			System.out.print("please choose an integer between : -1 and 9 , as an x coordinate : ");
			
                             x=sc.nextInt();
			
			System.out.println("\n\n");
			
		}
				catch(InputMismatchException ime)
				{
					
					ime.printStackTrace();
					
				}
		
	}while(x<0 || x>9);
	
		
	}
	
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
		// place the x-y coordinates
		
		
		if(moleGrid[x][y]=='M')
		{
			
	moleGrid[x][y]='W';
		
		GamEmoleGrid[x][y]='W';
			
			molesLeft--;
			
		}
		else
		{
			
			moleGrid[x][y]='*';
		
		GamEmoleGrid[x][y]='*';
			
		}
		
		// decrease the attemptsLeft integer ...
		//
		attemptsLeft--;
		//
		//
		
		printGridToUser();
		
		//
		
		System.out.println(" \n Moles Left on the game : "+molesLeft+" ::: Attempts Left : "+attemptsLeft+"  \n ");
		
			//
		
		if( attemptsLeft!=0 && molesLeft==0 )
		{
			
			System.out.println(" \n  The player  have won the game  \n Moles Left on the game : "+molesLeft+" ::: Attempts Left : "+attemptsLeft+"  \n ");
			
			printGrid();
			
			System.exit(0);
			
		}
		else if(attemptsLeft==0)
		{
			
			System.out.println(" \n  The player  have lost the game  \n Moles Left on the game : "+molesLeft+" ::: Attempts Left : "+attemptsLeft+"  \n ");
			
			printGrid();
			
			System.exit(1);
			
		}
	
	 x=0;
	
	 y=0;
	
	//
	
}

	//

 void printGridToUser() 
//Print the grid without showing where the moles are. 
//For every spot that has recorded a "whacked mole," print out a W, or * otherwise.
{
	
	
	System.out.println("\n\n *** Whack A Mole Game Grid Table *** \n\n");
	
	int count=0;
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
		System.out.print(" Row : "+(i)+" -> ");
		
	for(int j=0;j<moleGrid.length;j++)
	{
				
	System.out.print(count+" : "+GamEmoleGrid[i][j]+" | ");
		
	count++;
		
	}
	
	System.out.println("");
	
		count=0;
	
	}
		
	System.out.println("\n\n");
	
	
}

//

void printGrid() 
// Print the grid completely. 
//This is effectively dumping the 2d array on the screen. 
//The places where the moles are should be printed as an 'M'. 
//The places where the moles have been whacked should be printed as a 'W'. 
//The places that don't have a mole should be printed as *.
{	

System.out.println("\n\n *** Whack A Mole Game Grid Table *** \n\n");
	
	int count=0;
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
		System.out.print(" Row : "+(i)+" -> ");
		
	for(int j=0;j<moleGrid.length;j++)
	{
				
	System.out.print(count+" : "+moleGrid[i][j]+" | ");
		
	count++;
		
	}
	
	System.out.println("");
	
		count=0;
	
	}
		
	System.out.println("\n\n");
	
}

//

void gameInstructions() 
// Prints on the cmd window, the Whack-A-Mole game instructions.
{	

System.out.println(" \n Welcome to the Whack-A-Mole game \n \n "+
" The game is based on the Whack-A-Mole game. \n \n " + 
	"  The game presents a 10 X 10 Grid table. \n \n  " +
	" You have 50 attemps, in order for you to find all the Moles in the game. \n  \n" +
	"The total number of Moles in any game is 10. \n\n" +
	" You have to enter the x and y coordinates, \n\n " + 
         " of where you would like to take a whack in the Whack-A-Mole game, Grid Table. \n\n " +
" At any point in the game, you can input coordinates of : X= -1 and Y= -1 , in order to indicate that you are giving up. \n\n"+
" If the user gives up they get to see the entire grid. \n\n"+ 
" The game ends if the user is able to uncover all the moles or if the user runs out of attempts. \n\n" +
" Sample Whack-A-Mole game table :  "	);
	
	for(int i=0;i<moleGrid.length;i++)
	{
		
	for(int j=0;j<moleGrid.length;j++)
	{
		
	GamEmoleGrid[i][j]='-';
		
	}
		
	}
	
	
	System.out.println("\n\n *** Whack A Mole Game Grid Table *** \n\n");
	
	int count=0;
		
	for(int i=0;i<moleGrid.length;i++)
	{
		
		System.out.print(" Row : "+(i)+" -> ");
		
	for(int j=0;j<moleGrid.length;j++)
	{
				
	System.out.print(count+" : "+GamEmoleGrid[i][j]+" | ");
		
	count++;
		
	}
	
	System.out.println("");
	
		count=0;
	
	}
		
	System.out.println("\n\n");
	
	
}

//

/**
Putting it all together - main method
In order to play this game you need to create a main method. 
Begin by creating a 10 by 10 grid where you randomly place the moles. 
Place a total of 10 moles.
Now allow the user (remember how to use Scanner?) to enter the x and y coordinates,
of where they would like to take a whack. 
Tell them they have a maximum of 50 attempts to get all the moles. 
At any point in the game, they can input coordinates of -1, -1 in order to indicate that they are giving up. 
If the user gives up they get to see the entire grid.  
The game ends if the user is able to uncover all the moles or if the user runs out of attempts. 
*/

	public static void main(String [] WhackAMoleGameInJava)
	{
	
	
			
	new WhackAMole(50,10);
		
		
		
	}
	
	//
	
}
