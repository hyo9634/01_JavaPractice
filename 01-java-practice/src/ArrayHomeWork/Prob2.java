package ArrayHomeWork;

public class Prob2 {

  public int[] generateRanDom(){
    int[] array = new int[10];
    for(int i = 0 ; i < 10 ; i++){
      array[i] = (int)(Math.random()*30+1);
    }
    return array;
  }

  public int getMAxnum(int[] a) {
    int max = 0;
    for(int i =0 ; a.length > i ; i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Prob2 prob = new Prob2();
    int[] t = prob.generateRanDom();
    System.out.println("<<생성된 난수>>");
    for(int i = 0;i<t.length;i++){
      System.out.print(t[i] + ", ");
    }
    System.out.println("\n===================");
    int s = prob.getMAxnum(t);
    System.out.println("큰 숫자 : " + s);

  }

}
