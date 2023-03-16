/*
PROGRAM BY VISHAL NAGAMALLA:

THE CODE WILL ASK TO INPUT A N VALUE, ONCE INPUTTED INTO THE TERMINAL IT WILL PROCCESS THROUGH THE CODE AND SEE IF IT IS A PRIME NUMBER OR NOT. IF PRIME, THEN IT WILL PRINT A SQUARE, IF COMPOSITE, IT WILL PRINT A CHRISTMAS TREE. ALL CODE IS DONE THROUGH A FUNCTION NAMED evergreenPrinter(). IF N NUMBER IS TOO LARGE INCREASE THE WIDTH OF THE TERMINAL USING THE SLIDER PROVIDED.
*/
import java.util.Scanner;

class Codivate_Challenge {
  public static void main(String[] args) {
    evergreenPrinter();
  }

  public static void evergreenPrinter() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N Value --> ");
    int n = input.nextInt();
    int x = 0;
    int i,j,a = 0;
    int count = 0;

    char[][] arrSquare = new char[n][n];
    for(i = 0; i <= n-1; i++){
      for(j = 0; j <= n-1; j++){
        arrSquare[i][j] = ' ';
      }
    }

    for(i = 2; i < n; i++){
      if(n%i == 0){
        x++;
      }
    }

    if(x > 0){
      //Draw Christmas Tree
      for (i = 1; i <= n; i++) {
        for (j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (a = 1; a <= (i * 2) - 1; a++) {
          if(count%2 == 0){
            System.out.print('*');
          }
          else{
            System.out.print('#');
          }
          count++;
        }

        System.out.println("");
      }
    }

    else{
      //Draw Square
      i = 0; //Top
      for(j = 0; j <= n-1; j++){
        if(count%2 == 0){
          arrSquare[i][j] = '*';
        }
        else{
          arrSquare[i][j] = '#';
        }
        count++;
      }
      j = n-1;//Right
      for(i = 1; i <= n-1; i++){
        if(count%2 == 0){
          arrSquare[i][j] = '*';
        }
        else{
          arrSquare[i][j] = '#';
        }
        count++;
      }
      i = n-1;//Bottom
      for(j = n-2; j >= 0; j--){
        if(count%2 == 0){
          arrSquare[i][j] = '*';
        }
        else{
          arrSquare[i][j] = '#';
        }
        count++;
      }
      j = 0;//Left
      for(i = n-2; i >= 1; i--){
        if(count%2 == 0){
          arrSquare[i][j] = '*';
        }
        else{
          arrSquare[i][j] = '#';
        }
        count++;
      }

      for(i = 0; i <= n-1; i++){
        for(j = 0; j <= n-1; j++){
          System.out.print(arrSquare[i][j]);
        }

        System.out.println("");
      }
    }
  }
}