public class Main{
  public static void main (String [] args){
    int[] [] ints2D = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}};
    ints2D [1] [0] = ints2D [0] [4];
    for (int r = 0; r < ints2D.length; r++) for (int c = 0; c < ints2D[r].length; c++) System.out.print (ints2D [r] [c] + " ");
    System.out.println ();
    for (int c = 0; c < ints2D[0].length; c++) for (int r = 0; r < ints2D.length; r++) System.out.print (ints2D [r] [c] + " ");
    System.out.println ("\n");
    
    double[] [] dbls2D = {{1.1, 1.2, 1.3}, {2.1, 2.2, 3.2}, {3.1, 2.3, 3.3}};
    dbls2D [1] [2] = dbls2D [2] [1];
    for (int r = 0; r < dbls2D.length; r++) for (int c = 0; c < dbls2D[r].length; c++) System.out.print (dbls2D [r] [c] + " ");
    System.out.println ();
    for (int c = 0; c < dbls2D[0].length; c++) for (int r = 0; r < dbls2D.length; r++) System.out.print (dbls2D [r] [c] + " ");
    System.out.println ("\n");
    
    boolean[] [] booles2D = {{true, true, true}, {false, true, false}, {true, true, false}};
    booles2D [0] [0] = booles2D [2] [2];
    for (int r = 0; r < booles2D.length; r++) for (int c = 0; c < booles2D[r].length; c++) System.out.print (booles2D [r] [c] + " ");
    System.out.println ();
    for (int c = 0; c < booles2D[0].length; c++) for (int r = 0; r < booles2D.length; r++) System.out.print (booles2D [r] [c] + " ");
    System.out.println ("\n");
    
    String[] [] strs2D = {{"Hello", "World", "!"}, {"It", "is", "joever"}};
    strs2D [0] [1] = strs2D [1] [2];
    for (int r = 0; r < strs2D.length; r++) for (int c = 0; c < strs2D[r].length; c++) System.out.print (strs2D [r] [c] + " ");
    System.out.println ();
    for (int c = 0; c < strs2D[0].length; c++) for (int r = 0; r < strs2D.length; r++) System.out.print (strs2D [r] [c] + " ");
    System.out.println ("\n");
    
    Pen[] [] pens2D = {{new Pen ("blue"), new Pen ("green"), new Pen ("yellow")}, {new Pen ("red"), new Pen ("black"), new Pen ("white")}};
    pens2D [0] [2] = pens2D [1] [2];
    for (int r = 0; r < pens2D.length; r++) for (int c = 0; c < pens2D[r].length; c++) System.out.print (pens2D [r] [c] + " ");
    System.out.println ();
    for (int c = 0; c < pens2D[0].length; c++) for (int r = 0; r < pens2D.length; r++) System.out.print (pens2D [r] [c] + " ");
  }
}