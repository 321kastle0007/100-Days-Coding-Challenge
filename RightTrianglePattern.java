public class RightTrianglePattern {

    public static void main(String args[])
    {
//i for rows and j for columns and rows for no of lines
        int i, j, row=10;

        for(i=0; i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
//prints stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

