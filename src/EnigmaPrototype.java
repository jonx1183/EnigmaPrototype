import java.util.Scanner;

public class EnigmaPrototype {

  Scanner in = new Scanner(System.in);
  int charInt =0;

  public static void main(String[] args) {
    new EnigmaPrototype().go();
  }

  public void go(){
    deMindsteDel();
  }

  public void deMindsteDel(){
    charToNumber();
    numberToChar();
  }

  public void charToNumber(){

    char input = in.next().charAt(0);

    switch (input) {

      case 'A':
        charInt = 1;
        break;
      case 'B':
        charInt = 2;
        break;
      case 'C':
        charInt = 3;
        break;
      case 'D':
        charInt = 4;
        break;
      case 'E':
        charInt = 5;
        break;
      case 'F':
        charInt = 6;
        break;
      case 'G':
        charInt = 7;
        break;
      case 'H':
        charInt = 8;
        break;
      case 'I':
        charInt = 9;
        break;
      case 'J':
        charInt = 10;
        break;
      case 'K':
        charInt = 11;
        break;
      case 'L':
        charInt = 12;
        break;
      case 'M':
        charInt = 13;
        break;
        case 'N':
        charInt = 14;
        break;
      case 'O':
        charInt = 15;
        break;
      case 'P':
        charInt = 16;
        break;
      case 'Q':
        charInt = 17;
        break;
      case 'R':
        charInt = 18;
        break;
      case 'S':
        charInt = 19;
        break;
      case 'T':
        charInt = 20;
        break;
      case 'U':
        charInt = 21;
        break;
      case 'V':
        charInt = 22;
        break;
      case 'W':
        charInt = 23;
        break;
      case 'X':
        charInt = 24;
        break;
      case 'Y':
        charInt = 25;
        break;
      case 'Z':
        charInt = 26;
        break;
      case 'Æ':
        charInt = 27;
        break;
      case 'Ø':
        charInt = 28;
        break;
      case 'Å':
        charInt = 29;
        break;
    }
  }

  public void numberToChar(){
    //int charInt;
    char IntChar ='0';
    switch (charInt) {

      case 1:
        IntChar = 'A';
        break;
      case 2:
        IntChar = 'B';
        break;
      case 3:
        IntChar = 'C';
        break;
      case 4:
        IntChar = 'D';
        break;
      case 5:
        IntChar = 'E';
        break;
      case 6:
        IntChar = 'F';
        break;
      case 7:
        IntChar = 'G';
        break;
      case 8:
        IntChar = 'H';
        break;
      case 9:
        IntChar = 'I';
        break;
      case 10:
        IntChar = 'J';
        break;
      case 11:
        IntChar = 'K';
        break;
      case 12:
        IntChar = 'L';
        break;
      case 13:
        IntChar = 'M';
        break;
      case 14:
        IntChar = 'N';
        break;
      case 15:
        IntChar= 'O';
        break;
      case 16:
        IntChar= 'P';
        break;
      case 17:
        IntChar = 'Q';
        break;
      case 18:
        IntChar= 'R';
        break;
      case 19:
        IntChar = 'S';
        break;
      case 20:
        IntChar = 'T';
        break;
      case 21:
        IntChar = 'U';
        break;
      case 22:
        IntChar = 'V';
        break;
      case 23:
        IntChar = 'W';
        break;
      case 24:
        IntChar = 'X';
        break;
      case 25:
        IntChar = 'Y';
        break;
      case 26:
        IntChar = 'Z';
        break;
      case 27:
        IntChar= 'Æ';
        break;
      case 28:
        IntChar = 'Ø';
        break;
      case 29:
        IntChar = 'Å';
        break;
    }
  }
}
