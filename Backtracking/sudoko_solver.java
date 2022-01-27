class Solution
{
    //Function to find a solved Sudoku. 
    static boolean isSafe(int i,int j,int k,int grid[][])
    {
        for(int x=0;x<9;x++)
        {
            if(grid[i][x]==k || grid[x][j]==k)
             {
                 return false;
             }
        }
        
        int rs=i-i%3;
        int cs=j-j%3;
    for(int x=0;x<3;x++)
    {
        for(int y=0;y<3;y++)
        {
            if(grid[x+rs][y+cs]==k)
            {
                return false;
            }
        }
    }
        return true;
    }
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        //int row=0;
        //int col=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int k=1;k<=9;k++)
                   {
                  if(isSafe(i,j,k,grid))
                     {
                      grid[i][j]=k;
                   if(SolveSudoku(grid)==true)
                     return true;
                     else
                     grid[i][j]=0;
                   }
                  }
                  return false;
                  //bactracking
                 }
              }
        }
        return true;
        
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            //System.out.println();
            
        }
    }
}
