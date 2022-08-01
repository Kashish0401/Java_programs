import java.util.*;

public class shift_2D_Matrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LeetCode_Solutions.SinglyLinkedList.LeetCode_Solutions.SinglyLinkedList.LeetCode_Solutions.SinglyLinkedList.LeetCode_Solutions.SinglyLinkedList.LeetCode_Solutions.SinglyLinkedList.LeetCode_Solutions.SinglyLinkedList.LeetCode_Solutions.SinglyLinkedList.Solution. */
        Scanner sc=new Scanner (System.in);
        int col=sc.nextInt();
        int row=sc.nextInt();
        int grid[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                grid[i][j]=sc.nextInt();
        }

        int k=sc.nextInt();

        int temp[][] = new int[row][col];



        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {


                int indexIn1DArray = ((i * col) + j + k ) % (row * col);

                int tempRowIndex = indexIn1DArray / col;
                int tempColIndex = indexIn1DArray % col;
                temp[tempRowIndex][tempColIndex] = grid[i][j];
            }
        }


        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < col; j++) {
                list.add(temp[i][j]);
            }
            result.add(list);
        }
        System.out.println(result);
    }
}