public class dayYears{
  public static void main(String[]arg){
    int days = 2642, years, weeks;

    years = days / 365 ;
    weeks = years * 365 / 7 ;
    days = years * 365 ;

    System.out.println("���: " + years);
    System.out.println("������: " + weeks);
    System.out.println("����: " + days);
  }
}