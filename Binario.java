
package binario;
public class Binario {
    static int BinaryParaDecimal(int binario){
 
int decimal = 0;
    int p = 0;
    while(true){
      if(binario == 0){
        break;
      } else {
          int temp = binario%10;
          decimal += temp*Math.pow(2, p);
          binario = binario/10;
          p++;
       }
    }
      return decimal;
  }
    public static void main(String[] args) {
    System.out.println("10110101 --> "+BinaryParaDecimal(10110101));
    }}