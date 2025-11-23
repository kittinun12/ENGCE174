import java.util.Scanner;

public class lab114 {

    public static String checkClick(int R, int C, char[][] map, int targetR, int targetC) {       
        if (targetR < 0 || targetR >= R || targetC < 0 || targetC >= C) {
            return "Error: Target coordinates are out of bounds.";
        }

        if (map[targetR][targetC] == '*') {
            return "Mine";
        }
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        int mineCount = 0;

        for (int i = 0; i < 8; i++) {
            int newR = targetR + dr[i];
            int newC = targetC + dc[i];
            if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                
                if (map[newR][newC] == '*') {
                    mineCount++;
                }
            }
    }
        
        
        return String.valueOf(mineCount);
}
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        
        if (!getValue.hasNextInt()) {
            System.out.println("Error: Please provide integer for R.");
            getValue.close();
            return;
        }
        int R = getValue.nextInt();
        if (!getValue.hasNextInt()) {
            System.out.println("Error: Please provide integer for C.");
            getValue.close();
            return;
        }
        int C = getValue.nextInt();
        char[][] map = new char[R][C];
        System.out.println("Enter the " + R + "x" + C + " map (* for Mine, . for empty):");
        for (int i = 0; i < R; i++) {
            if (getValue.hasNext()) {
                String row = getValue.next();
                if (row.length() != C) {
                    System.out.println("Error: Row length must be " + C);
                    getValue.close();
                    return;
                }
                map[i] = row.toCharArray();
            } else {
                System.out.println("Error: Map input incomplete.");
                getValue.close();
                return;
            }
      }
        System.out.println("Enter target coordinates R and C (0-indexed):");
        if (!getValue.hasNextInt()) {
            System.out.println("Error: Please provide integer for targetR.");
            getValue.close();
            return;
}
        int targetR = getValue.nextInt();
        
        if (!getValue.hasNextInt()) {
            System.out.println("Error: Please provide integer for targetC.");
            getValue.close();
            return;
}
        int targetC = getValue.nextInt();

        
        String result = checkClick(R, C, map, targetR, targetC);
        System.out.println("\nOutput: " + result);
    getValue.close();
}
}